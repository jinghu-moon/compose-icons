package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorFillIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 144.000 120.000 C 148.418 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 148.418 136.000 144.000 136.000 L 136.000 136.000 L 136.000 160.000 C 136.000 168.837 143.163 176.000 152.000 176.000 L 160.000 176.000 C 164.418 176.000 168.000 179.582 168.000 184.000 C 168.000 188.418 164.418 192.000 160.000 192.000 L 152.000 192.000 C 142.808 192.001 134.062 188.040 128.000 181.130 C 121.938 188.040 113.192 192.001 104.000 192.000 L 96.000 192.000 C 91.582 192.000 88.000 188.418 88.000 184.000 C 88.000 179.582 91.582 176.000 96.000 176.000 L 104.000 176.000 C 112.837 176.000 120.000 168.837 120.000 160.000 L 120.000 136.000 L 112.000 136.000 C 107.582 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 107.582 120.000 112.000 120.000 L 120.000 120.000 L 120.000 96.000 C 120.000 87.163 112.837 80.000 104.000 80.000 L 96.000 80.000 C 91.582 80.000 88.000 76.418 88.000 72.000 C 88.000 67.582 91.582 64.000 96.000 64.000 L 104.000 64.000 C 113.192 63.999 121.938 67.960 128.000 74.870 C 134.062 67.960 142.808 63.999 152.000 64.000 L 160.000 64.000 C 164.418 64.000 168.000 67.582 168.000 72.000 C 168.000 76.418 164.418 80.000 160.000 80.000 L 152.000 80.000 C 143.163 80.000 136.000 87.163 136.000 96.000 L 136.000 120.000 Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
