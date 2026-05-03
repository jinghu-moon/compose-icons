package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindMiniFill: ImageVector
    get() {
        if (_rewindMiniFill != null) return _rewindMiniFill!!
        _rewindMiniFill = remixIcon(
            name = "RewindMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 17.035 C 11.000 17.138 10.968 17.239 10.909 17.323 C 10.749 17.549 10.438 17.603 10.212 17.444 L 3.079 12.408 C 3.032 12.376 2.992 12.335 2.959 12.288 C 2.799 12.063 2.853 11.751 3.079 11.592 L 10.212 6.556 C 10.296 6.497 10.397 6.465 10.500 6.465 C 10.776 6.465 11.000 6.689 11.000 6.965 L 11.000 17.035 ZM 12.079 12.408 C 12.032 12.376 11.992 12.335 11.959 12.288 C 11.800 12.063 11.853 11.751 12.079 11.592 L 19.212 6.556 C 19.296 6.497 19.397 6.465 19.500 6.465 C 19.776 6.465 20.000 6.689 20.000 6.965 L 20.000 17.035 C 20.000 17.138 19.968 17.239 19.909 17.323 C 19.749 17.549 19.438 17.603 19.212 17.444 L 12.079 12.408 Z"),
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
        return _rewindMiniFill!!
    }

private var _rewindMiniFill: ImageVector? = null
