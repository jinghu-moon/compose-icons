package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorLightIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 90h-18v-18C198 51.013 180.987 34 160 34h-11.93C136.47 23.8 120.56 18 104 18 69.81 18 42 42.22 42 72v136c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-10h18c12.15 0 22-9.85 22-22v-64C238 99.85 228.15 90 216 90ZM104 30c14.38 0 28.08 5.22 37.59 14.33 1.116 1.071 2.603 1.669 4.15 1.67h14.26c12.045 .004 22.51 8.28 25.29 20h-130.77C58 45.67 78.86 30 104 30ZM186 208c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-130h132ZM226 176c0 5.523-4.477 10-10 10h-18v-84h18c5.523 0 10 4.477 10 10ZM102 104v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM150 104v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
