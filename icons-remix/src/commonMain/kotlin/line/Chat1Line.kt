package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Chat1Line: ImageVector
    get() {
        if (_chat1Line != null) return _chat1Line!!
        _chat1Line = remixIcon(
            name = "Chat1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 3.000 L 14.000 3.000 C 18.418 3.000 22.000 6.582 22.000 11.000 C 22.000 15.418 18.418 19.000 14.000 19.000 L 14.000 22.500 C 9.000 20.500 2.000 17.500 2.000 11.000 C 2.000 6.582 5.582 3.000 10.000 3.000 ZM 12.000 17.000 L 14.000 17.000 C 17.314 17.000 20.000 14.314 20.000 11.000 C 20.000 7.686 17.314 5.000 14.000 5.000 L 10.000 5.000 C 6.686 5.000 4.000 7.686 4.000 11.000 C 4.000 14.610 6.462 16.966 12.000 19.480 L 12.000 17.000 Z"),
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
        return _chat1Line!!
    }

private var _chat1Line: ImageVector? = null
