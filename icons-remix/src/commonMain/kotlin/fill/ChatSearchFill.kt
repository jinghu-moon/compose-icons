package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSearchFill: ImageVector
    get() {
        if (_chatSearchFill != null) return _chatSearchFill!!
        _chatSearchFill = remixIcon(
            name = "ChatSearchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.803 C 21.118 12.292 20.093 12.000 19.000 12.000 C 15.686 12.000 13.000 14.686 13.000 18.000 C 13.000 18.341 13.028 18.675 13.083 19.000 L 6.455 19.000 ZM 23.950 21.535 L 22.446 20.032 C 22.798 19.437 23.000 18.742 23.000 18.000 C 23.000 15.791 21.209 14.000 19.000 14.000 C 16.791 14.000 15.000 15.791 15.000 18.000 C 15.000 20.209 16.791 22.000 19.000 22.000 C 19.742 22.000 20.437 21.798 21.032 21.446 L 22.535 22.950 L 23.950 21.535 ZM 21.000 18.000 C 21.000 19.105 20.105 20.000 19.000 20.000 C 17.895 20.000 17.000 19.105 17.000 18.000 C 17.000 16.895 17.895 16.000 19.000 16.000 C 20.105 16.000 21.000 16.895 21.000 18.000 Z"),
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
        return _chatSearchFill!!
    }

private var _chatSearchFill: ImageVector? = null
