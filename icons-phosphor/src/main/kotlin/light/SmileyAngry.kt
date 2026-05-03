package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorLightIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 150.000 C 86.477 150.000 82.000 145.523 82.000 140.000 C 82.000 134.477 86.477 130.000 92.000 130.000 C 97.523 130.000 102.000 134.477 102.000 140.000 C 102.000 145.523 97.523 150.000 92.000 150.000 ZM 164.000 130.000 C 158.477 130.000 154.000 134.477 154.000 140.000 C 154.000 145.523 158.477 150.000 164.000 150.000 C 169.523 150.000 174.000 145.523 174.000 140.000 C 174.000 134.477 169.523 130.000 164.000 130.000 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 ZM 172.670 83.000 L 128.000 112.790 L 83.330 83.000 C 80.569 81.161 76.839 81.909 75.000 84.670 C 73.161 87.431 73.909 91.161 76.670 93.000 L 124.670 125.000 C 126.686 126.345 129.314 126.345 131.330 125.000 L 179.330 93.000 C 182.091 91.161 182.839 87.431 181.000 84.670 C 179.161 81.909 175.431 81.161 172.670 83.000 ZM 155.320 179.000 C 147.190 173.600 139.440 170.000 128.000 170.000 C 116.560 170.000 108.810 173.600 100.680 179.000 C 97.919 180.834 97.166 184.559 99.000 187.320 C 100.834 190.081 104.559 190.834 107.320 189.000 C 113.990 184.570 119.510 182.000 128.000 182.000 C 136.490 182.000 142.000 184.570 148.680 189.000 C 149.660 189.654 150.812 190.002 151.990 190.000 C 154.639 190.006 156.978 188.274 157.746 185.738 C 158.514 183.203 157.528 180.464 155.320 179.000 Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
