package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorThinIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.08 179.84c1.408 1.701 1.17 4.221-.53 5.63C203.56 197.9 188.9 204 173.93 204c-2.045 .001-4.088-.113-6.12-.34-15-1.65-28.6-9-41.72-16.14-25.52-13.86-49.62-27-83.54 1.18-1.706 1.338-4.167 1.074-5.55-.596-1.383-1.67-1.183-4.138 .45-5.564 17-14.12 33.62-20.08 50.74-18.19 15 1.64 28.6 9 41.72 16.14 25.52 13.86 49.62 26.94 83.54-1.18 1.701-1.408 4.221-1.17 5.63 .53ZM213.45 123.31c-33.92 28.12-58 15-83.54 1.17C116.79 117.36 103.22 109.99 88.19 108.34c-17.12-1.88-33.72 4.07-50.74 18.19-1.144 .898-1.711 2.345-1.481 3.781 .23 1.436 1.222 2.633 2.59 3.128 1.368 .494 2.896 .208 3.991-.749 33.92-28.12 58-15 83.54-1.17 13.12 7.12 26.69 14.49 41.72 16.14 2.032 .222 4.075 .336 6.12 .34 15 0 29.63-6.1 44.62-18.53 1.144-.898 1.711-2.345 1.481-3.781-.23-1.436-1.222-2.633-2.59-3.128-1.368-.494-2.896-.208-3.991 .749ZM42.55 76.69C76.47 48.56 100.55 61.69 126.09 75.51c13.12 7.13 26.69 14.5 41.72 16.14 2.032 .227 4.075 .341 6.12 .34 15 0 29.63-6.1 44.62-18.53 1.144-.898 1.711-2.345 1.481-3.781-.23-1.436-1.222-2.633-2.59-3.128-1.368-.494-2.896-.208-3.991 .749-33.92 28.13-58 15-83.54 1.18C116.79 61.35 103.22 54 88.19 52.34 71.07 50.46 54.47 56.41 37.45 70.53c-1.144 .898-1.711 2.345-1.481 3.781 .23 1.436 1.222 2.633 2.59 3.128 1.368 .494 2.896 .208 3.991-.749Z"),
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
