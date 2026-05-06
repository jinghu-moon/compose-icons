package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Woman: ImageVector
    get() {
        if (_woman != null) return _woman!!
        _woman = tablerFilledIcon(
            name = "Woman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8c1.91 0 3.79 .752 5.625 2.219 .431 .345 .501 .975 .156 1.406-.345 .431-.975 .501-1.406 .156-1.019-.815-2.016-1.345-2.997-1.6l1.584 5.544c.086 .302 .026 .627-.163 .877-.189 .251-.485 .398-.799 .398h-1v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4h-2v4c0 .552-.448 1-1 1C9.448 22 9 21.552 9 21v-4h-1c-.314 0-.61-.147-.799-.398-.189-.251-.25-.575-.163-.877L8.622 10.18c-.98 .256-1.978 .786-2.997 1.601-.431 .345-1.061 .275-1.406-.156-.345-.431-.275-1.061 .156-1.406C6.108 8.833 7.881 8.086 9.682 8.007L10.017 8Z")
            addPathData("M12 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C10.343 7 9 5.657 9 4l.005-.176C9.098 2.238 10.411 1 12 1")
        }
        return _woman!!
    }

private var _woman: ImageVector? = null
