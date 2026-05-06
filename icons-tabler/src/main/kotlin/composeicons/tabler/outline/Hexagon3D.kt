package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hexagon3D: ImageVector
    get() {
        if (_hexagon3D != null) return _hexagon3D!!
        _hexagon3D = tablerOutlineIcon(
            name = "Hexagon3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 6.844c.624 .362 1.006 1.031 1 1.752v6.555c0 .728-.394 1.399-1.03 1.753l-6 3.844c-.604 .335-1.338 .335-1.942 0l-6-3.844C4.393 16.55 3.999 15.879 3.999 15.152v-6.556c0-.729 .394-1.4 1.029-1.753l6-3.583c.621-.347 1.379-.347 2 0l6 3.584h-.03 .002")
            addPathData("M12 16.5v4.5")
            addPathData("M4.5 7.5 8 10")
            addPathData("M16 10 20 7.5")
            addPathData("M12 7.5v4.5L8 14")
            addPathData("M12 12l4 2")
            addPathData("M12 16.5 16 14v-4L12 7.5 8 10v4l4 2.5")
        }
        return _hexagon3D!!
    }

private var _hexagon3D: ImageVector? = null
