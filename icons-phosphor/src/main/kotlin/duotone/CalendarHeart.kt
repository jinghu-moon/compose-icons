package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) return _calendarHeart!!
        _calendarHeart = phosphorDuotoneIcon(
            name = "CalendarHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 120.000 C 176.000 152.000 128.000 176.000 128.000 176.000 C 128.000 176.000 80.000 152.000 80.000 120.000 C 80.000 106.745 90.745 96.000 104.000 96.000 C 117.255 96.000 128.000 106.745 128.000 120.000 C 128.000 106.745 138.745 96.000 152.000 96.000 C 165.255 96.000 176.000 106.745 176.000 120.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 184.000 32.000 L 184.000 24.000 C 184.000 19.582 180.418 16.000 176.000 16.000 C 171.582 16.000 168.000 19.582 168.000 24.000 L 168.000 32.000 L 88.000 32.000 L 88.000 24.000 C 88.000 19.582 84.418 16.000 80.000 16.000 C 75.582 16.000 72.000 19.582 72.000 24.000 L 72.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 72.000 48.000 L 72.000 56.000 C 72.000 60.418 75.582 64.000 80.000 64.000 C 84.418 64.000 88.000 60.418 88.000 56.000 L 88.000 48.000 L 168.000 48.000 L 168.000 56.000 C 168.000 60.418 171.582 64.000 176.000 64.000 C 180.418 64.000 184.000 60.418 184.000 56.000 L 184.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 152.000 88.000 C 142.809 87.995 134.063 91.953 128.000 98.860 C 119.200 88.882 105.145 85.390 92.698 90.088 C 80.252 94.787 72.011 106.696 72.000 120.000 C 72.000 156.520 122.280 182.080 124.420 183.160 C 126.673 184.288 129.327 184.288 131.580 183.160 C 133.720 182.080 184.000 156.520 184.000 120.000 C 184.000 102.327 169.673 88.000 152.000 88.000 ZM 128.000 166.930 C 114.210 159.140 88.000 140.180 88.000 120.000 C 88.000 111.163 95.163 104.000 104.000 104.000 C 112.837 104.000 120.000 111.163 120.000 120.000 C 120.000 124.418 123.582 128.000 128.000 128.000 C 132.418 128.000 136.000 124.418 136.000 120.000 C 136.000 111.163 143.163 104.000 152.000 104.000 C 160.837 104.000 168.000 111.163 168.000 120.000 C 168.000 140.190 141.790 159.150 128.000 166.930 Z"),
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
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
