package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LoadBalancer: ImageVector
    get() {
        if (_loadBalancer != null) return _loadBalancer!!
        _loadBalancer = tablerOutlineIcon(
            name = "LoadBalancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M11 20c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M12 16v3")
            addPathData("M12 10v-7")
            addPathData("M9 6 12 3l3 3")
            addPathData("M12 10v-7")
            addPathData("M9 6 12 3l3 3")
            addPathData("M14.894 12.227l6.11-2.224")
            addPathData("M17.159 8.21l3.845 1.793-1.793 3.845")
            addPathData("M9.101 12.214 3.026 10.003")
            addPathData("M6.871 8.21 3.026 10.003l1.793 3.845")
        }
        return _loadBalancer!!
    }

private var _loadBalancer: ImageVector? = null
