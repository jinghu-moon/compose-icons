package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorFillIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 206.4c.002 3.007-1.682 5.762-4.36 7.13C142.139 220.458 127.174 224.048 112 224 58.981 224 16 181.019 16 128 16 74.981 58.981 32 112 32c15.174-.048 30.139 3.542 43.64 10.47 2.677 1.367 4.362 4.119 4.362 7.125 0 3.006-1.685 5.758-4.362 7.125C128.836 70.378 111.96 97.917 111.96 128c0 30.083 16.876 57.622 43.68 71.28 2.675 1.367 4.359 4.116 4.36 7.12ZM251.17 120.65 224.67 109.22 222.36 79.38c-.256-3.249-2.457-6.017-5.564-6.999-3.107-.982-6.499 .018-8.576 2.529L189.63 97.42 161.92 90.57c-3.124-.769-6.404 .408-8.326 2.987-1.922 2.579-2.113 6.059-.484 8.833L168.18 128l-15.07 25.61c-1.629 2.774-1.439 6.254 .484 8.833 1.922 2.579 5.203 3.756 8.326 2.987l27.71-6.85 18.59 22.51c2.077 2.511 5.469 3.512 8.576 2.529 3.107-.982 5.308-3.751 5.564-6.999l2.31-29.84 26.5-11.43c2.938-1.262 4.841-4.153 4.841-7.35 0-3.197-1.904-6.088-4.841-7.35Z"),
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
