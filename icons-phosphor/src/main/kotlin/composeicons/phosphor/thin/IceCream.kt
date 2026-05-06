package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorThinIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 100.4v-4.4C204 54.026 169.974 20 128 20 86.026 20 52 54.026 52 96v4.4c-10.07 2.045-16.951 11.387-15.919 21.61C37.114 132.233 45.725 140.01 56 140h5.61l56 97.95c2.136 3.74 6.113 6.048 10.42 6.048 4.307 0 8.284-2.308 10.42-6.048l56-97.95h5.55c10.275 .01 18.886-7.767 19.919-17.99C220.951 111.787 214.07 102.445 204 100.4ZM131.47 234c-.713 1.243-2.037 2.01-3.47 2.01-1.433 0-2.757-.767-3.47-2.01L70.82 140h28.57l42.9 75.06ZM137.11 140l24 42.06L146.89 207 108.61 140ZM165.75 174 146.32 140h38.86ZM200 132h-144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 2.209 0 4-1.791 4-4v-8C60 58.445 90.445 28 128 28c37.555 0 68 30.445 68 68v8c0 2.209 1.791 4 4 4 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
