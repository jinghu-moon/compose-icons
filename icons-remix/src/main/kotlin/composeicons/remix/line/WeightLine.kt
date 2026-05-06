package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WeightLine: ImageVector
    get() {
        if (_weightLine != null) return _weightLine!!
        _weightLine = remixIcon(
            name = "WeightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 6c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2ZM15.465 8c.34-.588 .535-1.271 .535-2 0-2.209-1.791-4-4-4C9.791 2 8 3.791 8 6c0 .729 .195 1.412 .535 2h-3.469c-.487 0-.904 .351-.986 .832L2.2 19.831C2.096 20.442 2.566 21 3.186 21h17.629c.62 0 1.09-.558 .986-1.169L19.92 8.832C19.838 8.351 19.422 8 18.935 8h-3.469ZM12 10h6.091l1.538 9h-15.258L5.91 10h6.091Z"),
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
        return _weightLine!!
    }

private var _weightLine: ImageVector? = null
