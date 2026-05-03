package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorFillIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 C 136.000 44.418 132.418 48.000 128.000 48.000 L 48.000 48.000 L 48.000 208.000 L 208.000 208.000 L 208.000 128.000 C 208.000 123.582 211.582 120.000 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 229.660 69.660 L 133.660 165.660 C 132.158 167.160 130.122 168.002 128.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 L 88.000 128.000 C 87.998 125.878 88.840 123.842 90.340 122.340 L 186.340 26.340 C 187.841 24.838 189.877 23.994 192.000 23.994 C 194.123 23.994 196.159 24.838 197.660 26.340 L 229.660 58.340 C 231.162 59.841 232.006 61.877 232.006 64.000 C 232.006 66.123 231.162 68.159 229.660 69.660 ZM 212.660 64.000 L 192.000 43.310 L 179.310 56.000 L 200.000 76.690 Z"),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
