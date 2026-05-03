package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarHalfSLine: ImageVector
    get() {
        if (_starHalfSLine != null) return _starHalfSLine!!
        _starHalfSLine = remixIcon(
            name = "StarHalfSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 14.656 L 14.816 16.377 L 14.051 13.166 L 16.557 11.019 L 13.267 10.755 L 12.000 7.708 L 12.000 14.656 ZM 12.000 17.000 L 6.122 20.590 L 7.720 13.891 L 2.489 9.410 L 9.355 8.859 L 12.000 2.500 L 14.645 8.859 L 21.510 9.410 L 16.280 13.891 L 17.878 20.590 L 12.000 17.000 Z"),
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
        return _starHalfSLine!!
    }

private var _starHalfSLine: ImageVector? = null
