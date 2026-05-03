package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionForeground: ImageVector
    get() {
        if (_selectionForeground != null) return _selectionForeground!!
        _selectionForeground = phosphorFillIcon(
            name = "SelectionForeground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 88.000 200.000 L 72.000 200.000 C 63.163 200.000 56.000 192.837 56.000 184.000 L 56.000 168.000 C 56.000 163.582 59.582 160.000 64.000 160.000 C 68.418 160.000 72.000 163.582 72.000 168.000 L 72.000 184.000 L 88.000 184.000 C 92.418 184.000 96.000 187.582 96.000 192.000 C 96.000 196.418 92.418 200.000 88.000 200.000 ZM 88.000 112.000 L 72.000 112.000 L 72.000 128.000 C 72.000 132.418 68.418 136.000 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 L 56.000 112.000 C 56.000 103.163 63.163 96.000 72.000 96.000 L 88.000 96.000 C 92.418 96.000 96.000 99.582 96.000 104.000 C 96.000 108.418 92.418 112.000 88.000 112.000 ZM 160.000 184.000 C 160.000 192.837 152.837 200.000 144.000 200.000 L 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 C 120.000 187.582 123.582 184.000 128.000 184.000 L 144.000 184.000 L 144.000 168.000 C 144.000 163.582 147.582 160.000 152.000 160.000 C 156.418 160.000 160.000 163.582 160.000 168.000 ZM 160.000 128.000 C 160.000 132.418 156.418 136.000 152.000 136.000 C 147.582 136.000 144.000 132.418 144.000 128.000 L 144.000 112.000 L 128.000 112.000 C 123.582 112.000 120.000 108.418 120.000 104.000 C 120.000 99.582 123.582 96.000 128.000 96.000 L 144.000 96.000 C 152.837 96.000 160.000 103.163 160.000 112.000 ZM 200.000 144.000 C 200.000 152.837 192.837 160.000 184.000 160.000 C 179.582 160.000 176.000 156.418 176.000 152.000 C 176.000 147.582 179.582 144.000 184.000 144.000 L 184.000 144.000 L 184.000 72.000 L 112.000 72.000 C 112.000 76.418 108.418 80.000 104.000 80.000 C 99.582 80.000 96.000 76.418 96.000 72.000 C 96.000 63.163 103.163 56.000 112.000 56.000 L 184.000 56.000 C 192.837 56.000 200.000 63.163 200.000 72.000 Z"),
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
        return _selectionForeground!!
    }

private var _selectionForeground: ImageVector? = null
