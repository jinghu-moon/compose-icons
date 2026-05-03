package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StarSFill: ImageVector
    get() {
        if (_starSFill != null) return _starSFill!!
        _starSFill = remixIcon(
            name = "StarSFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 17.000 L 6.122 20.590 L 7.720 13.891 L 2.489 9.410 L 9.355 8.859 L 12.000 2.500 L 14.645 8.859 L 21.510 9.410 L 16.280 13.891 L 17.878 20.590 L 12.000 17.000 Z"),
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
        return _starSFill!!
    }

private var _starSFill: ImageVector? = null
