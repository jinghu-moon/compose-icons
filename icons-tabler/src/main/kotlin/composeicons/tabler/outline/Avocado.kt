package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = tablerOutlineIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.8 14.04c.21-.818 .679-1.546 1.337-2.075C20.332 10.98 20.953 9.68 21 8.063 20.953 6.633 20.46 5.437 19.523 4.477 18.563 3.539 17.367 3.047 15.938 3c-1.618 .047-2.918 .668-3.903 1.863-.562 .68-1.254 1.125-2.074 1.336-.938 .188-1.828 .48-2.672 .88C6.445 7.477 5.73 7.957 5.145 8.519 3.715 10.02 3 11.743 3 13.688c0 1.946 .715 3.668 2.145 5.168C6.645 20.285 8.367 21 10.313 21c1.945 0 3.667-.715 5.167-2.145 .563-.585 1.055-1.3 1.477-2.144 .398-.844 .68-1.723 .844-2.637v-.035l-.001 .001")
            addPathData("M10.87 10.036c-.942 .112-1.794 .538-2.556 1.278-.74 .762-1.166 1.614-1.278 2.556-.135 .92 .112 1.704 .74 2.354 .65 .628 1.435 .875 2.354 .74 .942-.112 1.794-.538 2.556-1.278 .74-.762 1.166-1.614 1.278-2.556 .135-.92-.112-1.704-.74-2.354-.65-.628-1.435-.875-2.354-.74")
        }
        return _avocado!!
    }

private var _avocado: ImageVector? = null
