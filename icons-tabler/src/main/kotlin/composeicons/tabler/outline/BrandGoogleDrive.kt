package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleDrive: ImageVector
    get() {
        if (_brandGoogleDrive != null) return _brandGoogleDrive!!
        _brandGoogleDrive = tablerOutlineIcon(
            name = "BrandGoogleDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10 6 20 3 15 9 5l3 5")
            addPathData("M9 15h12l-3 5h-12")
            addPathData("M15 15 9 5h6l6 10h-6")
        }
        return _brandGoogleDrive!!
    }

private var _brandGoogleDrive: ImageVector? = null
