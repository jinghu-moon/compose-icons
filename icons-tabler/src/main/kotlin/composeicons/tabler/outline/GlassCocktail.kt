package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GlassCocktail: ImageVector
    get() {
        if (_glassCocktail != null) return _glassCocktail!!
        _glassCocktail = tablerOutlineIcon(
            name = "GlassCocktail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 15v6")
            addPathData("M5 5c0 1.105 3.134 2 7 2 3.866 0 7-.895 7-2C19 3.895 15.866 3 12 3 8.134 3 5 3.895 5 5")
            addPathData("M5 5v.388c0 .432 .126 .853 .362 1.206l5 7.509c.633 .951 1.88 1.183 2.785 .517 .191-.141 .358-.316 .491-.517L18.638 6.594C18.874 6.241 19 5.82 19 5.388v-.388")
        }
        return _glassCocktail!!
    }

private var _glassCocktail: ImageVector? = null
