package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorDuotoneIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M167.92 222.87c.328 2.296-.357 4.621-1.877 6.372-1.52 1.752-3.724 2.758-6.043 2.758h-64c-2.319 0-4.524-1.006-6.043-2.758-1.52-1.752-2.204-4.077-1.877-6.372l4.34-30.36h0c22.662 9.986 48.478 9.986 71.14 0h0ZM184 32h-112c-4.418 0-8 3.582-8 8v72h128v-72c0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M120 64c0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8ZM172.32 197.14l3.52 24.6c.655 4.591-.714 9.241-3.753 12.744-3.039 3.503-7.449 5.516-12.087 5.516h-64c-4.638 0-9.048-2.012-12.087-5.516-3.039-3.503-4.408-8.153-3.753-12.744l3.52-24.6C51.942 180.599 32.027 147.79 32 112c0-4.418 3.582-8 8-8h16v-64C56 31.163 63.163 24 72 24h112c8.837 0 16 7.163 16 16v64h16c4.418 0 8 3.582 8 8-.027 35.79-19.942 68.599-51.68 85.14ZM72 104h112v-64h-112ZM157.07 203.5c-18.916 6-39.224 6-58.14 0L96 224h64ZM207.6 120h-159.2c4.104 40.883 38.511 72.01 79.6 72.01 41.089 0 75.496-31.127 79.6-72.01Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
