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
                pathData = parseSvgPathData("M 1.946 9.315 C 1.424 9.141 1.419 8.860 1.957 8.681 L 21.043 2.319 C 21.572 2.143 21.875 2.439 21.726 2.957 L 16.273 22.043 C 16.122 22.572 15.818 22.590 15.594 22.088 L 12.000 14.000 L 18.000 6.000 L 10.000 12.000 L 1.946 9.315 Z"),
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
