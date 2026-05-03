package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Envelope: ImageVector
    get() {
        if (_envelope != null) return _envelope!!
        _envelope = phosphorLightIcon(
            name = "Envelope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 28.686 50.000 26.000 52.686 26.000 56.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 216.000 206.000 C 223.732 206.000 230.000 199.732 230.000 192.000 L 230.000 56.000 C 230.000 52.686 227.314 50.000 224.000 50.000 ZM 128.000 135.860 L 47.420 62.000 L 208.580 62.000 ZM 101.670 128.000 L 38.000 186.360 L 38.000 69.640 ZM 110.550 136.140 L 124.000 148.420 C 126.293 150.517 129.807 150.517 132.100 148.420 L 145.500 136.140 L 208.580 194.000 L 47.430 194.000 ZM 154.330 128.000 L 218.000 69.640 L 218.000 186.360 Z"),
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
        return _envelope!!
    }

private var _envelope: ImageVector? = null
