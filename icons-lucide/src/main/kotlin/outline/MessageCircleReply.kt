package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleReply: ImageVector
    get() {
        if (_messageCircleReply != null) return _messageCircleReply!!
        _messageCircleReply = lucideOutlineIcon(
            name = "MessageCircleReply",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.992 16.342 C 3.139 16.713 3.172 17.119 3.086 17.509 L 2.021 20.799 C 1.951 21.138 2.062 21.489 2.314 21.727 C 2.565 21.965 2.922 22.056 3.257 21.967 L 6.670 20.969 C 7.038 20.896 7.419 20.928 7.769 21.061 C 12.178 23.120 17.428 21.707 20.208 17.713 C 22.987 13.720 22.489 8.306 19.028 4.886 C 15.567 1.467 10.147 1.035 6.187 3.863 C 2.228 6.692 0.880 11.959 2.992 16.342"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 15.000 L 7.000 12.000 L 10.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 L 15.000 12.000 C 16.105 12.000 17.000 12.895 17.000 14.000 L 17.000 15.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _messageCircleReply!!
    }

private var _messageCircleReply: ImageVector? = null
