package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorBoldIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 120.000 140.000 C 113.373 140.000 108.000 134.627 108.000 128.000 C 108.000 121.373 113.373 116.000 120.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 120.000 76.000 L 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 L 120.000 52.000 C 113.373 52.000 108.000 57.373 108.000 64.000 C 108.000 70.627 113.373 76.000 120.000 76.000 ZM 216.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 31.510 144.490 C 33.762 146.749 36.820 148.019 40.010 148.019 C 43.200 148.019 46.258 146.749 48.510 144.490 L 88.510 104.490 C 90.769 102.238 92.039 99.180 92.039 95.990 C 92.039 92.800 90.769 89.742 88.510 87.490 L 48.510 47.490 C 43.816 42.796 36.204 42.796 31.510 47.490 C 26.816 52.184 26.816 59.796 31.510 64.490 L 63.000 96.000 L 31.510 127.510 C 29.257 129.761 27.991 132.815 27.991 136.000 C 27.991 139.185 29.257 142.239 31.510 144.490 Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
