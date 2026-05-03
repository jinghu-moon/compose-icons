package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WrenchFill: ImageVector
    get() {
        if (_wrenchFill != null) return _wrenchFill!!
        _wrenchFill = remixIcon(
            name = "WrenchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.249 6.872 C 19.489 6.631 19.836 6.530 20.169 6.602 C 20.502 6.675 20.775 6.912 20.893 7.231 C 21.818 9.716 21.282 12.625 19.282 14.625 C 17.307 16.600 14.447 17.146 11.981 16.269 L 7.969 20.282 C 6.797 21.453 4.898 21.453 3.726 20.282 C 2.555 19.110 2.555 17.211 3.726 16.039 L 7.739 12.026 C 6.862 9.561 7.408 6.701 9.383 4.725 C 11.380 2.729 14.281 2.192 16.763 3.109 C 17.083 3.228 17.321 3.501 17.394 3.834 C 17.467 4.167 17.365 4.513 17.124 4.754 L 14.768 7.110 C 14.182 7.696 14.182 8.646 14.768 9.232 C 15.353 9.817 16.303 9.817 16.889 9.232 L 19.249 6.872 Z"),
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
        return _wrenchFill!!
    }

private var _wrenchFill: ImageVector? = null
