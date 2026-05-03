package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorBoldIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 148.000 73.360 C 133.972 65.261 116.444 66.422 103.607 76.300 C 90.770 86.179 85.157 102.824 89.392 118.459 C 93.626 134.093 106.872 145.631 122.940 147.680 L 109.700 169.850 C 107.374 173.535 107.230 178.192 109.321 182.014 C 111.413 185.837 115.413 188.226 119.771 188.254 C 124.128 188.282 128.159 185.945 130.300 182.150 L 162.640 128.000 C 173.685 108.869 167.131 84.406 148.000 73.360 ZM 141.860 116.000 L 141.860 116.000 C 137.441 123.652 127.657 126.273 120.005 121.856 C 112.353 117.438 109.730 107.654 114.146 100.001 C 118.563 92.349 128.347 89.724 136.000 94.140 C 143.649 98.564 146.263 108.351 141.840 116.000 Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
