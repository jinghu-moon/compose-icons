package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleMaps: ImageVector
    get() {
        if (_brandGoogleMaps != null) return _brandGoogleMaps!!
        _brandGoogleMaps = tablerOutlineIcon(
            name = "BrandGoogleMaps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 9.5C9.5 10.881 10.619 12 12 12c1.381 0 2.5-1.119 2.5-2.5C14.5 8.119 13.381 7 12 7 10.619 7 9.5 8.119 9.5 9.5")
            addPathData("M6.428 12.494 13.742 3.242")
            addPathData("M10.002 7.935 7.065 5.39")
            addPathData("M17.693 6.593 9.357 16.572")
            addPathData("M17.591 6.376c.472 .907 .715 1.914 .709 2.935 .004 1.101-.242 2.188-.72 3.18-.599 1.065-1.298 2.069-2.089 3-.784 .933-1.49 1.93-2.11 2.98-.314 .62-.568 1.27-.757 1.938-.121 .36-.277 .591-.622 .591-.315 0-.463-.136-.626-.593-.193-.684-.454-1.346-.779-1.978-.425-.729-.901-1.428-1.423-2.091C8.297 15.154 6.995 13.803 6.321 12.267 5.902 11.334 5.69 10.322 5.7 9.3 5.693 7.816 6.216 6.377 7.176 5.245 8.366 3.819 10.129 2.996 11.987 3c.65-.002 1.297 .093 1.918 .284 1.592 .498 2.919 1.611 3.686 3.092")
        }
        return _brandGoogleMaps!!
    }

private var _brandGoogleMaps: ImageVector? = null
