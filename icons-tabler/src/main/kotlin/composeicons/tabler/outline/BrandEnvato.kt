package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEnvato: ImageVector
    get() {
        if (_brandEnvato != null) return _brandEnvato!!
        _brandEnvato = tablerOutlineIcon(
            name = "BrandEnvato",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.711 17.875C4.177 16.536 3.361 13.697 4.84 11.405 6.255 9.212 8.609 7.797 9.939 7.127L4.71 17.875h.001")
            addPathData("M19.715 12.508c-.54 3.409-2.094 6.156-4.155 7.348-4.069 2.353-8.144 .45-9.297-.188 .877-1.436 4.433-7.22 6.882-10.591C15.859 5.34 19.009 3.099 19.71 3c0 .201 .03 .55 .071 1.03 .144 1.709 .443 5.264-.066 8.478")
        }
        return _brandEnvato!!
    }

private var _brandEnvato: ImageVector? = null
