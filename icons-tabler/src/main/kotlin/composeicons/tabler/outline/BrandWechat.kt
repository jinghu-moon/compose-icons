package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWechat: ImageVector
    get() {
        if (_brandWechat != null) return _brandWechat!!
        _brandWechat = tablerOutlineIcon(
            name = "BrandWechat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.5 10C19.538 10 22 12.015 22 14.5c0 1.397-.778 2.645-2 3.47v2.03L18.036 18.822c-.503 .119-1.019 .179-1.536 .178C13.462 19 11 16.985 11 14.5 11 12.015 13.462 10 16.5 10")
            addPathData("M11.197 15.698C10.507 15.894 9.767 16 9 16c-.889 .002-1.771-.144-2.612-.432L4 17v-2.801C2.763 13.117 2 11.635 2 10 2 6.686 5.134 4 9 4c3.782 0 6.863 2.57 7 5.785v.233")
            addPathData("M10 8h.01")
            addPathData("M7 8h.01")
            addPathData("M15 14h.01")
            addPathData("M18 14h.01")
        }
        return _brandWechat!!
    }

private var _brandWechat: ImageVector? = null
