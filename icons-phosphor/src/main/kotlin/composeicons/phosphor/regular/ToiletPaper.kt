package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorRegularIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 120c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240 120v88c0 8.837-7.163 16-16 16h-112c-8.837 0-16-7.163-16-16v-21.65C87.37 200.37 76.18 208 64 208 50.13 208 37.54 198.11 28.56 180.15 20.46 164 16 142.59 16 120 16 97.41 20.46 76.05 28.56 59.85 37.54 41.89 50.13 32 64 32h128c13.87 0 26.46 9.89 35.44 27.85C235.54 76.05 240 97.41 240 120ZM96 120C96 77.57 79.14 48 64 48 48.86 48 32 77.57 32 120c0 42.43 16.86 72 32 72 15.14 0 32-29.57 32-72ZM224 208v-80h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h15.79C221.84 73.9 206.16 48 192 48h-99.88c2.809 3.71 5.26 7.677 7.32 11.85 7.14 14.28 11.44 32.56 12.37 52.15h16.19c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v80ZM176 112h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
