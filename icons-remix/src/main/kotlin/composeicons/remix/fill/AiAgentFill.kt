package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AiAgentFill: ImageVector
    get() {
        if (_aiAgentFill != null) return _aiAgentFill!!
        _aiAgentFill = remixIcon(
            name = "AiAgentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 15c-2.287 0-4.35 .961-5.808 2.5C7.65 19.039 9.713 20 12 20c2.287 0 4.349-.961 5.807-2.5C16.349 15.961 14.287 15 12 15ZM12.471 5.319c-.176-.426-.765-.426-.941 0l-.253 .611C10.844 6.973 10.038 7.806 9.025 8.257l-.718 .319c-.41 .183-.41 .78 0 .963l.76 .338c.988 .439 1.78 1.242 2.22 2.251l.246 .566c.181 .414 .753 .414 .934 0l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.41-.183 .41-.78 0-.963l-.718-.319C13.962 7.806 13.156 6.973 12.724 5.931l-.253-.611Z"),
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
        return _aiAgentFill!!
    }

private var _aiAgentFill: ImageVector? = null
