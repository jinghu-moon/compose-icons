package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorThinIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 195.530 126.110 C 194.833 124.809 193.476 123.998 192.000 124.000 L 135.470 124.000 L 163.330 82.220 C 164.149 80.992 164.226 79.413 163.529 78.112 C 162.832 76.811 161.476 75.999 160.000 76.000 L 96.000 76.000 C 94.524 75.999 93.168 76.811 92.471 78.112 C 91.774 79.413 91.851 80.992 92.670 82.220 L 120.530 124.000 L 64.000 124.000 C 62.524 123.999 61.168 124.811 60.471 126.112 C 59.774 127.413 59.851 128.992 60.670 130.220 L 92.670 178.220 C 93.412 179.334 94.661 180.004 96.000 180.004 C 97.339 180.004 98.588 179.334 99.330 178.220 L 128.000 135.220 L 156.670 178.220 C 157.412 179.334 158.661 180.004 160.000 180.004 C 161.339 180.004 162.588 179.334 163.330 178.220 L 195.330 130.220 C 196.150 128.992 196.227 127.412 195.530 126.110 ZM 152.530 84.000 L 128.000 120.790 L 103.470 84.000 ZM 96.000 168.790 L 71.470 132.000 L 120.530 132.000 ZM 160.000 168.790 L 135.470 132.000 L 184.530 132.000 Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
