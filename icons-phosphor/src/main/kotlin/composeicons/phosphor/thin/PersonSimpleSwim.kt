package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorThinIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 100c15.464 0 28-12.536 28-28C204 56.536 191.464 44 176 44c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM176 52c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C164.954 92 156 83.046 156 72c0-11.046 8.954-20 20-20ZM219.08 187.84c1.408 1.701 1.17 4.221-.53 5.63C203.56 205.9 188.9 212 173.93 212c-2.045 .001-4.088-.113-6.12-.34-15-1.65-28.6-9-41.72-16.14-25.52-13.86-49.62-27-83.54 1.18-1.706 1.338-4.167 1.074-5.55-.596-1.383-1.67-1.183-4.138 .45-5.564 17-14.12 33.62-20.07 50.74-18.19 15 1.65 28.6 9 41.72 16.14 25.52 13.86 49.62 26.94 83.54-1.18 1.701-1.408 4.221-1.17 5.63 .53ZM40 84h24.24c17.09-.035 33.847 4.721 48.37 13.73L78.19 132.16c-13.63 1-27 7-40.74 18.38-1.633 1.426-1.833 3.894-.45 5.564 1.383 1.67 3.844 1.934 5.55 .596 33.92-28.13 58-15 83.54-1.18 13.12 7.12 26.69 14.49 41.72 16.14 2.032 .227 4.075 .341 6.12 .34 15 0 29.63-6.1 44.62-18.53 1.144-.898 1.711-2.345 1.481-3.781-.23-1.436-1.222-2.633-2.59-3.128-1.368-.494-2.896-.208-3.991 .749-8.12 6.73-15.68 11.1-22.83 13.66L135 105.29C116.276 86.462 90.793 75.914 64.24 76h-24.24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM181.66 163.32c-18.77 3.07-35-5.71-51.75-14.83-12.83-7-26.09-14.15-40.73-16l30.16-30.16c3.514 2.64 6.839 5.524 9.95 8.63Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
