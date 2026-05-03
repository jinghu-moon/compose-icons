package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorLightIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 165.520 122.000 C 164.580 116.120 162.264 110.545 158.760 105.730 L 195.760 68.780 C 208.764 83.611 216.511 102.318 217.800 122.000 ZM 154.000 128.000 C 154.000 142.359 142.359 154.000 128.000 154.000 C 113.641 154.000 102.000 142.359 102.000 128.000 C 102.000 113.641 113.641 102.000 128.000 102.000 C 142.359 102.000 154.000 113.641 154.000 128.000 ZM 128.000 218.000 C 87.994 218.031 52.769 191.651 41.545 153.251 C 30.320 114.852 45.790 73.653 79.515 52.132 C 113.240 30.611 157.122 33.935 187.220 60.290 L 150.270 97.240 C 136.494 87.271 117.772 87.668 104.431 98.212 C 91.089 108.756 86.377 126.879 92.893 142.586 C 99.409 158.293 115.567 167.759 132.454 165.762 C 149.341 163.766 162.846 150.793 165.520 134.000 L 217.800 134.000 C 214.584 181.244 175.353 217.941 128.000 218.000 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
