package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorBoldIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C90.38 19.992 55.466 39.561 35.84 71.656 16.213 103.75 14.701 143.746 31.85 177.23L21 209.66c-2.427 7.201-.563 15.156 4.81 20.53 5.374 5.374 13.328 7.237 20.53 4.81L78.77 224.19c39.82 20.329 88.048 14.021 121.3-15.865 33.252-29.886 44.652-77.17 28.673-118.926C212.764 47.644 172.708 20.051 128 20ZM128 212c-14.767 .006-29.274-3.882-42.06-11.27-1.823-1.058-3.892-1.616-6-1.62-1.292 .003-2.575 .212-3.8 .62l-29.79 9.93 9.93-29.79c1.088-3.262 .724-6.834-1-9.81C36.241 137.145 41.686 95.546 68.556 68.641 95.426 41.737 137.019 36.237 169.958 55.234c32.939 18.997 49.009 57.752 39.178 94.483C199.304 186.45 166.025 211.996 128 212Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
