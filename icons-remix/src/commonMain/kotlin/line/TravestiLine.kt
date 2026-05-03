package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TravestiLine: ImageVector
    get() {
        if (_travestiLine != null) return _travestiLine!!
        _travestiLine = remixIcon(
            name = "TravestiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.951 8.537 C 10.213 7.573 11.790 7.000 13.500 7.000 C 17.642 7.000 21.000 10.358 21.000 14.500 C 21.000 18.642 17.642 22.000 13.500 22.000 C 9.358 22.000 6.000 18.642 6.000 14.500 C 6.000 12.790 6.573 11.213 7.537 9.951 L 4.662 7.075 L 2.187 9.550 L 0.772 8.136 L 7.136 1.772 L 8.551 3.186 L 6.076 5.661 L 8.951 8.537 ZM 13.500 20.000 C 16.538 20.000 19.000 17.538 19.000 14.500 C 19.000 11.462 16.538 9.000 13.500 9.000 C 10.463 9.000 8.000 11.462 8.000 14.500 C 8.000 17.538 10.463 20.000 13.500 20.000 Z"),
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
        return _travestiLine!!
    }

private var _travestiLine: ImageVector? = null
