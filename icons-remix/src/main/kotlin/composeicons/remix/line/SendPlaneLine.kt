package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SendPlaneLine: ImageVector
    get() {
        if (_sendPlaneLine != null) return _sendPlaneLine!!
        _sendPlaneLine = remixIcon(
            name = "SendPlaneLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.727 2.957 16.273 22.043c-.151 .528-.475 .552-.717 .069L11 13 1.923 9.369c-.51-.204-.503-.509 .034-.688L21.043 2.319c.528-.176 .832 .12 .684 .638ZM19.035 5.096 6.812 9.171l5.637 2.255 3.041 6.081L19.035 5.096Z"),
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
        return _sendPlaneLine!!
    }

private var _sendPlaneLine: ImageVector? = null
