package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorRegularIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.16 177.25c2.823 3.385 2.376 8.416-1 11.25C203.8 202.89 188.3 208 174.16 208c-18.58 0-34.82-8.82-49.93-17C98.88 177.24 76.99 165.36 45.16 191.74c-2.196 1.852-5.217 2.385-7.914 1.395-2.697-.99-4.656-3.35-5.133-6.183-.477-2.833 .602-5.704 2.827-7.522 40.17-33.28 70.32-16.92 96.93-2.48 25.35 13.75 47.24 25.63 79.07-.74 3.391-2.793 8.4-2.329 11.22 1.04ZM210.89 120.25c-31.83 26.38-53.72 14.5-79.07 .74C105.21 106.56 75.06 90.2 34.89 123.48c-3.359 2.833-3.804 7.845-.997 11.225 2.807 3.381 7.815 3.865 11.217 1.085 31.83-26.38 53.72-14.5 79.07-.74 15.11 8.19 31.35 17 49.93 17 14.14 0 29.64-5.11 47-19.5 2.225-1.818 3.304-4.689 2.827-7.522-.477-2.833-2.436-5.193-5.133-6.183-2.697-.99-5.718-.457-7.914 1.395ZM45.11 79.8C76.94 53.43 98.83 65.31 124.18 79.06c15.11 8.2 31.35 17 49.93 17 14.14 0 29.64-5.12 47-19.5 2.225-1.818 3.304-4.689 2.827-7.522-.477-2.833-2.436-5.193-5.133-6.183-2.697-.99-5.718-.457-7.914 1.395-31.83 26.38-53.72 14.5-79.07 .74C105.21 50.58 75.06 34.22 34.89 67.5c-2.304 1.793-3.448 4.698-2.986 7.58 .462 2.882 2.458 5.284 5.207 6.266 2.749 .982 5.815 .39 7.999-1.547Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
