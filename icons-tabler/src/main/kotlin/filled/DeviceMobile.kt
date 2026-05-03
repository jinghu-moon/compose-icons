package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) return _deviceMobile!!
        _deviceMobile = tablerFilledIcon(
            name = "DeviceMobile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 C 17.589 2.000 18.902 3.238 18.995 4.824 L 19.000 5.000 L 19.000 19.000 C 19.000 20.589 17.762 21.902 16.176 21.995 L 16.000 22.000 L 8.000 22.000 C 6.411 22.000 5.098 20.762 5.005 19.176 L 5.000 19.000 L 5.000 5.000 C 5.000 3.411 6.238 2.098 7.824 2.005 L 8.000 2.000 L 16.000 2.000 ZM 12.000 16.000 C 11.493 16.000 11.066 16.380 11.007 16.883 L 11.000 17.000 L 11.007 17.127 C 11.067 17.630 11.493 18.009 12.000 18.009 C 12.507 18.009 12.933 17.630 12.993 17.127 L 13.000 17.010 L 12.993 16.883 C 12.934 16.380 12.507 16.000 12.000 16.000 ZM 13.000 4.000 L 11.000 4.000 L 10.883 4.007 C 10.380 4.067 10.001 4.493 10.001 5.000 C 10.001 5.507 10.380 5.933 10.883 5.993 L 11.000 6.000 L 13.000 6.000 L 13.117 5.993 C 13.620 5.933 13.999 5.507 13.999 5.000 C 13.999 4.493 13.620 4.067 13.117 4.007 L 13.000 4.000 Z"),
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
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
