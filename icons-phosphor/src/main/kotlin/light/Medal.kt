package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorLightIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 214.000 96.000 C 214.029 55.929 186.381 21.148 147.336 12.139 C 108.291 3.130 68.198 22.280 50.667 58.312 C 33.136 94.344 42.813 137.709 74.000 162.870 L 74.000 240.000 C 74.002 242.079 75.081 244.009 76.850 245.100 C 77.795 245.690 78.886 246.002 80.000 246.000 C 80.930 246.001 81.848 245.785 82.680 245.370 L 128.000 222.710 L 173.330 245.370 C 175.189 246.294 177.394 246.191 179.159 245.098 C 180.924 244.004 181.999 242.076 182.000 240.000 L 182.000 162.870 C 202.234 146.569 214.000 121.983 214.000 96.000 ZM 54.000 96.000 C 54.000 55.131 87.131 22.000 128.000 22.000 C 168.869 22.000 202.000 55.131 202.000 96.000 C 202.000 136.869 168.869 170.000 128.000 170.000 C 87.151 169.950 54.050 136.849 54.000 96.000 ZM 170.000 230.290 L 130.670 210.630 C 128.983 209.788 126.997 209.788 125.310 210.630 L 86.000 230.290 L 86.000 171.000 C 112.083 185.653 143.917 185.653 170.000 171.000 ZM 128.000 150.000 C 157.823 150.000 182.000 125.823 182.000 96.000 C 182.000 66.177 157.823 42.000 128.000 42.000 C 98.177 42.000 74.000 66.177 74.000 96.000 C 74.033 125.810 98.190 149.967 128.000 150.000 ZM 128.000 54.000 C 151.196 54.000 170.000 72.804 170.000 96.000 C 170.000 119.196 151.196 138.000 128.000 138.000 C 104.804 138.000 86.000 119.196 86.000 96.000 C 86.000 72.804 104.804 54.000 128.000 54.000 Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
