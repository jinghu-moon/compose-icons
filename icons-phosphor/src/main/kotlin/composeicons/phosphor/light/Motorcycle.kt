package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) return _motorcycle!!
        _motorcycle = phosphorLightIcon(
            name = "Motorcycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 122c-2.645 .002-5.282 .277-7.87 .82L200.9 104c4.923-1.33 10.001-2.002 15.1-2 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-20.49L181.6 53.85C180.71 51.531 178.484 50.001 176 50h-32c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h27.88l10.77 28h-30.65c-18 0-32.58 4.15-42.1 12-5.34 4.314-12.666 5.225-18.9 2.35C77.9 98.38 30.4 79.19 26 77.46L20.28 75.22C18.924 74.598 17.48 74.186 16 74c-2.89 .002-5.369 2.064-5.895 4.907-.527 2.842 1.048 5.656 3.745 6.693h0c.46 .18 47.13 18.26 72.23 29.67 10.399 4.746 22.589 3.197 31.47-4 7.34-6 19.25-9.25 34.46-9.25h24.89c-13.784 9.27-23.822 23.14-28.32 39.13-2.235 7.66-9.281 12.906-17.26 12.85h-53.8C74.391 134.429 56.745 120.55 36.987 122.119 17.23 123.689 1.997 140.18 1.997 160c0 19.82 15.233 36.311 34.991 37.881C56.745 199.45 74.391 185.571 77.52 166h53.8c13.359 .033 25.119-8.8 28.81-21.64 4.395-15.607 15.122-28.662 29.58-36l7.23 18.8c-16.474 9.591-23.292 29.902-15.943 47.491 7.349 17.588 26.592 27.01 44.992 22.029 18.4-4.981 30.262-22.824 27.734-41.718C251.196 136.068 235.062 121.97 216 122ZM40 166h25.29c-3.044 12.835-15.217 21.356-28.319 19.824C23.87 184.292 13.992 173.191 13.992 160c0-13.191 9.878-24.292 22.98-25.824 13.102-1.532 25.275 6.989 28.319 19.824h-25.29c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM216 186c-11.394-.006-21.457-7.43-24.825-18.316-3.368-10.885 .745-22.695 10.145-29.134l9.08 23.6c1.236 3.019 4.658 4.497 7.703 3.328 3.045-1.169 4.599-4.557 3.497-7.628l-9.08-23.61c1.154-.156 2.316-.236 3.48-.24 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
