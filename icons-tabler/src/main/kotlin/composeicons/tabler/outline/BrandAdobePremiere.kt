package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdobePremiere: ImageVector
    get() {
        if (_brandAdobePremiere != null) return _brandAdobePremiere!!
        _brandAdobePremiere = tablerOutlineIcon(
            name = "BrandAdobePremiere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12C3 7.757 3 5.636 4.318 4.318 5.636 3 7.758 3 12 3c4.242 0 6.364 0 7.682 1.318C21 5.636 21 7.758 21 12c0 4.242 0 6.364-1.318 7.682C18.364 21 16.242 21 12 21 7.758 21 5.636 21 4.318 19.682 3 18.364 3 16.242 3 12")
            addPathData("M7.263 15.79v-3.79M7.263 12v-3.248c0-.335 .222-.541 .542-.541h1.353c.687-.016 1.329 .342 1.677 .934 .348 .593 .348 1.327 0 1.92-.348 .593-.99 .95-1.677 .934h-1.895")
            addPathData("M13.895 10.579v1.895M13.895 12.474v3.315M13.895 12.474c.531-.709 1.026-1.592 1.894-1.832q.22-.062 .474-.063")
        }
        return _brandAdobePremiere!!
    }

private var _brandAdobePremiere: ImageVector? = null
