package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorFillIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 104.000 176.000 C 108.418 176.000 112.000 179.582 112.000 184.000 C 112.000 188.418 108.418 192.000 104.000 192.000 L 72.000 192.000 C 67.582 192.000 64.000 188.418 64.000 184.000 L 64.000 72.000 C 64.000 67.582 67.582 64.000 72.000 64.000 L 104.000 64.000 C 108.418 64.000 112.000 67.582 112.000 72.000 C 112.000 76.418 108.418 80.000 104.000 80.000 L 80.000 80.000 L 80.000 176.000 ZM 192.000 184.000 C 192.000 188.418 188.418 192.000 184.000 192.000 L 152.000 192.000 C 147.582 192.000 144.000 188.418 144.000 184.000 C 144.000 179.582 147.582 176.000 152.000 176.000 L 176.000 176.000 L 176.000 80.000 L 152.000 80.000 C 147.582 80.000 144.000 76.418 144.000 72.000 C 144.000 67.582 147.582 64.000 152.000 64.000 L 184.000 64.000 C 188.418 64.000 192.000 67.582 192.000 72.000 Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
