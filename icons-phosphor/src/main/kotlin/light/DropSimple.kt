package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorLightIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.530 49.060 C 160.290 34.904 146.508 22.158 131.440 11.060 C 129.374 9.615 126.626 9.615 124.560 11.060 C 109.492 22.158 95.710 34.904 83.470 49.060 C 56.340 80.260 42.000 113.090 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 113.090 199.660 80.260 172.530 49.060 ZM 128.000 218.000 C 87.151 217.950 54.050 184.849 54.000 144.000 C 54.000 84.380 113.000 35.070 128.000 23.490 C 143.000 35.070 202.000 84.380 202.000 144.000 C 201.950 184.849 168.849 217.950 128.000 218.000 Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
