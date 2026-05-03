package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookFill: ImageVector
    get() {
        if (_facebookFill != null) return _facebookFill!!
        _facebookFill = remixIcon(
            name = "FacebookFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 13.500 L 16.500 13.500 L 17.500 9.500 L 14.000 9.500 L 14.000 7.500 C 14.000 6.471 14.000 5.500 16.000 5.500 L 17.500 5.500 L 17.500 2.140 C 17.174 2.097 15.943 2.000 14.643 2.000 C 11.928 2.000 10.000 3.657 10.000 6.700 L 10.000 9.500 L 7.000 9.500 L 7.000 13.500 L 10.000 13.500 L 10.000 22.000 L 14.000 22.000 L 14.000 13.500 Z"),
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
        return _facebookFill!!
    }

private var _facebookFill: ImageVector? = null
