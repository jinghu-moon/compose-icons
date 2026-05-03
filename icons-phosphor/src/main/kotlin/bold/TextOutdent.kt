package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorBoldIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 128.000 C 228.000 134.627 222.627 140.000 216.000 140.000 L 120.000 140.000 C 113.373 140.000 108.000 134.627 108.000 128.000 C 108.000 121.373 113.373 116.000 120.000 116.000 L 216.000 116.000 C 222.627 116.000 228.000 121.373 228.000 128.000 ZM 120.000 76.000 L 216.000 76.000 C 222.627 76.000 228.000 70.627 228.000 64.000 C 228.000 57.373 222.627 52.000 216.000 52.000 L 120.000 52.000 C 113.373 52.000 108.000 57.373 108.000 64.000 C 108.000 70.627 113.373 76.000 120.000 76.000 ZM 216.000 180.000 L 40.000 180.000 C 33.373 180.000 28.000 185.373 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 72.000 148.000 C 76.856 148.004 81.236 145.080 83.095 140.593 C 84.954 136.107 83.926 130.942 80.490 127.510 L 49.000 96.000 L 80.490 64.480 C 85.184 59.786 85.184 52.174 80.490 47.480 C 75.796 42.786 68.184 42.786 63.490 47.480 L 23.490 87.480 C 21.231 89.732 19.961 92.790 19.961 95.980 C 19.961 99.170 21.231 102.228 23.490 104.480 L 63.490 144.480 C 65.746 146.738 68.808 148.005 72.000 148.000 Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
