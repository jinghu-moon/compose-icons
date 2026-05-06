package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhpFill: ImageVector
    get() {
        if (_phpFill != null) return _phpFill!!
        _phpFill = remixIcon(
            name = "PhpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.931 9.46h-1.337l-.73 3.751h1.187c.788 0 1.374-.149 1.76-.445 .385-.297 .645-.792 .779-1.486 .13-.666 .071-1.136-.176-1.41C6.166 9.597 5.673 9.46 4.931 9.46ZM7.382 13.613c-.37 .354-.815 .62-1.299 .781-.476 .153-1.084 .232-1.82 .232h-1.673l-.463 2.381h-1.952L1.916 8.046h3.754c1.129 0 1.952 .296 2.471 .89 .519 .592 .674 1.42 .467 2.482-.079 .42-.225 .826-.432 1.2-.203 .361-.468 .694-.795 .996ZM13.083 14.626l.769-3.965c.089-.451 .055-.759-.096-.922-.152-.164-.476-.247-.973-.247h-1.547l-.997 5.135h-1.938L10.042 5.664h1.937l-.463 2.383h1.726c1.086 0 1.834 .19 2.247 .568 .412 .378 .536 .992 .373 1.84l-.81 4.171h-1.968ZM23.845 11.417c-.078 .421-.224 .826-.432 1.2-.203 .361-.468 .694-.795 .996-.37 .353-.814 .62-1.299 .781-.476 .153-1.084 .232-1.822 .232h-1.672l-.463 2.383h-1.952L17.153 8.047h3.753c1.129 0 1.952 .296 2.471 .89 .519 .591 .676 1.418 .469 2.481ZM20.169 9.46h-1.336l-.731 3.751h1.187c.789 0 1.376-.149 1.76-.445 .385-.297 .645-.792 .781-1.486 .13-.666 .069-1.136-.177-1.41-.247-.273-.742-.411-1.483-.411Z"),
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
        return _phpFill!!
    }

private var _phpFill: ImageVector? = null
