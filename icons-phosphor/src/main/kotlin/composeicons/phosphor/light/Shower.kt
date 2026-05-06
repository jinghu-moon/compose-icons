package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorLightIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M62 236c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM84 194c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM20 194c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM52 162c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM254 40c0 3.314-2.686 6-6 6h-29.51L189.59 74.89 167.83 202.32c-.87 5.168-4.555 9.418-9.548 11.012-4.993 1.594-10.458 .266-14.162-3.442l-98-98c-3.709-3.708-5.034-9.179-3.433-14.173 1.601-4.995 5.859-8.675 11.033-9.537L181.12 66.42 211.77 35.77C212.89 34.643 214.411 34.007 216 34h32c3.314 0 6 2.686 6 6ZM176.66 79.34 55.7 100c-.744 .115-1.361 .638-1.596 1.354-.234 .716-.047 1.503 .486 2.036l98 98c.53 .532 1.314 .722 2.028 .492 .715-.23 1.241-.841 1.362-1.582Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
