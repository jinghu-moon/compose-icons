package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorBoldIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 120c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM244 120v88c0 11.046-8.954 20-20 20h-112c-11.046 0-20-8.954-20-20v-9.61C84 207.07 74.46 212 64 212 34.35 212 12 172.45 12 120 12 67.55 34.35 28 64 28h128c29.65 0 52 39.55 52 92ZM92 120C92 100.74 88.19 82.08 81.55 68.8 76.29 58.28 69.73 52 64 52 58.27 52 51.71 58.28 46.45 68.8 39.81 82.08 36 100.74 36 120c0 19.26 3.81 37.92 10.45 51.2C51.71 181.72 58.27 188 64 188c5.73 0 12.29-6.28 17.55-16.8C88.19 157.92 92 139.26 92 120ZM220 204v-72h-8c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h7.5C218.27 93.15 214.8 79.29 209.55 68.8 204.3 58.31 197.73 52 192 52h-92.26c8.61 14.11 14.35 33.56 15.86 56h8.4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v72ZM172 108h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
