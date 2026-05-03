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
                pathData = parseSvgPathData("M 21.727 2.957 L 16.273 22.043 C 16.122 22.572 15.798 22.596 15.556 22.113 L 11.000 13.000 L 1.923 9.369 C 1.413 9.165 1.420 8.860 1.957 8.681 L 21.043 2.319 C 21.572 2.143 21.875 2.439 21.727 2.957 ZM 19.035 5.096 L 6.812 9.171 L 12.449 11.425 L 15.490 17.507 L 19.035 5.096 Z"),
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
