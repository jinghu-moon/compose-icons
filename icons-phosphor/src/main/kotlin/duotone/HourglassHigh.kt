package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorDuotoneIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 192.000 64.000 L 192.000 75.640 C 191.992 78.140 190.816 80.493 188.820 82.000 L 128.000 128.000 L 67.200 82.400 C 65.186 80.889 64.000 78.518 64.000 76.000 L 64.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 76.000 C 56.011 81.034 58.380 85.771 62.400 88.800 L 114.670 128.000 L 62.400 167.200 C 58.380 170.229 56.011 174.966 56.000 180.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 180.360 C 199.988 175.346 197.641 170.625 193.650 167.590 L 141.270 128.000 L 193.650 88.410 C 197.641 85.375 199.988 80.654 200.000 75.640 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 ZM 184.000 40.000 L 184.000 56.000 L 72.000 56.000 L 72.000 40.000 ZM 184.000 216.000 L 72.000 216.000 L 72.000 180.000 L 128.000 138.000 L 184.000 180.350 ZM 128.000 118.000 L 72.000 76.000 L 72.000 72.000 L 184.000 72.000 L 184.000 75.640 Z"),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
