package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorThinIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198 56.74C179.374 38.298 154.212 27.967 128 28h-1C72.162 28.548 27.997 73.16 28 128c0 41.22 25.55 75.85 66.69 90.38 3.025 1.073 6.21 1.624 9.42 1.63C119.535 219.949 132.006 207.425 132 192c0-11.046 8.954-20 20-20h46.21c13.082 .062 24.443-8.993 27.3-21.76 1.721-7.578 2.557-15.33 2.49-23.1C227.811 100.607 217.008 75.254 198 56.74ZM217.74 148.46c-2.046 9.128-10.176 15.597-19.53 15.54h-46.21c-15.464 0-28 12.536-28 28-.012 6.481-3.163 12.555-8.456 16.296-5.293 3.741-12.07 4.685-18.184 2.534C59.51 197.46 36 165.72 36 128 35.997 77.559 76.611 36.521 127.05 36h.95c28-.007 54.479 12.737 71.941 34.625 17.462 21.888 24.006 50.536 17.779 77.835ZM136 76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM92 100c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM92 156c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 100c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _palette!!
    }

private var _palette: ImageVector? = null
