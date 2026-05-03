package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarX: ImageVector
    get() {
        if (_calendarX != null) return _calendarX!!
        _calendarX = phosphorLightIcon(
            name = "CalendarX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 182.000 34.000 L 182.000 24.000 C 182.000 20.686 179.314 18.000 176.000 18.000 C 172.686 18.000 170.000 20.686 170.000 24.000 L 170.000 34.000 L 86.000 34.000 L 86.000 24.000 C 86.000 20.686 83.314 18.000 80.000 18.000 C 76.686 18.000 74.000 20.686 74.000 24.000 L 74.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 48.000 46.000 L 74.000 46.000 L 74.000 56.000 C 74.000 59.314 76.686 62.000 80.000 62.000 C 83.314 62.000 86.000 59.314 86.000 56.000 L 86.000 46.000 L 170.000 46.000 L 170.000 56.000 C 170.000 59.314 172.686 62.000 176.000 62.000 C 179.314 62.000 182.000 59.314 182.000 56.000 L 182.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 82.000 L 46.000 82.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 ZM 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 94.000 L 210.000 94.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 ZM 156.240 132.240 L 136.480 152.000 L 156.240 171.760 C 157.845 173.256 158.506 175.508 157.963 177.634 C 157.420 179.760 155.760 181.420 153.634 181.963 C 151.508 182.506 149.256 181.845 147.760 180.240 L 128.000 160.480 L 108.240 180.240 C 105.876 182.443 102.192 182.378 99.907 180.093 C 97.622 177.808 97.557 174.124 99.760 171.760 L 119.520 152.000 L 99.760 132.240 C 98.155 130.744 97.494 128.492 98.037 126.366 C 98.580 124.240 100.240 122.580 102.366 122.037 C 104.492 121.494 106.744 122.155 108.240 123.760 L 128.000 143.520 L 147.760 123.760 C 149.256 122.155 151.508 121.494 153.634 122.037 C 155.760 122.580 157.420 124.240 157.963 126.366 C 158.506 128.492 157.845 130.744 156.240 132.240 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _calendarX!!
    }

private var _calendarX: ImageVector? = null
