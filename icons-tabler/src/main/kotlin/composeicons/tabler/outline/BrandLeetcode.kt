package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLeetcode: ImageVector
    get() {
        if (_brandLeetcode != null) return _brandLeetcode!!
        _brandLeetcode = tablerOutlineIcon(
            name = "BrandLeetcode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 13h7.5")
            addPathData("M9.424 7.268 14.423 2.269")
            addPathData("M16.633 16.644l-2.402 2.415c-.599 .602-1.413 .941-2.262 .941-.849 0-1.663-.339-2.262-.941L5.937 15.272c-1.249-1.257-1.249-3.287 0-4.544L9.707 6.941c.599-.602 1.413-.941 2.262-.941 .849 0 1.663 .339 2.262 .941l2.302 2.313")
        }
        return _brandLeetcode!!
    }

private var _brandLeetcode: ImageVector? = null
