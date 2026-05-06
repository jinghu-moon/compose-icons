package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorRegularIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.64 199.28C128.836 185.622 111.96 158.083 111.96 128c0-30.083 16.876-57.622 43.68-71.28 2.677-1.367 4.362-4.119 4.362-7.125 0-3.006-1.685-5.758-4.362-7.125C142.139 35.542 127.174 31.952 112 32 58.981 32 16 74.981 16 128c0 53.019 42.981 96 96 96 15.174 .048 30.139-3.542 43.64-10.47 2.677-1.367 4.362-4.119 4.362-7.125 0-3.006-1.685-5.758-4.362-7.125ZM112 208C80.731 207.946 52.36 189.679 39.369 161.237 26.378 132.795 31.149 99.39 51.582 75.722 72.016 52.053 104.366 42.459 134.4 51.16 110.225 69.307 96 97.772 96 128c0 30.228 14.225 58.693 38.4 76.84-7.279 2.111-14.821 3.175-22.4 3.16ZM251.17 120.65 224.67 109.22 222.36 79.38c-.256-3.249-2.457-6.017-5.564-6.999-3.107-.982-6.499 .018-8.576 2.529L189.63 97.42 161.92 90.57c-3.124-.769-6.404 .408-8.326 2.987-1.922 2.579-2.113 6.059-.484 8.833L168.18 128l-15.07 25.61c-1.629 2.774-1.439 6.254 .484 8.833 1.922 2.579 5.203 3.756 8.326 2.987l27.71-6.85 18.59 22.51c2.077 2.511 5.469 3.512 8.576 2.529 3.107-.982 5.308-3.751 5.564-6.999l2.31-29.84 26.5-11.43c2.938-1.262 4.841-4.153 4.841-7.35 0-3.197-1.904-6.088-4.841-7.35ZM213.89 134c-2.725 1.179-4.573 3.77-4.8 6.73l-1.15 14.89-9.18-11.11c-1.519-1.842-3.782-2.909-6.17-2.91-.647 .002-1.291 .08-1.92 .23l-14.12 3.5 7.81-13.27c1.476-2.506 1.476-5.614 0-8.12l-7.81-13.27 14.12 3.5c2.988 .737 6.133-.305 8.09-2.68l9.18-11.11 1.15 14.89c.227 2.96 2.075 5.551 4.8 6.73l13.92 6Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
