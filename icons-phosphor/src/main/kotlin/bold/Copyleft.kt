package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorBoldIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 180.000 128.000 C 179.999 150.379 165.680 170.247 144.450 177.326 C 123.221 184.406 99.843 177.109 86.410 159.210 C 83.686 155.794 83.034 151.166 84.708 147.130 C 86.382 143.094 90.119 140.287 94.461 139.802 C 98.804 139.318 103.067 141.232 105.590 144.800 C 112.821 154.442 125.411 158.374 136.844 154.563 C 148.278 150.752 155.990 140.052 155.990 128.000 C 155.990 115.948 148.278 105.248 136.844 101.437 C 125.411 97.626 112.821 101.558 105.590 111.200 C 103.067 114.768 98.804 116.682 94.461 116.198 C 90.119 115.713 86.382 112.906 84.708 108.870 C 83.034 104.834 83.686 100.206 86.410 96.790 C 99.843 78.891 123.221 71.594 144.450 78.674 C 165.680 85.753 179.999 105.621 180.000 128.000 Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null
