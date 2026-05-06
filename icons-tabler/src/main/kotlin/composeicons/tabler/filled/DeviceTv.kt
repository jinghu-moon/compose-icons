package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTv: ImageVector
    get() {
        if (_deviceTv != null) return _deviceTv!!
        _deviceTv = tablerFilledIcon(
            name = "DeviceTv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.707 2.293 12 5.585 15.293 2.293c.356-.356 .922-.392 1.32-.083l.094 .083c.39 .39 .39 1.024 0 1.414L14.414 6h4.586c1.657 0 3 1.343 3 3v9c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9C2 7.343 3.343 6 5 6h4.585L7.293 3.707C6.914 3.315 6.919 2.691 7.305 2.305c.386-.386 1.009-.391 1.402-.012"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _deviceTv!!
    }

private var _deviceTv: ImageVector? = null
