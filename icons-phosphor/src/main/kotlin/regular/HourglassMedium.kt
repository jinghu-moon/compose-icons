package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) return _hourglassMedium!!
        _hourglassMedium = phosphorRegularIcon(
            name = "HourglassMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 75.640 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 76.000 C 56.011 81.034 58.380 85.771 62.400 88.800 L 114.670 128.000 L 62.400 167.200 C 58.380 170.229 56.011 174.966 56.000 180.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 180.360 C 199.988 175.346 197.641 170.625 193.650 167.590 L 141.270 128.000 L 193.650 88.400 C 197.643 85.371 199.992 80.651 200.000 75.640 ZM 72.000 40.000 L 184.000 40.000 L 184.000 75.640 L 178.230 80.000 L 77.330 80.000 L 72.000 76.000 ZM 128.000 118.000 L 98.670 96.000 L 157.070 96.000 ZM 184.000 216.000 L 72.000 216.000 L 72.000 180.000 L 120.000 144.000 L 120.000 168.000 C 120.000 172.418 123.582 176.000 128.000 176.000 C 132.418 176.000 136.000 172.418 136.000 168.000 L 136.000 144.080 L 184.000 180.360 Z"),
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
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
