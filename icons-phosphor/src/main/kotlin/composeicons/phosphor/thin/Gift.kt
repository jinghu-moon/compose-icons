package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorThinIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76h-49.19c4.583-2.026 8.84-4.722 12.63-8 5.313-4.725 8.416-11.451 8.56-18.56 .229-7.876-2.799-15.498-8.37-21.069C174.058 22.799 166.436 19.771 158.56 20c-7.109 .144-13.835 3.247-18.56 8.56-5.91 6.67-9.63 15.36-12 23.69-2.35-8.33-6.07-17-12-23.69C111.275 23.247 104.549 20.144 97.44 20c-7.876-.229-15.498 2.799-21.069 8.371C70.799 33.942 67.771 41.564 68 49.44c.144 7.109 3.247 13.835 8.56 18.56 3.79 3.278 8.047 5.974 12.63 8h-49.19C33.373 76 28 81.373 28 88v32c0 6.627 5.373 12 12 12h4v68c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-68h4c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM146 33.86c3.265-3.65 7.904-5.774 12.8-5.86h.61c5.566 .006 10.892 2.261 14.77 6.254 3.878 3.992 5.977 9.383 5.82 14.946-.088 4.896-2.211 9.534-5.86 12.8-12.09 10.7-33.07 13.21-42 13.79C132.76 66.93 135.26 46 146 33.86ZM76 49.2c-.157-5.563 1.942-10.954 5.82-14.946C85.698 30.261 91.024 28.006 96.59 28h.61c4.896 .086 9.535 2.21 12.8 5.86 10.71 12.09 13.21 33.07 13.79 42-8.89-.58-29.87-3.09-42-13.79C78.149 58.775 76.05 54.11 76 49.2ZM36 120v-32c0-2.209 1.791-4 4-4h84v40h-84c-2.209 0-4-1.791-4-4ZM52 200v-68h72v72h-68c-2.209 0-4-1.791-4-4ZM204 200c0 2.209-1.791 4-4 4h-68v-72h72ZM220 120c0 2.209-1.791 4-4 4h-84v-40h84c2.209 0 4 1.791 4 4Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
