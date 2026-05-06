package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) return _motorcycle!!
        _motorcycle = phosphorThinIcon(
            name = "Motorcycle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 124c-3.074-.001-6.136 .393-9.11 1.17l-8.64-22.46c5.746-1.794 11.73-2.708 17.75-2.71 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-21.87L179.73 54.56C179.135 53.018 177.653 52.001 176 52h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h29.25l12.31 32h-33.56c-17.56 0-31.67 4-40.83 11.54-5.93 4.801-14.07 5.82-21 2.63C77.06 100.17 29.62 81.05 25.17 79.32 22.83 78.37 17.24 76 16 76c-1.913 .019-3.545 1.39-3.893 3.271-.348 1.881 .684 3.746 2.463 4.449h0c.46 .18 47.42 18.4 72.34 29.72 9.707 4.425 21.082 2.977 29.37-3.74 7.7-6.35 20-9.71 35.73-9.71h32.08c-16.415 8.721-28.547 23.777-33.58 41.67-2.469 8.534-10.306 14.39-19.19 14.34h-55.55C73.647 137.014 57.064 122.993 37.99 124.056 18.915 125.119 3.993 140.896 3.993 160c0 19.104 14.922 34.881 33.997 35.944C57.064 197.007 73.647 182.986 75.77 164h55.55c12.465 .035 23.441-8.202 26.89-20.18 4.757-16.887 16.659-30.85 32.58-38.22l8.64 22.46c-16.166 8.406-23.502 27.565-17.085 44.618 6.417 17.053 24.564 26.623 42.261 22.287 17.697-4.336 29.364-21.211 27.171-39.3C249.583 137.578 234.221 123.981 216 124ZM40 164h27.71c-2.098 14.535-15.07 24.98-29.718 23.928C23.344 186.876 11.997 174.686 11.997 160c0-14.686 11.347-26.876 25.995-27.928 14.648-1.052 27.62 9.393 29.718 23.928h-27.71c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM216 188c-12.734-.009-23.858-8.608-27.074-20.93-3.215-12.321 2.288-25.26 13.394-31.49l10 25.86c.588 1.525 2.045 2.539 3.68 2.56 .493 .003 .982-.089 1.44-.27 2.059-.796 3.084-3.11 2.29-5.17l-9.94-25.86c10.487-2.39 21.416 1.438 28.119 9.85 6.703 8.412 7.995 19.92 3.325 29.608C236.564 181.847 226.756 188.005 216 188Z"),
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
