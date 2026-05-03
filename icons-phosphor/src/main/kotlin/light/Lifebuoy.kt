package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorLightIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 164.470 156.000 C 177.187 139.499 177.187 116.501 164.470 100.000 L 195.710 68.770 C 225.431 102.656 225.431 153.324 195.710 187.210 ZM 94.000 128.000 C 94.000 109.222 109.222 94.000 128.000 94.000 C 146.778 94.000 162.000 109.222 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 ZM 187.220 60.290 L 156.000 91.530 C 139.499 78.813 116.501 78.813 100.000 91.530 L 68.780 60.290 C 102.666 30.569 153.334 30.569 187.220 60.290 ZM 60.290 68.780 L 91.530 100.000 C 78.813 116.501 78.813 139.499 91.530 156.000 L 60.290 187.220 C 30.569 153.334 30.569 102.666 60.290 68.780 ZM 68.780 195.710 L 100.000 164.470 C 116.501 177.187 139.499 177.187 156.000 164.470 L 187.230 195.710 C 153.344 225.431 102.676 225.431 68.790 195.710 Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
