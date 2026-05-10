package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShippingContainer: ImageVector
    get() {
        if (_shippingContainer != null) return _shippingContainer!!
        _shippingContainer = phosphorFillIcon(
            name = "ShippingContainer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.4 70.65 130.2 40.31c-1.081-.31-2.216-.388-3.33-.23L21.74 55.1C13.874 56.257 8.034 62.989 8 70.94v114.12c.034 7.951 5.874 14.683 13.74 15.84l105.13 15c.374 .059 .752 .092 1.13 .1 .744 .001 1.485-.103 2.2-.31L236.4 185.35C243.241 183.369 247.962 177.122 248 170v-84c-.038-7.122-4.759-13.369-11.6-15.35ZM64 120h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v54.78L24 185.06v-114.12L64 65.22ZM120 198.78 80 193.06v-57.06h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-57.06l40-5.72Z"),
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
        return _shippingContainer!!
    }

private var _shippingContainer: ImageVector? = null
