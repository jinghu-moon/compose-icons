package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorFillIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 128c0 22.09-7.16 40-16 40-8.84 0-16-17.91-16-40 0-22.09 7.16-40 16-40 8.84 0 16 17.91 16 40ZM240 224c0 4.418-3.582 8-8 8h-140C58.36 232 32 186.32 32 128 32 69.68 58.36 24 92 24h72c33.64 0 60 45.68 60 104 0 37.47-10.88 69.73-27.59 88h35.59c4.418 0 8 3.582 8 8ZM57.87 111.81c1.665 .003 3.288-.519 4.64-1.49L80 97.83l13.28 9.49c3.588 2.332 8.376 1.427 10.866-2.053 2.49-3.48 1.8-8.304-1.566-10.947L84.65 81.49c-2.782-1.987-6.518-1.987-9.3 0L53.21 97.3c-2.832 2.022-4.031 5.643-2.967 8.956 1.064 3.313 4.147 5.558 7.627 5.554ZM104.54 159.7 84.65 145.49c-2.782-1.987-6.518-1.987-9.3 0L56 159.29c-2.468 1.604-3.856 4.434-3.613 7.367 .243 2.933 2.076 5.497 4.774 6.673 2.698 1.177 5.824 .777 8.139-1.04L80 161.83l15.24 10.88c2.315 1.818 5.441 2.217 8.139 1.04 2.698-1.177 4.532-3.74 4.774-6.673 .243-2.933-1.145-5.763-3.613-7.367ZM193.74 192.07C202.93 175.07 208 152.33 208 128c0-24.33-5.07-47.09-14.26-64.07C185.38 48.5 174.82 40 164 40c-10.82 0-21.38 8.5-29.74 23.93C125.07 80.91 120 103.67 120 128c0 24.33 5.07 47.09 14.26 64.07C142.62 207.5 153.18 216 164 216c10.82 0 21.38-8.5 29.74-23.93Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
