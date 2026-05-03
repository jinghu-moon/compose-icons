package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindStartMiniFill: ImageVector
    get() {
        if (_rewindStartMiniFill != null) return _rewindStartMiniFill!!
        _rewindStartMiniFill = remixIcon(
            name = "RewindStartMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 6.000 C 2.448 6.000 2.000 6.448 2.000 7.000 L 2.000 17.000 C 2.000 17.552 2.448 18.000 3.000 18.000 C 3.552 18.000 4.000 17.552 4.000 17.000 L 4.000 7.000 C 4.000 6.448 3.552 6.000 3.000 6.000 ZM 12.909 17.323 C 12.968 17.239 13.000 17.138 13.000 17.035 L 13.000 6.965 C 13.000 6.689 12.776 6.465 12.500 6.465 C 12.397 6.465 12.296 6.497 12.212 6.556 L 5.079 11.591 C 4.853 11.751 4.799 12.063 4.959 12.288 C 4.992 12.335 5.032 12.375 5.079 12.408 L 12.212 17.443 C 12.438 17.603 12.749 17.549 12.909 17.323 ZM 13.959 12.288 C 13.992 12.335 14.032 12.375 14.079 12.408 L 21.212 17.443 C 21.438 17.603 21.749 17.549 21.909 17.323 C 21.968 17.239 22.000 17.138 22.000 17.035 L 22.000 6.965 C 22.000 6.689 21.776 6.465 21.500 6.465 C 21.397 6.465 21.296 6.497 21.212 6.556 L 14.079 11.591 C 13.853 11.751 13.800 12.063 13.959 12.288 Z"),
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
        return _rewindStartMiniFill!!
    }

private var _rewindStartMiniFill: ImageVector? = null
