package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mountains: ImageVector
    get() {
        if (_mountains != null) return _mountains!!
        _mountains = phosphorThinIcon(
            name = "Mountains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76c13.255 0 24-10.745 24-24C188 38.745 177.255 28 164 28c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24ZM164 36c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM251.44 198 196.88 105.92c-2.139-3.676-6.077-5.933-10.33-5.92h0c-4.243-.022-8.175 2.219-10.32 5.88l-29.61 50L98.34 73.91C96.183 70.248 92.25 68 88 68c-4.25 0-8.183 2.248-10.34 5.91L4.55 198c-.713 1.235-.715 2.757-.004 3.994 .711 1.237 2.027 2.001 3.454 2.006h240c1.425-.009 2.737-.774 3.446-2.01 .709-1.236 .706-2.756-.006-3.99ZM84.55 78c.718-1.224 2.031-1.976 3.45-1.976 1.419 0 2.732 .752 3.45 1.976l27.12 46h-61.14ZM15 196 52.71 132h70.58L161 196ZM170.29 196l-19-32.29L183.11 110c.721-1.214 2.028-1.959 3.44-1.959 1.412 0 2.719 .744 3.44 1.959l51 86Z"),
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
        return _mountains!!
    }

private var _mountains: ImageVector? = null
