package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = tablerOutlineIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M13 17.5v4.5l2-1.5L17 22v-4.5")
            addPathData("M10 19h-5C3.895 19 3 18.105 3 17v-10C3 5.9 3.9 5 5 5h14c1.105 0 2 .895 2 2v10c-.001 .714-.382 1.373-1 1.73")
            addPathData("M6 9h12")
            addPathData("M6 12h3")
            addPathData("M6 15h2")
        }
        return _certificate!!
    }

private var _certificate: ImageVector? = null
