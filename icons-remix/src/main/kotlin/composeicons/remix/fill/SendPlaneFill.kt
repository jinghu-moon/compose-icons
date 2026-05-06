package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SendPlaneFill: ImageVector
    get() {
        if (_sendPlaneFill != null) return _sendPlaneFill!!
        _sendPlaneFill = remixIcon(
            name = "SendPlaneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.946 9.315c-.523-.174-.527-.455 .011-.634L21.043 2.319c.529-.176 .832 .12 .684 .638L16.273 22.043c-.151 .528-.456 .547-.679 .044L12 14 18 6 10 12 1.946 9.315Z"),
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
        return _sendPlaneFill!!
    }

private var _sendPlaneFill: ImageVector? = null
