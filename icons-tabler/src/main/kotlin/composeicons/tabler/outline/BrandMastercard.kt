package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMastercard: ImageVector
    get() {
        if (_brandMastercard != null) return _brandMastercard!!
        _brandMastercard = tablerOutlineIcon(
            name = "BrandMastercard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C17 10.343 15.657 9 14 9c-1.657 0-3 1.343-3 3")
            addPathData("M12 9.765C10.798 8.688 8.959 8.756 7.839 9.918c-1.12 1.162-1.12 3.002 0 4.164 1.12 1.162 2.959 1.23 4.161 .153")
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
        }
        return _brandMastercard!!
    }

private var _brandMastercard: ImageVector? = null
