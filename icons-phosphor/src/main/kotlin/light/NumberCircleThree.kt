package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorLightIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 158.000 152.000 C 158.000 165.816 149.639 178.258 136.848 183.479 C 124.056 188.699 109.377 185.660 99.710 175.790 C 97.393 173.421 97.436 169.622 99.805 167.305 C 102.174 164.988 105.973 165.031 108.290 167.400 C 115.279 174.531 126.194 176.060 134.874 171.125 C 143.554 166.191 147.823 156.029 145.270 146.376 C 142.718 136.723 133.985 129.999 124.000 130.000 C 121.762 130.002 119.709 128.758 118.675 126.773 C 117.641 124.789 117.797 122.393 119.080 120.560 L 140.480 90.000 L 104.000 90.000 C 100.686 90.000 98.000 87.314 98.000 84.000 C 98.000 80.686 100.686 78.000 104.000 78.000 L 152.000 78.000 C 154.238 77.998 156.291 79.242 157.325 81.227 C 158.359 83.211 158.203 85.607 156.920 87.440 L 134.390 119.620 C 148.449 124.152 157.984 137.229 158.000 152.000 Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
