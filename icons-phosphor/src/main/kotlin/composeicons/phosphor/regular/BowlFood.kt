package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorRegularIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 104h-8.37C211.464 58.714 173.478 24.061 128 24.061 82.522 24.061 44.536 58.714 40.37 104h-8.37c-4.418 0-8 3.582-8 8 .072 38.775 21.638 74.314 56 92.28v3.72c0 8.837 7.163 16 16 16h64c8.837 0 16-7.163 16-16v-3.72C210.362 186.314 231.928 150.775 232 112c0-4.418-3.582-8-8-8ZM199.54 104h-51.42c9.699-14.551 24.373-25.065 41.27-29.57 5.525 8.987 8.991 19.085 10.15 29.57ZM173.48 56.23q2.75 2.25 5.27 4.75c-21.296 7.492-38.895 22.888-49.15 43h-29.5C110.345 75.264 137.511 56.067 168 56c1.83 0 3.66 .09 5.48 .23ZM128 40c6.42 .004 12.81 .869 19 2.57C116.315 50.182 92.035 73.607 83.33 104h-26.87C60.568 67.582 91.351 40.044 128 40ZM164.66 192c-2.85 1.309-4.672 4.164-4.66 7.3v8.7h-64v-8.7c.012-3.136-1.81-5.991-4.66-7.3C62.707 178.824 43.269 151.383 40.34 120h175.29c-2.924 31.376-22.348 58.816-50.97 72Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
