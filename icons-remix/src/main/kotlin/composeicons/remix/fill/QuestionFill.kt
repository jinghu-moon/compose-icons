package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QuestionFill: ImageVector
    get() {
        if (_questionFill != null) return _questionFill!!
        _questionFill = remixIcon(
            name = "QuestionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM11 15v2h2v-2h-2ZM13 13.355c1.446-.43 2.5-1.77 2.5-3.355C15.5 8.067 13.933 6.5 12 6.5c-1.698 0-3.114 1.209-3.433 2.813l1.961 .392C10.666 9.018 11.272 8.5 12 8.5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.552 0-1 .448-1 1v1.5h2v-.645Z"),
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
        return _questionFill!!
    }

private var _questionFill: ImageVector? = null
