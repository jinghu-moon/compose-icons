package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorLightIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM165.57 98.23l-32 80c-.912 2.277-3.117 3.77-5.57 3.77-2.453 0-4.658-1.493-5.57-3.77l-32-80c-.816-1.994-.501-4.273 .827-5.97 1.328-1.697 3.463-2.552 5.595-2.24 2.132 .312 3.933 1.744 4.718 3.75L128 159.84 154.43 93.77c1.249-3.05 4.723-4.521 7.783-3.297 3.059 1.225 4.558 4.688 3.357 7.757Z"),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
