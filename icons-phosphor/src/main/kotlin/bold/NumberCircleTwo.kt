package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleTwo: ImageVector
    get() {
        if (_numberCircleTwo != null) return _numberCircleTwo!!
        _numberCircleTwo = phosphorBoldIcon(
            name = "NumberCircleTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 156.750 125.670 L 128.000 164.000 L 152.000 164.000 C 158.627 164.000 164.000 169.373 164.000 176.000 C 164.000 182.627 158.627 188.000 152.000 188.000 L 104.000 188.000 C 99.455 188.000 95.300 185.432 93.267 181.367 C 91.234 177.301 91.673 172.436 94.400 168.800 L 137.570 111.240 C 140.415 107.466 140.780 102.375 138.503 98.234 C 136.226 94.093 131.730 91.674 127.020 92.055 C 122.310 92.436 118.262 95.547 116.680 100.000 C 114.471 106.249 107.614 109.524 101.365 107.315 C 95.116 105.106 91.841 98.249 94.050 92.000 C 95.283 88.532 97.036 85.271 99.250 82.330 C 111.218 66.452 133.792 63.282 149.670 75.250 C 165.548 87.218 168.718 109.792 156.750 125.670 Z"),
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
        return _numberCircleTwo!!
    }

private var _numberCircleTwo: ImageVector? = null
