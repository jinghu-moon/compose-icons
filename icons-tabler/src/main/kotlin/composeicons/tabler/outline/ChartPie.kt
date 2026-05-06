package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerOutlineIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 3.2C5.67 4.204 2.721 8.218 3.058 12.65c.337 4.432 3.859 7.954 8.291 8.291 4.432 .337 8.446-2.612 9.45-6.942 0-.552-.448-1-1-1h-6.8c-1.105 0-2-.895-2-2v-7c-.025-.239-.145-.459-.333-.609C10.479 3.241 10.239 3.172 10 3.2")
            addPathData("M15 3.5c2.572 .906 4.594 2.928 5.5 5.5h-4.5C15.448 9 15 8.552 15 8v-4.5")
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
