package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ExpandHorizontalSFill: ImageVector
    get() {
        if (_expandHorizontalSFill != null) return _expandHorizontalSFill!!
        _expandHorizontalSFill = remixIcon(
            name = "ExpandHorizontalSFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.450 7.050 L 2.500 12.000 L 7.447 16.947 L 7.448 13.000 L 16.550 13.000 L 16.550 16.949 L 21.500 11.999 L 16.550 7.050 L 16.550 11.000 L 7.449 11.000 L 7.450 7.050 Z"),
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
        return _expandHorizontalSFill!!
    }

private var _expandHorizontalSFill: ImageVector? = null
