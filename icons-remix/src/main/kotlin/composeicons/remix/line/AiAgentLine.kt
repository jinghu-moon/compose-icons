package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AiAgentLine: ImageVector
    get() {
        if (_aiAgentLine != null) return _aiAgentLine!!
        _aiAgentLine = remixIcon(
            name = "AiAgentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 2.71-1.08 5.17-2.829 6.97C17.355 20.838 14.812 22 12 22 9.188 22 6.645 20.838 4.829 18.97 3.079 17.17 2 14.71 2 12 2 6.477 6.477 2 12 2ZM12 16c-1.998 0-3.799 .837-5.075 2.182C8.306 19.317 10.072 20 12 20c1.927 0 3.693-.683 5.074-1.818C15.798 16.838 13.998 16 12 16ZM12 4C7.582 4 4 7.582 4 12c0 1.77 .575 3.404 1.548 4.729C7.182 15.048 9.468 14 12 14c2.532 0 4.817 1.049 6.451 2.729C19.425 15.404 20 13.77 20 12 20 7.582 16.418 4 12 4ZM11.529 5.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .318c.41 .183 .41 .781 0 .964l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .566c-.18 .414-.753 .414-.934 0l-.246-.566C10.848 11.119 10.055 10.316 9.067 9.877L8.308 9.539c-.41-.183-.41-.781 0-.964l.718-.318c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _aiAgentLine!!
    }

private var _aiAgentLine: ImageVector? = null
