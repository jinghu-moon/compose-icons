package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorRegularIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 40.000 88.000 L 120.000 88.000 L 120.000 168.000 L 40.000 168.000 ZM 136.000 72.000 L 136.000 56.000 L 168.000 56.000 L 168.000 72.000 ZM 120.000 72.000 L 88.000 72.000 L 88.000 56.000 L 120.000 56.000 ZM 120.000 184.000 L 120.000 200.000 L 88.000 200.000 L 88.000 184.000 ZM 136.000 184.000 L 168.000 184.000 L 168.000 200.000 L 136.000 200.000 ZM 136.000 168.000 L 136.000 88.000 L 216.000 88.000 L 216.000 168.000 ZM 216.000 72.000 L 184.000 72.000 L 184.000 56.000 L 216.000 56.000 ZM 72.000 56.000 L 72.000 72.000 L 40.000 72.000 L 40.000 56.000 ZM 40.000 184.000 L 72.000 184.000 L 72.000 200.000 L 40.000 200.000 ZM 216.000 200.000 L 184.000 200.000 L 184.000 184.000 L 216.000 184.000 L 216.000 200.000 Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
