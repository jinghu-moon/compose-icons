package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorLightIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 42.000 L 160.000 42.000 C 152.268 42.000 146.000 48.268 146.000 56.000 L 146.000 144.000 C 146.000 153.941 137.941 162.000 128.000 162.000 C 118.059 162.000 110.000 153.941 110.000 144.000 L 110.000 56.000 C 110.000 48.268 103.732 42.000 96.000 42.000 L 56.000 42.000 C 48.268 42.000 42.000 48.268 42.000 56.000 L 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 L 128.650 230.000 C 175.710 229.650 214.000 190.620 214.000 143.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 ZM 160.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 L 202.000 90.000 L 158.000 90.000 L 158.000 56.000 C 158.000 54.895 158.895 54.000 160.000 54.000 ZM 56.000 54.000 L 96.000 54.000 C 97.105 54.000 98.000 54.895 98.000 56.000 L 98.000 90.000 L 54.000 90.000 L 54.000 56.000 C 54.000 54.895 54.895 54.000 56.000 54.000 ZM 128.560 218.000 L 128.000 218.000 C 87.131 218.000 54.000 184.869 54.000 144.000 L 54.000 102.000 L 98.000 102.000 L 98.000 144.000 C 98.000 160.569 111.431 174.000 128.000 174.000 C 144.569 174.000 158.000 160.569 158.000 144.000 L 158.000 102.000 L 202.000 102.000 L 202.000 143.000 C 202.000 184.050 169.060 217.700 128.560 218.000 Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
