package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorRegularIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 72.000 24.000 C 58.745 24.000 48.000 34.745 48.000 48.000 L 48.000 216.000 C 48.000 224.837 55.163 232.000 64.000 232.000 L 176.000 232.000 C 184.837 232.000 192.000 224.837 192.000 216.000 L 192.000 48.000 C 192.000 43.582 195.582 40.000 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 L 208.000 152.000 C 208.000 156.418 211.582 160.000 216.000 160.000 C 220.418 160.000 224.000 156.418 224.000 152.000 L 224.000 48.000 C 224.000 34.745 213.255 24.000 200.000 24.000 ZM 72.000 40.000 L 177.370 40.000 C 176.459 42.569 175.996 45.275 176.000 48.000 L 176.000 184.000 L 64.000 184.000 L 64.000 48.000 C 64.000 43.582 67.582 40.000 72.000 40.000 ZM 64.000 216.000 L 64.000 200.000 L 176.000 200.000 L 176.000 216.000 Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
