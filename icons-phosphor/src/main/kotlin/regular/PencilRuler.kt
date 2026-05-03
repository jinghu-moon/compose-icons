package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PencilRuler: ImageVector
    get() {
        if (_pencilRuler != null) return _pencilRuler!!
        _pencilRuler = phosphorRegularIcon(
            name = "PencilRuler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 160.000 32.000 C 151.163 32.000 144.000 39.163 144.000 48.000 L 144.000 208.000 C 144.000 216.837 151.163 224.000 160.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 160.000 208.000 L 160.000 176.000 L 184.000 176.000 C 188.418 176.000 192.000 172.418 192.000 168.000 C 192.000 163.582 188.418 160.000 184.000 160.000 L 160.000 160.000 L 160.000 136.000 L 184.000 136.000 C 188.418 136.000 192.000 132.418 192.000 128.000 C 192.000 123.582 188.418 120.000 184.000 120.000 L 160.000 120.000 L 160.000 96.000 L 184.000 96.000 C 188.418 96.000 192.000 92.418 192.000 88.000 C 192.000 83.582 188.418 80.000 184.000 80.000 L 160.000 80.000 L 160.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 77.660 26.340 C 76.159 24.838 74.123 23.994 72.000 23.994 C 69.877 23.994 67.841 24.838 66.340 26.340 L 34.340 58.340 C 32.840 59.842 31.998 61.878 32.000 64.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 96.000 224.000 C 104.837 224.000 112.000 216.837 112.000 208.000 L 112.000 64.000 C 112.002 61.878 111.160 59.842 109.660 58.340 ZM 48.000 176.000 L 48.000 80.000 L 64.000 80.000 L 64.000 176.000 ZM 80.000 80.000 L 96.000 80.000 L 96.000 176.000 L 80.000 176.000 ZM 72.000 43.310 L 92.690 64.000 L 51.310 64.000 ZM 48.000 208.000 L 48.000 192.000 L 96.000 192.000 L 96.000 208.000 Z"),
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
        return _pencilRuler!!
    }

private var _pencilRuler: ImageVector? = null
