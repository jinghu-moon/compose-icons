package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTvOld: ImageVector
    get() {
        if (_deviceTvOld != null) return _deviceTvOld!!
        _deviceTvOld = tablerFilledIcon(
            name = "DeviceTvOld",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.707 2.293 12 5.585 15.293 2.293c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .39 .39 1.024 0 1.414L14.414 6h4.586c1.657 0 3 1.343 3 3v9c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9C2 7.343 3.343 6 5 6h4.585L7.293 3.707C6.914 3.315 6.919 2.691 7.305 2.305c.386-.386 1.009-.391 1.402-.012M19 8h-2c-.552 0-1 .448-1 1v9c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-9C20 8.448 19.552 8 19 8")
            addPathData("M18 14c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 15c0-.552 .448-1 1-1")
            addPathData("M18 11c.507 0 .934 .38 .993 .883l.007 .127c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L17 12c0-.552 .448-1 1-1")
        }
        return _deviceTvOld!!
    }

private var _deviceTvOld: ImageVector? = null
