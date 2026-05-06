package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = tablerOutlineIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M19 12v7c.097 .775-.322 1.522-1.034 1.844-.712 .321-1.549 .142-2.066-.444-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.313 .4-.792 .634-1.3 .634-.508 0-.987-.234-1.3-.634-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.517 .585-1.355 .765-2.066 .444C5.322 20.522 4.903 19.775 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v4.25")
        }
        return _invoice!!
    }

private var _invoice: ImageVector? = null
