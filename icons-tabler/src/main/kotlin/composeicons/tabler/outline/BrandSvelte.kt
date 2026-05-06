package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSvelte: ImageVector
    get() {
        if (_brandSvelte != null) return _brandSvelte!!
        _brandSvelte = tablerOutlineIcon(
            name = "BrandSvelte",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8l-5 3 .821-.495c1.86-1.15 4.412-.49 5.574 1.352 .558 .885 .738 1.956 .501 2.974-.238 1.018-.873 1.899-1.765 2.446l-5.053 3.126C8.218 21.554 5.766 20.994 4.604 19.152c-.558-.884-.739-1.955-.501-2.974 .237-1.018 .873-1.899 1.764-2.446l.26-.16")
            addPathData("M8 17l5-3-.822 .496c-1.86 1.151-4.411 .491-5.574-1.351-.558-.885-.738-1.956-.501-2.974C6.341 9.152 6.976 8.271 7.868 7.725L12.922 4.598c1.86-1.15 4.311-.59 5.474 1.252 .558 .885 .738 1.956 .501 2.974-.238 1.018-.873 1.899-1.765 2.446l-.26 .16")
        }
        return _brandSvelte!!
    }

private var _brandSvelte: ImageVector? = null
