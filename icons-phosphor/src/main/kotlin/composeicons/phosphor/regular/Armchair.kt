package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorRegularIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 88.8v-16.8C216 49.909 198.091 32 176 32h-96C57.909 32 40 49.909 40 72v16.8C21.357 92.586 7.96 108.977 7.96 128c0 19.023 13.398 35.414 32.04 39.2v32.8c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-32.8c18.643-3.786 32.04-20.177 32.04-39.2C248.04 108.977 234.643 92.586 216 88.8ZM80 48h96c13.255 0 24 10.745 24 24v16.8C181.388 92.627 168.023 108.999 168 128h-80C87.977 108.999 74.612 92.627 56 88.8v-16.8C56 58.745 66.745 48 80 48ZM208.39 152h-.39c-4.418 0-8 3.582-8 8v40h-144v-40c0-4.418-3.582-8-8-8h-.39C34.408 151.785 23.859 140.947 24.001 127.744c.142-13.203 10.923-23.811 24.126-23.741C61.331 104.074 71.998 114.796 72 128v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h80v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40c.002-13.204 10.669-23.926 23.872-23.996 13.204-.07 23.984 10.538 24.126 23.741 .142 13.203-10.407 24.041-23.609 24.256Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
