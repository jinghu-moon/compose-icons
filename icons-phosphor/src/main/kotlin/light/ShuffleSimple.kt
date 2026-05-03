package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleSimple: ImageVector
    get() {
        if (_shuffleSimple != null) return _shuffleSimple!!
        _shuffleSimple = phosphorLightIcon(
            name = "ShuffleSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 48.000 L 214.000 88.000 C 214.000 91.314 211.314 94.000 208.000 94.000 C 204.686 94.000 202.000 91.314 202.000 88.000 L 202.000 62.480 L 154.870 109.620 C 152.526 111.964 148.724 111.964 146.380 109.620 C 144.036 107.276 144.036 103.474 146.380 101.130 L 193.520 54.000 L 168.000 54.000 C 164.686 54.000 162.000 51.314 162.000 48.000 C 162.000 44.686 164.686 42.000 168.000 42.000 L 208.000 42.000 C 211.314 42.000 214.000 44.686 214.000 48.000 ZM 208.000 162.000 C 204.686 162.000 202.000 164.686 202.000 168.000 L 202.000 193.520 L 52.240 43.760 C 49.876 41.557 46.192 41.622 43.907 43.907 C 41.622 46.192 41.557 49.876 43.760 52.240 L 193.520 202.000 L 168.000 202.000 C 164.686 202.000 162.000 204.686 162.000 208.000 C 162.000 211.314 164.686 214.000 168.000 214.000 L 208.000 214.000 C 211.314 214.000 214.000 211.314 214.000 208.000 L 214.000 168.000 C 214.000 164.686 211.314 162.000 208.000 162.000 ZM 101.130 146.380 L 43.760 203.760 C 42.155 205.256 41.494 207.508 42.037 209.634 C 42.580 211.760 44.240 213.420 46.366 213.963 C 48.492 214.506 50.744 213.845 52.240 212.240 L 109.620 154.870 C 111.964 152.526 111.964 148.724 109.620 146.380 C 107.276 144.036 103.474 144.036 101.130 146.380 Z"),
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
        return _shuffleSimple!!
    }

private var _shuffleSimple: ImageVector? = null
