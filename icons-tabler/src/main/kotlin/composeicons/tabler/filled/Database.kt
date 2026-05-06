package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = tablerFilledIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 15.731C4.968 17.238 8.234 18 12 18c3.76 0 7.025-.76 9-2.252v2.252c0 2.425-3.895 3.936-8.693 3.998L12 22C7.062 22 3 20.477 3 18Z")
            addPathData("M3 9.731C4.968 11.238 8.234 12 12 12c3.76 0 7.025-.76 9-2.252v2.252c0 2.477-4.062 4-9 4C7.202 16 3.23 14.562 3.021 12.205l-.016-.101L3 12Z")
            addPathData("M12 2c1.041 0 2.044 .068 2.977 .198l.469 .071q.84 .14 1.586 .348l.44 .131 .075 .024c.272 .089 .541 .19 .805 .3l.199 .086q.535 .242 .967 .53 .165 .11 .313 .225c.25 .194 .475 .418 .669 .668l.091 .128q.07 .105 .129 .211l.07 .139q.163 .35 .2 .73L21 6c0 2.477-4.062 4-9 4C7.202 10 3.23 8.562 3.021 6.205 3.007 6.138 3 6.069 3 6l.005-.104 .016-.1C3.226 3.49 7.031 2.063 11.688 2.002Z")
        }
        return _database!!
    }

private var _database: ImageVector? = null
