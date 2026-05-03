package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorLightIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 224.000 C 222.000 227.314 219.314 230.000 216.000 230.000 L 40.000 230.000 C 36.686 230.000 34.000 227.314 34.000 224.000 C 34.000 220.686 36.686 218.000 40.000 218.000 L 216.000 218.000 C 219.314 218.000 222.000 220.686 222.000 224.000 ZM 222.000 144.000 L 222.000 184.000 C 222.000 191.732 215.732 198.000 208.000 198.000 L 48.000 198.000 C 40.268 198.000 34.000 191.732 34.000 184.000 L 34.000 144.000 C 34.000 136.268 40.268 130.000 48.000 130.000 L 106.900 130.000 L 90.680 54.290 C 88.781 45.433 90.985 36.192 96.678 29.146 C 102.370 22.101 110.942 18.004 120.000 18.000 L 136.000 18.000 C 145.060 18.001 153.634 22.096 159.329 29.143 C 165.024 36.189 167.230 45.431 165.330 54.290 L 149.100 130.000 L 208.000 130.000 C 215.732 130.000 222.000 136.268 222.000 144.000 ZM 119.170 130.000 L 136.830 130.000 L 153.590 51.770 C 154.728 46.457 153.405 40.914 149.990 36.687 C 146.575 32.461 141.434 30.003 136.000 30.000 L 120.000 30.000 C 114.565 30.000 109.420 32.457 106.003 36.683 C 102.586 40.910 101.262 46.455 102.400 51.770 ZM 210.000 144.000 C 210.000 142.895 209.105 142.000 208.000 142.000 L 48.000 142.000 C 46.895 142.000 46.000 142.895 46.000 144.000 L 46.000 184.000 C 46.000 185.105 46.895 186.000 48.000 186.000 L 208.000 186.000 C 209.105 186.000 210.000 185.105 210.000 184.000 Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
