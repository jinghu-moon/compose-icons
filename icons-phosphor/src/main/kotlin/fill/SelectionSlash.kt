package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorFillIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 152.000 56.000 L 184.000 56.000 C 192.837 56.000 200.000 63.163 200.000 72.000 L 200.000 104.000 C 200.000 108.418 196.418 112.000 192.000 112.000 C 187.582 112.000 184.000 108.418 184.000 104.000 L 184.000 72.000 L 152.000 72.000 C 147.582 72.000 144.000 68.418 144.000 64.000 C 144.000 59.582 147.582 56.000 152.000 56.000 ZM 104.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 192.837 56.000 184.000 L 56.000 152.000 C 56.000 147.582 59.582 144.000 64.000 144.000 C 68.418 144.000 72.000 147.582 72.000 152.000 L 72.000 184.000 L 104.000 184.000 C 108.418 184.000 112.000 187.582 112.000 192.000 C 112.000 196.418 108.418 200.000 104.000 200.000 ZM 205.660 205.660 C 204.159 207.162 202.123 208.006 200.000 208.006 C 197.877 208.006 195.841 207.162 194.340 205.660 L 188.690 200.000 L 152.000 200.000 C 147.582 200.000 144.000 196.418 144.000 192.000 C 144.000 187.582 147.582 184.000 152.000 184.000 L 172.690 184.000 L 72.000 83.310 L 72.000 104.000 C 72.000 108.418 68.418 112.000 64.000 112.000 C 59.582 112.000 56.000 108.418 56.000 104.000 L 56.000 67.310 L 50.340 61.660 C 47.214 58.534 47.214 53.466 50.340 50.340 C 53.466 47.214 58.534 47.214 61.660 50.340 L 69.660 58.340 L 69.660 58.340 L 205.660 194.340 C 207.162 195.841 208.006 197.877 208.006 200.000 C 208.006 202.123 207.162 204.159 205.660 205.660 Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
