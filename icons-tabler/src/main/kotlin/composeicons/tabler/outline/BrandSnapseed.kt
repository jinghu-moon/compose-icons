package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnapseed: ImageVector
    get() {
        if (_brandSnapseed != null) return _brandSnapseed!!
        _brandSnapseed = tablerOutlineIcon(
            name = "BrandSnapseed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.152 3.115c-.174-.154-.435-.154-.609 0C4.6 5.695 3.014 8.556 3 11.493c0 2.928 1.586 5.803 4.543 8.392 .174 .154 .436 .154 .61 0 2.957-2.589 4.547-5.464 4.547-8.392C12.7 8.565 11.1 5.694 8.152 3.115")
            addPathData("M8 20l12.09-.011c.503 0 .91-.434 .91-.969v-6.063c0-.535-.407-.968-.91-.968h-7.382")
        }
        return _brandSnapseed!!
    }

private var _brandSnapseed: ImageVector? = null
