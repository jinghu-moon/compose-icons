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
                pathData = parseSvgPathData("M 8.707 2.293 L 12.000 5.585 L 15.293 2.293 C 15.649 1.937 16.215 1.901 16.613 2.210 L 16.707 2.293 C 17.097 2.683 17.097 3.317 16.707 3.707 L 14.414 6.000 L 19.000 6.000 C 20.657 6.000 22.000 7.343 22.000 9.000 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 9.000 C 2.000 7.343 3.343 6.000 5.000 6.000 L 9.585 6.000 L 7.293 3.707 C 6.914 3.315 6.919 2.691 7.305 2.305 C 7.691 1.919 8.315 1.914 8.707 2.293"),
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
