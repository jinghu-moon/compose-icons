package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorFillIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 192.000 L 232.000 192.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 192.000 L 16.000 192.000 C 11.582 192.000 8.000 195.582 8.000 200.000 C 8.000 204.418 11.582 208.000 16.000 208.000 L 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 C 248.000 195.582 244.418 192.000 240.000 192.000 ZM 216.000 192.000 L 144.000 192.000 L 144.000 176.000 C 144.000 171.582 147.582 168.000 152.000 168.000 L 208.000 168.000 C 212.418 168.000 216.000 171.582 216.000 176.000 ZM 216.000 144.000 C 216.000 148.418 212.418 152.000 208.000 152.000 C 203.582 152.000 200.000 148.418 200.000 144.000 L 200.000 72.000 L 56.000 72.000 L 56.000 184.000 C 56.000 188.418 52.418 192.000 48.000 192.000 C 43.582 192.000 40.000 188.418 40.000 184.000 L 40.000 64.000 C 40.000 59.582 43.582 56.000 48.000 56.000 L 208.000 56.000 C 212.418 56.000 216.000 59.582 216.000 64.000 Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
