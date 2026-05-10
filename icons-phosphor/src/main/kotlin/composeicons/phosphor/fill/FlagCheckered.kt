package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorFillIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.32 48.75c-2.852-1.295-6.197-.806-8.56 1.25-28 24.22-51.72 12.48-79.21-1.13C111.07 34.76 78.78 18.79 42.76 50h0C41.019 51.509 40.013 53.696 40 56v168c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44.23c26.79-21.16 49.87-9.75 76.45 3.41 16.4 8.11 34.06 16.85 53 16.85 13.93 0 28.54-4.75 43.82-18 1.741-1.509 2.747-3.696 2.76-6v-120.03c-.017-3.13-1.857-5.963-4.71-7.25ZM56 160.44v-50.56C72.85 98.6 88.64 98.29 104 102.54v51.74c-15.13-3.81-31.13-3.57-48 6.16ZM104 50.87c9.25 2.83 18.61 7.45 28.45 12.32 11.26 5.57 23.11 11.43 35.55 14.56v51.74c15.35 4.25 31.14 3.94 48-7.35v50.11c-16.87 13.32-32.27 13.72-48 8.91v-51.67c-21.62-6-42.38-21-64-26.95Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
