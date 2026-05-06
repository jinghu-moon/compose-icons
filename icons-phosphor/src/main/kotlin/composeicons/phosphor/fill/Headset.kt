package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorFillIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128v80c0 22.091-17.909 40-40 40h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c13.255 0 24-10.745 24-24h-24c-13.255 0-24-10.745-24-24v-40c0-13.255 10.745-24 24-24h23.65C212.56 86.051 190.14 56.941 158.106 45.283 126.072 33.626 90.187 41.518 66 65.54 51.267 80.079 42.179 99.381 40.36 120h23.64c13.255 0 24 10.745 24 24v40c0 13.255-10.745 24-24 24h-16C34.745 208 24 197.255 24 184v-56C24.046 85.87 49.478 47.921 88.428 31.862c38.95-16.058 83.738-7.059 113.462 22.798C221.271 74.136 232.105 100.524 232 128Z"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
