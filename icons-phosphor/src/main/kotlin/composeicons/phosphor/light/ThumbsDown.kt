package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorLightIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.83 157.27l-12-96C224.453 50.261 215.095 42 204 42h-172C24.268 42 18 48.268 18 56v88c0 7.732 6.268 14 14 14h44.29l38.34 76.68c1.016 2.035 3.095 3.321 5.37 3.32 20.987 0 38-17.013 38-38v-18h58c6.311 0 12.317-2.71 16.493-7.441 4.176-4.731 6.12-11.027 5.337-17.289ZM74 146h-42c-1.105 0-2-.895-2-2v-88c0-1.105 .895-2 2-2h42ZM223.5 166.62c-1.891 2.162-4.628 3.396-7.5 3.38h-64c-3.314 0-6 2.686-6 6v24c-.001 12.975-9.568 23.963-22.42 25.75L86 150.58v-96.58h118c5.042 .001 9.295 3.757 9.92 8.76l12 96c.373 2.847-.511 5.716-2.42 7.86Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
