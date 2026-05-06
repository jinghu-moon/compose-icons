package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Sparkling2Line: ImageVector
    get() {
        if (_sparkling2Line != null) return _sparkling2Line!!
        _sparkling2Line = remixIcon(
            name = "Sparkling2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.001 1.208l1.319 2.473 2.473 1.319L18.319 6.319 17.001 8.792 15.682 6.319 13.209 5 15.682 3.681 17.001 1.208ZM10.667 9.333l5 2.667-5 2.667L8.001 19.667 5.334 14.667 .334 12 5.334 9.333l2.667-5 2.667 5ZM11.417 12 9.189 10.811 8.001 8.583 6.812 10.811 4.584 12l2.228 1.188 1.188 2.228L9.189 13.188l2.228-1.188ZM19.667 16.333 18.001 13.208l-1.667 3.125-3.125 1.667 3.125 1.667 1.667 3.125 1.667-3.125 3.125-1.667L19.667 16.333Z"),
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
        return _sparkling2Line!!
    }

private var _sparkling2Line: ImageVector? = null
