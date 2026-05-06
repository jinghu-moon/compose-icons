package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorThinIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.08 155.84c1.408 1.701 1.17 4.221-.53 5.63C203.56 173.9 188.9 180 173.93 180c-2.045 .001-4.088-.113-6.12-.34-15-1.65-28.6-9-41.72-16.14-25.52-13.86-49.62-27-83.54 1.18-1.706 1.338-4.167 1.074-5.55-.596-1.383-1.67-1.183-4.138 .45-5.564 17-14.12 33.62-20.07 50.74-18.2 15 1.65 28.6 9 41.72 16.15 25.52 13.86 49.62 26.94 83.54-1.18 1.701-1.408 4.221-1.17 5.63 .53ZM42.55 100.69c33.92-28.12 58-15 83.54-1.18 13.12 7.13 26.69 14.5 41.72 16.15 2.033 .219 4.076 .329 6.12 .33 15 0 29.63-6.1 44.62-18.53 1.144-.898 1.711-2.345 1.481-3.781-.23-1.436-1.222-2.633-2.59-3.128-1.368-.494-2.896-.208-3.991 .749-33.92 28.13-58 15-83.54 1.18C116.79 85.35 103.22 78 88.19 76.34 71.07 74.46 54.47 80.41 37.45 94.53c-1.144 .898-1.711 2.345-1.481 3.781 .23 1.436 1.222 2.633 2.59 3.128 1.368 .494 2.896 .208 3.991-.749Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
