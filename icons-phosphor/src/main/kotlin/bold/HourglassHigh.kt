package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorBoldIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 76.000 C 52.016 82.291 54.976 88.213 60.000 92.000 L 108.000 128.000 L 60.000 164.000 C 54.976 167.787 52.016 173.709 52.000 180.000 L 52.000 216.000 C 52.000 227.046 60.954 236.000 72.000 236.000 L 184.000 236.000 C 195.046 236.000 204.000 227.046 204.000 216.000 L 204.000 180.360 C 203.994 174.080 201.058 168.163 196.060 164.360 L 147.900 128.000 L 196.060 91.600 C 201.058 87.797 203.994 81.880 204.000 75.600 L 204.000 40.000 C 204.000 28.954 195.046 20.000 184.000 20.000 ZM 180.000 44.000 L 180.000 60.000 L 76.000 60.000 L 76.000 44.000 ZM 128.000 113.000 L 89.330 84.000 L 166.330 84.000 ZM 180.000 212.000 L 76.000 212.000 L 76.000 182.000 L 128.000 143.000 L 180.000 182.330 Z"),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
