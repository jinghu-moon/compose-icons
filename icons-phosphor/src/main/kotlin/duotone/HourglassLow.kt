package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) return _hourglassLow!!
        _hourglassLow = phosphorDuotoneIcon(
            name = "HourglassLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 192.000 184.000 L 192.000 216.000 C 192.000 220.418 188.418 224.000 184.000 224.000 L 72.000 224.000 C 67.582 224.000 64.000 220.418 64.000 216.000 L 64.000 184.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 75.640 L 200.000 40.000 C 200.000 31.163 192.837 24.000 184.000 24.000 L 72.000 24.000 C 63.163 24.000 56.000 31.163 56.000 40.000 L 56.000 76.000 C 56.011 81.034 58.380 85.771 62.400 88.800 L 114.670 128.000 L 62.400 167.200 C 58.380 170.229 56.011 174.966 56.000 180.000 L 56.000 216.000 C 56.000 224.837 63.163 232.000 72.000 232.000 L 184.000 232.000 C 192.837 232.000 200.000 224.837 200.000 216.000 L 200.000 180.360 C 199.987 175.350 197.639 170.632 193.650 167.600 L 141.270 128.000 L 193.650 88.410 C 197.641 85.375 199.988 80.654 200.000 75.640 ZM 178.230 176.000 L 77.330 176.000 L 128.000 138.000 ZM 72.000 216.000 L 72.000 192.000 L 184.000 192.000 L 184.000 216.000 ZM 184.000 75.640 L 128.000 118.000 L 72.000 76.000 L 72.000 40.000 L 184.000 40.000 Z"),
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
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
