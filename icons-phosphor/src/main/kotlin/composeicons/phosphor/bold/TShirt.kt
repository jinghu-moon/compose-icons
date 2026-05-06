package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorBoldIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.17 57.9 198.09 29.65h0C196.245 28.562 194.141 27.992 192 28h-32c-6.627 0-12 5.373-12 12 0 11.046-8.954 20-20 20C116.954 60 108 51.046 108 40 108 33.373 102.627 28 96 28h-32c-2.136-.001-4.232 .572-6.07 1.66h0L9.83 57.9C.853 63.258-2.545 74.585 2 84l17.9 36.8c3.258 6.857 10.179 11.219 17.77 11.2h14.33v76c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-76h14.32c7.576 .012 14.483-4.335 17.75-11.17L254 84c4.545-9.415 1.147-20.742-7.83-26.1ZM40.37 108 25.16 76.73 52 61v47ZM180 204h-104v-152h9.67c5.357 18.947 22.65 32.028 42.34 32.028 19.69 0 36.983-13.081 42.34-32.028h9.65ZM215.62 108h-11.62v-47l26.83 15.76Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
