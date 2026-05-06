package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorLightIcon(
            name = "PlayCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM175.18 122.91l-64-40c-1.85-1.156-4.182-1.217-6.089-.159C103.183 83.808 101.999 85.818 102 88v80c-.001 2.182 1.183 4.192 3.091 5.249 1.908 1.058 4.24 .997 6.089-.159l64-40c1.756-1.096 2.823-3.02 2.823-5.09 0-2.07-1.067-3.994-2.823-5.09ZM114 157.17v-58.34L160.68 128Z"),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
