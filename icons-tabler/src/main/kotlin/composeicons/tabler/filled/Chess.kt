package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerFilledIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c2.209 0 4 1.791 4 4-.007 .69-.156 1.371-.438 2.001L16 8c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 10h-1.263l1.24 5.79c.115 .532-.217 1.059-.747 1.184l-.113 .02L15 17h-6c-.281 0-.55-.118-.739-.326-.19-.208-.283-.486-.257-.767l.018-.117L9.262 10h-1.262C7.471 9.999 7.034 9.587 7.003 9.059c-.031-.528 .355-.989 .88-1.052L8 8h.438C8.223 7.516 8.084 7.001 8.026 6.475L8.006 6.216 8 6C8 3.791 9.791 2 12 2Z")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chess!!
    }

private var _chess: ImageVector? = null
