package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) return _flowArrow!!
        _flowArrow = phosphorLightIcon(
            name = "FlowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.240 75.760 L 212.240 43.760 C 209.876 41.557 206.192 41.622 203.907 43.907 C 201.622 46.192 201.557 49.876 203.760 52.240 L 225.510 74.000 L 208.000 74.000 C 160.000 74.000 148.560 101.460 138.460 125.690 C 129.030 148.330 120.800 168.020 85.460 169.850 C 82.233 150.295 64.518 136.504 44.768 138.173 C 25.019 139.841 9.869 156.408 9.968 176.228 C 10.067 196.047 25.382 212.462 45.147 213.933 C 64.912 215.404 82.488 201.437 85.520 181.850 C 128.860 179.790 139.810 153.560 149.520 130.300 C 159.440 106.530 168.000 86.000 208.000 86.000 L 225.510 86.000 L 203.760 107.760 C 202.155 109.256 201.494 111.508 202.037 113.634 C 202.580 115.760 204.240 117.420 206.366 117.963 C 208.492 118.506 210.744 117.845 212.240 116.240 L 244.240 84.240 C 246.580 81.897 246.580 78.103 244.240 75.760 ZM 48.000 202.000 C 33.641 202.000 22.000 190.359 22.000 176.000 C 22.000 161.641 33.641 150.000 48.000 150.000 C 62.359 150.000 74.000 161.641 74.000 176.000 C 74.000 190.359 62.359 202.000 48.000 202.000 Z"),
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
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
