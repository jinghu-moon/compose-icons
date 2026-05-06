package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketDroplet: ImageVector
    get() {
        if (_bucketDroplet != null) return _bucketDroplet!!
        _bucketDroplet = tablerOutlineIcon(
            name = "BucketDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 16l1.465 1.638c.728 .783 .712 1.999-.036 2.762-.748 .763-1.964 .803-2.761 .091-.797-.712-.893-1.925-.217-2.754L5 16")
            addPathData("M13.737 9.737C16.036 7.437 16.967 4.642 15.818 3.492 14.668 2.342 11.873 3.275 9.574 5.574 7.274 7.873 6.343 10.669 7.492 11.818c1.15 1.15 3.946 .218 6.245-2.081")
            addPathData("M7.492 11.818c.362 .362 .768 .676 1.208 .934l6.895 4.047c1.078 .557 2.255-.075 3.692-1.512 1.437-1.437 2.07-2.614 1.512-3.692C20.427 10.877 19.079 8.578 16.752 4.7c-.259-.441-.573-.847-.934-1.208")
        }
        return _bucketDroplet!!
    }

private var _bucketDroplet: ImageVector? = null
