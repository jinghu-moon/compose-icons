package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ReplyLine: ImageVector
    get() {
        if (_replyLine != null) return _replyLine!!
        _replyLine = remixIcon(
            name = "ReplyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 20 1 12 11 4v5c5.523 0 10 4.477 10 10 0 .273-.011 .543-.032 .81C19.506 17.036 16.638 15.119 13.313 15.005L13 15h-2L11 20ZM9 13h2l2.034 0 .347 .006c1.284 .044 2.524 .31 3.675 .767C15.59 12.075 13.42 11 11 11h-2v-2.839L4.202 12l4.798 3.839L9 13Z"),
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
        return _replyLine!!
    }

private var _replyLine: ImageVector? = null
