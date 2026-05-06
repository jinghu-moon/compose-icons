package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorThinIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 96c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4ZM144 52h12v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM213.73 155.58c.947 1.105 1.218 2.637 .71 4-14.631 40.011-54.819 64.744-97.131 59.777C74.997 214.39 41.63 181.023 36.663 138.711 31.696 96.399 56.429 56.211 96.44 41.58c1.358-.494 2.876-.217 3.972 .724 1.096 .941 1.6 2.399 1.318 3.816C100.579 52.01 99.999 57.998 100 64c.055 50.787 41.213 91.945 92 92 6.012-.001 12.01-.584 17.91-1.74 1.418-.283 2.879 .222 3.82 1.32ZM204.27 163.25c-30.581 3.783-61.198-6.744-82.987-28.533C99.494 112.928 88.967 82.311 92.75 51.73 59.022 67.347 39.567 103.274 44.921 140.055c5.354 36.781 34.243 65.67 71.024 71.024 36.781 5.354 72.707-14.101 88.325-47.829Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
