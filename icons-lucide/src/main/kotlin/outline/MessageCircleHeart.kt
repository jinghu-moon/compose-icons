package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) return _messageCircleHeart!!
        _messageCircleHeart = lucideOutlineIcon(
            name = "MessageCircleHeart",
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
        pathData = parseSvgPathData("M 7.828 13.070 C 6.714 11.905 6.720 10.067 7.842 8.909 C 8.964 7.752 10.800 7.687 12.000 8.764 C 12.880 7.974 14.142 7.775 15.222 8.255 C 16.303 8.735 17.001 9.806 17.004 10.988 C 17.006 11.764 16.708 12.510 16.172 13.071 L 12.725 16.691 C 12.536 16.890 12.274 17.002 12.000 17.002 C 11.726 17.002 11.464 16.889 11.275 16.690 Z"),
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
        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
