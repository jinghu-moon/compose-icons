package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleQuestionMark: ImageVector
    get() {
        if (_messageCircleQuestionMark != null) return _messageCircleQuestionMark!!
        _messageCircleQuestionMark = lucideOutlineIcon(
            name = "MessageCircleQuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.992 16.342 C 3.139 16.713 3.172 17.119 3.086 17.509 L 2.021 20.799 C 1.951 21.138 2.062 21.489 2.314 21.727 C 2.565 21.965 2.922 22.056 3.257 21.967 L 6.670 20.969 C 7.038 20.896 7.419 20.928 7.769 21.061 C 12.178 23.120 17.428 21.707 20.208 17.713 C 22.987 13.720 22.489 8.306 19.028 4.886 C 15.567 1.467 10.147 1.035 6.187 3.863 C 2.228 6.692 0.880 11.959 2.992 16.342"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.090 9.000 C 9.575 7.620 10.985 6.791 12.427 7.039 C 13.869 7.286 14.922 8.537 14.920 10.000 C 14.920 12.000 11.920 13.000 11.920 13.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 17.000 L 12.010 17.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _messageCircleQuestionMark!!
    }

private var _messageCircleQuestionMark: ImageVector? = null
