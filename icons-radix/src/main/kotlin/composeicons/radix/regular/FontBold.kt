package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontBold: ImageVector
    get() {
        if (_fontBold != null) return _fontBold!!
        _fontBold = radixIcon(
            name = "FontBold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.028 3c1.109 0 2.025 .982 2.025 2.185 0 .9-.45 1.634-1.351 2.052 1.162 .212 1.814 1.392 1.814 2.245C11.517 10.513 10.99 12 9.277 12h-4.172c-.397 0-.682-.088-.854-.264C4.084 11.556 4 11.272 4 10.883v-6.766c0-.397 .086-.682 .258-.854C4.434 3.088 4.717 3 5.105 3h3.923ZM5.8 10.631h2.579c.521 0 1.251-.51 1.251-1.332C9.63 8.476 8.9 8.003 8.379 8.003h-2.579v2.628ZM5.8 6.695h2.38c.359 0 1.098-.336 1.098-1.195C9.277 4.641 8.48 4.369 8.18 4.369h-2.38v2.326Z"),
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
        return _fontBold!!
    }

private var _fontBold: ImageVector? = null
