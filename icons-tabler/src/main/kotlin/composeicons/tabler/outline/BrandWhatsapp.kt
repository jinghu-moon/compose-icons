package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWhatsapp: ImageVector
    get() {
        if (_brandWhatsapp != null) return _brandWhatsapp!!
        _brandWhatsapp = tablerOutlineIcon(
            name = "BrandWhatsapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21 4.65 17.2C2.038 13.492 2.593 8.421 5.945 5.366 9.296 2.31 14.398 2.226 17.848 5.169c3.451 2.943 4.172 7.994 1.684 11.785-2.488 3.792-7.409 5.14-11.482 3.145L3 21")
            addPathData("M9 10c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-1c0-.276-.224-.5-.5-.5C9.224 8.5 9 8.724 9 9v1c0 2.761 2.239 5 5 5h1c.276 0 .5-.224 .5-.5C15.5 14.224 15.276 14 15 14h-1c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5")
        }
        return _brandWhatsapp!!
    }

private var _brandWhatsapp: ImageVector? = null
