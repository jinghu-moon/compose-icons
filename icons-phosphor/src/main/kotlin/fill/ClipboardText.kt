package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorFillIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 32.000 L 163.740 32.000 C 154.648 21.821 141.648 16.001 128.000 16.001 C 114.352 16.001 101.351 21.821 92.260 32.000 L 56.000 32.000 C 47.163 32.000 40.000 39.163 40.000 48.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 48.000 C 216.000 39.163 208.837 32.000 200.000 32.000 ZM 128.000 32.000 C 145.673 32.000 160.000 46.327 160.000 64.000 L 96.000 64.000 C 96.000 46.327 110.327 32.000 128.000 32.000 ZM 160.000 160.000 L 96.000 160.000 C 91.582 160.000 88.000 156.418 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 L 160.000 144.000 C 164.418 144.000 168.000 147.582 168.000 152.000 C 168.000 156.418 164.418 160.000 160.000 160.000 ZM 160.000 128.000 L 96.000 128.000 C 91.582 128.000 88.000 124.418 88.000 120.000 C 88.000 115.582 91.582 112.000 96.000 112.000 L 160.000 112.000 C 164.418 112.000 168.000 115.582 168.000 120.000 C 168.000 124.418 164.418 128.000 160.000 128.000 Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
