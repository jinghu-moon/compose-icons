package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CertificateOff: ImageVector
    get() {
        if (_certificateOff != null) return _certificateOff!!
        _certificateOff = tablerOutlineIcon(
            name = "CertificateOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.876 12.881c-1.172 1.172-1.172 3.071 0 4.243 1.172 1.172 3.071 1.172 4.243 0M17.707 13.704c-.301-.626-.808-1.128-1.437-1.423")
            addPathData("M13 17.5v4.5l2-1.5L17 22v-4.5")
            addPathData("M10 19h-5C3.895 19 3 18.105 3 17v-10C3 5.9 3.9 5 5 5M9 5h10c1.105 0 2 .895 2 2v10")
            addPathData("M6 9h3M13 9h5")
            addPathData("M6 12h3")
            addPathData("M6 15h2")
            addPathData("M3 3 21 21")
        }
        return _certificateOff!!
    }

private var _certificateOff: ImageVector? = null
