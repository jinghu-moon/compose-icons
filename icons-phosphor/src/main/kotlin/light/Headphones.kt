package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorLightIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.470 56.070 C 181.517 36.915 155.717 26.095 128.770 26.000 L 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 L 26.000 184.000 C 26.000 196.150 35.850 206.000 48.000 206.000 L 64.000 206.000 C 76.150 206.000 86.000 196.150 86.000 184.000 L 86.000 144.000 C 86.000 131.850 76.150 122.000 64.000 122.000 L 38.200 122.000 C 40.589 86.694 63.418 56.054 96.565 43.666 C 129.712 31.278 167.042 39.435 192.000 64.520 C 207.293 79.913 216.467 100.343 217.810 122.000 L 192.000 122.000 C 179.850 122.000 170.000 131.850 170.000 144.000 L 170.000 184.000 C 170.000 196.150 179.850 206.000 192.000 206.000 L 208.000 206.000 C 220.150 206.000 230.000 196.150 230.000 184.000 L 230.000 128.000 C 230.101 101.053 219.477 75.173 200.470 56.070 ZM 64.000 134.000 C 69.523 134.000 74.000 138.477 74.000 144.000 L 74.000 184.000 C 74.000 189.523 69.523 194.000 64.000 194.000 L 48.000 194.000 C 42.477 194.000 38.000 189.523 38.000 184.000 L 38.000 134.000 ZM 218.000 184.000 C 218.000 189.523 213.523 194.000 208.000 194.000 L 192.000 194.000 C 186.477 194.000 182.000 189.523 182.000 184.000 L 182.000 144.000 C 182.000 138.477 186.477 134.000 192.000 134.000 L 218.000 134.000 Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
