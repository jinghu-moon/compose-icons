package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) return _chatCentered!!
        _chatCentered = phosphorBoldIcon(
            name = "ChatCentered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v128c0 11.046 8.954 20 20 20h58.11l12.52 21.92c3.559 6.237 10.189 10.086 17.37 10.086 7.181 0 13.811-3.85 17.37-10.086L157.89 204h58.11c11.046 0 20-8.954 20-20v-128C236 44.954 227.046 36 216 36ZM212 180h-61.07c-4.307 0-8.284 2.309-10.42 6.05L128 207.94 115.49 186.05c-2.136-3.741-6.113-6.05-10.42-6.05h-61.07v-120h168Z"),
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
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
