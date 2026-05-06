package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackLine: ImageVector
    get() {
        if (_stackLine != null) return _stackLine!!
        _stackLine = remixIcon(
            name = "StackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.083 15.2l1.202 .721c.237 .142 .313 .449 .171 .686-.042 .07-.101 .129-.171 .171l-8.771 5.263c-.317 .19-.712 .19-1.029 0L2.715 16.779c-.237-.142-.314-.449-.171-.686 .042-.07 .101-.129 .171-.171l1.202-.721 8.083 4.85 8.083-4.85ZM20.083 10.5l1.202 .721c.237 .142 .313 .449 .171 .686-.042 .07-.101 .129-.171 .172l-9.286 5.571L2.715 12.079c-.237-.142-.314-.449-.171-.686 .042-.07 .101-.129 .171-.172l1.202-.721 8.083 4.85 8.083-4.85ZM12.514 1.309l8.771 5.263c.237 .142 .313 .449 .171 .686-.042 .07-.101 .129-.171 .171l-9.286 5.571L2.715 7.429C2.478 7.287 2.401 6.979 2.543 6.743c.042-.07 .101-.129 .171-.172L11.485 1.309c.317-.19 .712-.19 1.029 0ZM12 3.332 5.887 7l6.113 3.668L18.113 7 12 3.332Z"),
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
        return _stackLine!!
    }

private var _stackLine: ImageVector? = null
