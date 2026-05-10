package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeHemisphereWest: ImageVector
    get() {
        if (_globeHemisphereWest != null) return _globeHemisphereWest!!
        _globeHemisphereWest = phosphorFillIcon(
            name = "GlobeHemisphereWest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM216 128c.009 11.29-2.164 22.475-6.4 32.94L164.9 133.45c-1.901-1.173-4.027-1.933-6.24-2.23l-22.82-3.08c-6.429-.838-12.734 2.259-16 7.86h-8.72l-3.8-7.86c-2.129-4.435-6.19-7.636-11-8.67l-8-1.73L96.14 104h16.71c2.704-.005 5.363-.693 7.73-2l12.25-6.76c1.076-.6 2.082-1.318 3-2.14L162.74 68.76c5.558-4.981 6.913-13.152 3.26-19.66l-.36-.65C196.374 63.023 215.975 93.986 216 128ZM40 128c-.013-13.08 2.905-25.996 8.54-37.8l11.34 30.27c1.92 5.093 6.298 8.86 11.62 10l21.43 4.61L96.74 143c2.697 5.495 8.279 8.983 14.4 9h1.48l-7.23 16.23c-2.604 5.841-1.479 12.672 2.86 17.37l.14 .14L128 205.94l-1.94 10C78.267 214.828 40.079 175.806 40 128Z"),
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
        return _globeHemisphereWest!!
    }

private var _globeHemisphereWest: ImageVector? = null
