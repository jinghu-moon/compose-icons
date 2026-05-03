package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorFillIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 72.000 112.000 L 144.000 112.000 L 144.000 184.000 L 72.000 184.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 96.000 72.000 C 96.000 76.418 99.582 80.000 104.000 80.000 C 108.418 80.000 112.000 76.418 112.000 72.000 L 128.000 72.000 C 132.418 72.000 136.000 68.418 136.000 64.000 C 136.000 59.582 132.418 56.000 128.000 56.000 L 112.000 56.000 C 103.163 56.000 96.000 63.163 96.000 72.000 ZM 160.000 112.000 C 160.000 103.163 152.837 96.000 144.000 96.000 L 72.000 96.000 C 63.163 96.000 56.000 103.163 56.000 112.000 L 56.000 184.000 C 56.000 192.837 63.163 200.000 72.000 200.000 L 144.000 200.000 C 152.837 200.000 160.000 192.837 160.000 184.000 ZM 200.000 128.000 C 200.000 123.582 196.418 120.000 192.000 120.000 C 187.582 120.000 184.000 123.582 184.000 128.000 L 184.000 144.000 C 179.582 144.000 176.000 147.582 176.000 152.000 C 176.000 156.418 179.582 160.000 184.000 160.000 C 192.837 160.000 200.000 152.837 200.000 144.000 ZM 200.000 72.000 C 200.000 63.163 192.837 56.000 184.000 56.000 L 168.000 56.000 C 163.582 56.000 160.000 59.582 160.000 64.000 C 160.000 68.418 163.582 72.000 168.000 72.000 L 184.000 72.000 L 184.000 88.000 C 184.000 92.418 187.582 96.000 192.000 96.000 C 196.418 96.000 200.000 92.418 200.000 88.000 Z"),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
