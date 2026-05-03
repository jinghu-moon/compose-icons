package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Chat2Line: ImageVector
    get() {
        if (_chat2Line != null) return _chat2Line!!
        _chat2Line = remixIcon(
            name = "Chat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.450 19.000 L 12.000 22.500 L 9.550 19.000 L 3.000 19.000 C 2.735 19.000 2.480 18.895 2.293 18.707 C 2.105 18.520 2.000 18.265 2.000 18.000 L 2.000 4.000 C 2.000 3.735 2.105 3.480 2.293 3.293 C 2.480 3.105 2.735 3.000 3.000 3.000 L 21.000 3.000 C 21.265 3.000 21.520 3.105 21.707 3.293 C 21.895 3.480 22.000 3.735 22.000 4.000 L 22.000 18.000 C 22.000 18.265 21.895 18.520 21.707 18.707 C 21.520 18.895 21.265 19.000 21.000 19.000 L 14.450 19.000 ZM 13.409 17.000 L 20.000 17.000 L 20.000 5.000 L 4.000 5.000 L 4.000 17.000 L 10.591 17.000 L 12.000 19.012 L 13.409 17.000 Z"),
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
        return _chat2Line!!
    }

private var _chat2Line: ImageVector? = null
