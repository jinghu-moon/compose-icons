package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings5Fill: ImageVector
    get() {
        if (_settings5Fill != null) return _settings5Fill!!
        _settings5Fill = remixIcon(
            name = "Settings5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.131 13.631c-.182-1.096-.176-2.197 .001-3.261 1.101 .027 2.092-.502 2.476-1.431C4.994 8.009 4.667 6.936 3.869 6.176 4.497 5.298 5.271 4.515 6.175 3.869c.76 .798 1.834 1.125 2.764 .74 .93-.385 1.458-1.376 1.431-2.477 1.096-.182 2.197-.176 3.261 .001-.027 1.101 .502 2.092 1.431 2.476 .929 .385 2.003 .058 2.763-.739 .878 .628 1.66 1.402 2.307 2.305-.798 .76-1.125 1.834-.74 2.764 .385 .93 1.376 1.458 2.477 1.431 .182 1.096 .176 2.197-.001 3.261-1.101-.027-2.092 .502-2.477 1.431-.385 .929-.058 2.003 .739 2.763-.628 .878-1.402 1.661-2.305 2.307-.76-.798-1.834-1.125-2.763-.74-.93 .385-1.458 1.376-1.431 2.477-1.096 .182-2.197 .176-3.261-.001 .027-1.101-.502-2.092-1.431-2.477-.929-.385-2.003-.058-2.763 .739C5.297 19.503 4.515 18.729 3.869 17.825c.798-.76 1.125-1.834 .74-2.764C4.224 14.132 3.233 13.604 2.131 13.631ZM12 15c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3Z"),
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
        return _settings5Fill!!
    }

private var _settings5Fill: ImageVector? = null
