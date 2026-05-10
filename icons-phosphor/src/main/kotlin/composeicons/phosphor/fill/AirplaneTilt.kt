package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) return _airplaneTilt!!
        _airplaneTilt = phosphorFillIcon(
            name = "AirplaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.52 197.26c1.062 2.921 .337 6.192-1.86 8.39l-24 24c-1.5 1.504-3.536 2.349-5.66 2.35-.263 .015-.527 .015-.79 0-2.385-.235-4.539-1.527-5.87-3.52L133.27 162.36 112 183.59v24.41c-.001 2.119-.843 4.151-2.34 5.65 0 0-14 14.06-15.88 15.88-.782 .818-1.73 1.459-2.78 1.88-4.076 1.66-8.727-.283-10.41-4.35l-.06-.15L65.83 190.15 29 175.42c-2.496-.998-4.323-3.183-4.865-5.816-.541-2.633 .275-5.362 2.175-7.264l16-16C43.819 144.833 45.867 143.99 48 144h24.4L93.67 122.73 27.56 78.65C25.563 77.321 24.268 75.166 24.032 72.779c-.236-2.387 .611-4.754 2.308-6.449l24-24c2.198-2.197 5.469-2.922 8.39-1.86l85.94 31.25L176.2 40.19c10.935-10.935 28.665-10.935 39.6 0 10.935 10.935 10.935 28.665 0 39.6l-31.53 31.53Z"),
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
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
