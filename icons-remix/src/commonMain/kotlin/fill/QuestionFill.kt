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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 ZM 11.000 15.000 L 11.000 17.000 L 13.000 17.000 L 13.000 15.000 L 11.000 15.000 ZM 13.000 13.355 C 14.446 12.925 15.500 11.585 15.500 10.000 C 15.500 8.067 13.933 6.500 12.000 6.500 C 10.302 6.500 8.886 7.709 8.567 9.313 L 10.529 9.706 C 10.666 9.018 11.272 8.500 12.000 8.500 C 12.828 8.500 13.500 9.172 13.500 10.000 C 13.500 10.828 12.828 11.500 12.000 11.500 C 11.448 11.500 11.000 11.948 11.000 12.500 L 11.000 14.000 L 13.000 14.000 L 13.000 13.355 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _questionFill!!
    }

private var _questionFill: ImageVector? = null
