package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorRegularIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 40C57.909 40 40 57.909 40 80c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C120 57.909 102.091 40 80 40ZM80 104C66.745 104 56 93.255 56 80 56 66.745 66.745 56 80 56c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM176 120c22.091 0 40-17.909 40-40C216 57.909 198.091 40 176 40c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40ZM176 56c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24C162.745 104 152 93.255 152 80c0-13.255 10.745-24 24-24ZM80 136c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM80 200C66.745 200 56 189.255 56 176c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM176 136c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM176 200c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
