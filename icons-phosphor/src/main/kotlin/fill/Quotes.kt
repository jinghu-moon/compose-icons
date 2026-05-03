package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorFillIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 72.000 L 116.000 160.000 C 115.972 186.498 94.498 207.972 68.000 208.000 C 63.582 208.000 60.000 204.418 60.000 200.000 C 60.000 195.582 63.582 192.000 68.000 192.000 C 85.673 192.000 100.000 177.673 100.000 160.000 L 100.000 152.000 L 40.000 152.000 C 31.163 152.000 24.000 144.837 24.000 136.000 L 24.000 72.000 C 24.000 63.163 31.163 56.000 40.000 56.000 L 100.000 56.000 C 108.837 56.000 116.000 63.163 116.000 72.000 ZM 216.000 56.000 L 156.000 56.000 C 147.163 56.000 140.000 63.163 140.000 72.000 L 140.000 136.000 C 140.000 144.837 147.163 152.000 156.000 152.000 L 216.000 152.000 L 216.000 160.000 C 216.000 177.673 201.673 192.000 184.000 192.000 C 179.582 192.000 176.000 195.582 176.000 200.000 C 176.000 204.418 179.582 208.000 184.000 208.000 C 210.498 207.972 231.972 186.498 232.000 160.000 L 232.000 72.000 C 232.000 63.163 224.837 56.000 216.000 56.000 Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
