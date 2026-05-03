package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorLightIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.140 179.090 C 211.436 181.931 207.752 182.853 204.910 181.150 L 134.000 138.600 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 138.600 L 51.090 181.150 C 50.155 181.705 49.088 181.999 48.000 182.000 C 45.297 182.010 42.922 180.211 42.198 177.607 C 41.474 175.003 42.580 172.237 44.900 170.850 L 116.340 128.000 L 44.910 85.150 C 42.066 83.443 41.143 79.754 42.850 76.910 C 44.557 74.066 48.246 73.143 51.090 74.850 L 122.000 117.400 L 122.000 40.000 C 122.000 36.686 124.686 34.000 128.000 34.000 C 131.314 34.000 134.000 36.686 134.000 40.000 L 134.000 117.400 L 204.910 74.850 C 207.754 73.143 211.443 74.066 213.150 76.910 C 214.857 79.754 213.934 83.443 211.090 85.150 L 139.660 128.000 L 211.090 170.850 C 212.455 171.670 213.439 172.999 213.823 174.545 C 214.208 176.091 213.962 177.726 213.140 179.090 Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
