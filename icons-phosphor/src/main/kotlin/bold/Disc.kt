package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorBoldIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 170.320 116.000 C 169.388 112.712 168.076 109.544 166.410 106.560 L 195.250 77.720 C 203.674 88.944 209.136 102.109 211.130 116.000 ZM 148.000 128.000 C 148.000 139.046 139.046 148.000 128.000 148.000 C 116.954 148.000 108.000 139.046 108.000 128.000 C 108.000 116.954 116.954 108.000 128.000 108.000 C 139.046 108.000 148.000 116.954 148.000 128.000 ZM 128.000 212.000 C 91.456 212.023 59.090 188.417 47.947 153.613 C 36.804 118.809 49.441 80.795 79.203 59.589 C 108.966 38.383 149.023 38.853 178.280 60.750 L 149.430 89.590 C 133.072 80.459 112.726 82.688 98.732 95.143 C 84.738 107.598 80.165 127.548 87.337 144.855 C 94.509 162.162 111.853 173.029 130.555 171.935 C 149.257 170.841 165.215 158.025 170.320 140.000 L 211.130 140.000 C 205.117 181.299 169.734 211.944 128.000 212.000 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
