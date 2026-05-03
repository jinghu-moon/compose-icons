package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorLightIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 182.000 34.000 L 182.000 24.000 C 182.000 20.686 179.314 18.000 176.000 18.000 C 172.686 18.000 170.000 20.686 170.000 24.000 L 170.000 34.000 L 86.000 34.000 L 86.000 24.000 C 86.000 20.686 83.314 18.000 80.000 18.000 C 76.686 18.000 74.000 20.686 74.000 24.000 L 74.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 74.000 46.000 L 74.000 56.000 C 74.000 59.314 76.686 62.000 80.000 62.000 C 83.314 62.000 86.000 59.314 86.000 56.000 L 86.000 46.000 L 170.000 46.000 L 170.000 56.000 C 170.000 59.314 172.686 62.000 176.000 62.000 C 179.314 62.000 182.000 59.314 182.000 56.000 L 182.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 152.000 90.000 C 142.557 90.000 133.666 94.446 128.000 102.000 C 120.252 91.670 106.763 87.456 94.513 91.539 C 82.263 95.623 74.000 107.087 74.000 120.000 C 74.000 155.300 123.220 180.320 125.320 181.370 C 127.007 182.212 128.993 182.212 130.680 181.370 C 132.780 180.320 182.000 155.300 182.000 120.000 C 182.000 103.431 168.569 90.000 152.000 90.000 ZM 148.330 155.250 C 141.983 160.494 135.179 165.159 128.000 169.190 C 120.823 165.155 114.020 160.490 107.670 155.250 C 97.780 147.000 86.000 134.150 86.000 120.000 C 86.000 110.059 94.059 102.000 104.000 102.000 C 113.941 102.000 122.000 110.059 122.000 120.000 C 122.000 123.314 124.686 126.000 128.000 126.000 C 131.314 126.000 134.000 123.314 134.000 120.000 C 134.000 110.059 142.059 102.000 152.000 102.000 C 161.941 102.000 170.000 110.059 170.000 120.000 C 170.000 134.150 158.220 147.000 148.330 155.250 Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
