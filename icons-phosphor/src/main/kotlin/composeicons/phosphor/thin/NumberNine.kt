package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorThinIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 44C106.312 43.994 86.898 57.45 79.29 77.76c-7.608 20.31-1.811 43.209 14.544 57.453 16.355 14.244 39.833 16.842 58.906 6.517L116.51 206c-1.082 1.933-.393 4.378 1.54 5.46 1.933 1.082 4.378 .393 5.46-1.54L173 122c9.286-16.084 9.289-35.899 .008-51.986C163.728 53.928 146.572 44.012 128 44ZM128 140C103.699 140 84 120.301 84 96 84 71.699 103.699 52 128 52c24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
