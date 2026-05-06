package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorLightIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 149.31c0 15.75-3.07 29.17-8.88 38.81-7.05 11.7-18 17.88-31.68 17.88-26.74 0-46.3-36.51-67-75.17C113.14 98.57 93.55 62 74 62 50.72 62 30 110.83 30 149.31c0 13.57 2.48 24.84 7.16 32.62C42.06 190.05 49.06 194 58.56 194c16.16 0 32.31-25.06 46-49.57 1.739-2.602 5.186-3.43 7.918-1.902 2.731 1.528 3.83 4.899 2.522 7.742C100 177.23 82 206 58.56 206 44.89 206 33.93 199.82 26.88 188.12 21.07 178.48 18 165.06 18 149.31 18 108.82 39.81 50 74 50c26.74 0 46.3 36.51 67 75.17C158.29 157.43 177.88 194 197.44 194c9.5 0 16.5-3.95 21.4-12.07 4.68-7.78 7.16-19.05 7.16-32.62C226 110.83 205.29 62 182 62c-9 0-18.91 7.76-30.14 23.73-1.908 2.712-5.653 3.363-8.365 1.455-2.712-1.908-3.363-5.653-1.455-8.365C150.75 66.45 164.37 50 182 50c34.19 0 56 58.82 56 99.31Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
