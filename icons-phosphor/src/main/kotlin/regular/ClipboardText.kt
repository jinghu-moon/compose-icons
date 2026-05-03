package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorRegularIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 152.000 C 168.000 156.418 164.418 160.000 160.000 160.000 L 96.000 160.000 C 91.582 160.000 88.000 156.418 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 L 160.000 144.000 C 164.418 144.000 168.000 147.582 168.000 152.000 ZM 160.000 112.000 L 96.000 112.000 C 91.582 112.000 88.000 115.582 88.000 120.000 C 88.000 124.418 91.582 128.000 96.000 128.000 L 160.000 128.000 C 164.418 128.000 168.000 124.418 168.000 120.000 C 168.000 115.582 164.418 112.000 160.000 112.000 ZM 216.000 48.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 48.000 C 40.000 39.163 47.163 32.000 56.000 32.000 L 92.260 32.000 C 101.351 21.821 114.352 16.001 128.000 16.001 C 141.648 16.001 154.648 21.821 163.740 32.000 L 200.000 32.000 C 208.837 32.000 216.000 39.163 216.000 48.000 ZM 96.000 64.000 L 160.000 64.000 C 160.000 46.327 145.673 32.000 128.000 32.000 C 110.327 32.000 96.000 46.327 96.000 64.000 ZM 200.000 48.000 L 173.250 48.000 C 175.070 53.138 176.000 58.549 176.000 64.000 L 176.000 72.000 C 176.000 76.418 172.418 80.000 168.000 80.000 L 88.000 80.000 C 83.582 80.000 80.000 76.418 80.000 72.000 L 80.000 64.000 C 80.000 58.549 80.930 53.138 82.750 48.000 L 56.000 48.000 L 56.000 216.000 L 200.000 216.000 Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
