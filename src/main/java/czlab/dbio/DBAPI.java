/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2013-2016, Kenneth Leung. All rights reserved. */

package czlab.dbio;
//////////////////////////////////////////////////////////////////////////////
//
import java.sql.Connection;

/**
 * A sql database interface.
 *
 * @author Kenneth Leung
 */
public interface DBAPI {

  /**
   * All operations are done within a transaction.
   */
  public Transactable newCompositeSQLr();

  /**
   * Auto commits on each operation.
   */
  public SQLr newSimpleSQLr();

  /**
   * Metadata related to the database.
   */
  public Schema getMetas();

  /**
   * Product information.
   */
  public Object vendor();

  /**
   * Make a connection to the database.
   */
  public Connection open();

  public void finz();
}



