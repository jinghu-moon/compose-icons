package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorLightIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.490 28.000 C 203.348 26.723 201.714 25.995 200.000 26.000 L 56.000 26.000 C 54.278 25.988 52.633 26.717 51.485 28.000 C 50.337 29.284 49.796 31.000 50.000 32.710 L 73.160 225.710 C 74.026 232.745 80.012 238.023 87.100 238.000 L 168.900 238.000 C 175.986 238.000 181.955 232.705 182.800 225.670 L 206.000 32.710 C 206.197 30.996 205.647 29.280 204.490 28.000 ZM 193.240 38.000 L 189.880 66.000 L 66.120 66.000 L 62.760 38.000 ZM 170.890 224.240 C 170.768 225.250 169.907 226.007 168.890 226.000 L 87.100 226.000 C 86.083 226.007 85.222 225.250 85.100 224.240 L 67.560 78.000 L 188.440 78.000 Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
