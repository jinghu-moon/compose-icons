package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorRegularIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.65 194.55 198.46 36.75c-.867-4.168-3.359-7.818-6.925-10.144-3.566-2.325-7.911-3.134-12.075-2.246L132.65 34.42c-8.618 1.887-14.106 10.365-12.3 19l33.19 157.8c1.525 7.421 8.044 12.755 15.62 12.78 1.136-.002 2.269-.122 3.38-.36l46.81-10.06c8.629-1.891 14.119-10.386 12.3-19.03ZM136 50.15c0-.06 0-.09 0-.09l46.8-10 3.33 15.87L139.33 66ZM142.62 81.62 189.44 71.57l3.34 15.9L146 97.53ZM149.26 113.19l46.82-10.06 13.3 63.24-46.82 10.06ZM216 197.94l-46.8 10-3.33-15.87L212.67 182 216 197.85c0 .06 0 .09 0 .09ZM104 32h-48C47.163 32 40 39.163 40 48v160c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM56 48h48v16h-48ZM56 80h48v96h-48ZM104 208h-48v-16h48v16Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
