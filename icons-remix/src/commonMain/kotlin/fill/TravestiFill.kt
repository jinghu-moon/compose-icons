package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TravestiFill: ImageVector
    get() {
        if (_travestiFill != null) return _travestiFill!!
        _travestiFill = remixIcon(
            name = "TravestiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.537 9.951 L 4.662 7.075 L 2.187 9.550 L 0.772 8.136 L 7.136 1.772 L 8.551 3.186 L 6.076 5.661 L 8.951 8.537 C 10.213 7.573 11.790 7.000 13.500 7.000 C 17.642 7.000 21.000 10.358 21.000 14.500 C 21.000 18.642 17.642 22.000 13.500 22.000 C 9.358 22.000 6.000 18.642 6.000 14.500 C 6.000 12.790 6.573 11.213 7.537 9.951 Z"),
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
        return _travestiFill!!
    }

private var _travestiFill: ImageVector? = null
