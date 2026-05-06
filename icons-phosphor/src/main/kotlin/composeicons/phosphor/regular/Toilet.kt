package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorRegularIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
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
