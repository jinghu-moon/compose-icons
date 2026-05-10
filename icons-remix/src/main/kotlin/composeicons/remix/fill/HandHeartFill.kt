package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandHeartFill: ImageVector
    get() {
        if (_handHeartFill != null) return _handHeartFill!!
        _handHeartFill = remixIcon(
            name = "HandHeartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.335 11.502l2.17 0c2.485 0 4.5 2.015 4.5 4.5L9.004 16.002l.001 1.001 8-.001v-.999c0-1.083-.318-2.103-.886-3.001l2.886 .001c1.992 0 3.712 1.165 4.516 2.851-2.365 3.121-6.194 5.149-10.516 5.149-2.761 0-5.101-.591-7-1.625l.001-9.304c1.246 .178 2.385 .685 3.329 1.429ZM4.005 9.003c.513 0 .936 .386 .993 .883l.007 .116v9.001c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-9c0-.552 .448-1 1-1h2ZM13.651 3.578l.353 .354 .354-.354c.976-.976 2.559-.976 3.536 0 .976 .976 .976 2.559 0 3.536l-3.889 3.889L10.116 7.114c-.976-.976-.976-2.559 0-3.536 .976-.976 2.559-.976 3.536 0Z"),
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
        return _handHeartFill!!
    }

private var _handHeartFill: ImageVector? = null
