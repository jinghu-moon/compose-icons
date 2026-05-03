package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BowlFill: ImageVector
    get() {
        if (_bowlFill != null) return _bowlFill!!
        _bowlFill = remixIcon(
            name = "BowlFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 1.500 C 8.000 0.948 7.552 0.500 7.000 0.500 C 6.448 0.500 6.000 0.948 6.000 1.500 L 6.000 2.500 C 6.000 2.507 6.000 2.513 6.001 2.518 C 6.004 2.562 6.005 2.581 5.793 2.793 L 5.773 2.813 C 5.506 3.079 5.000 3.584 5.000 4.500 L 5.000 5.500 C 5.000 6.052 5.448 6.500 6.000 6.500 C 6.552 6.500 7.000 6.052 7.000 5.500 L 7.000 4.500 C 7.000 4.493 7.000 4.487 6.999 4.482 C 6.996 4.438 6.995 4.419 7.207 4.207 L 7.227 4.187 C 7.494 3.921 8.000 3.416 8.000 2.500 L 8.000 1.500 ZM 2.000 9.000 C 2.000 8.448 2.448 8.000 3.000 8.000 L 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 L 22.000 10.000 C 22.000 14.101 19.532 17.625 16.000 19.168 L 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 L 9.000 21.000 C 8.448 21.000 8.000 20.552 8.000 20.000 L 8.000 19.168 C 4.468 17.625 2.000 14.101 2.000 10.000 L 2.000 9.000 ZM 18.000 0.500 C 18.552 0.500 19.000 0.948 19.000 1.500 L 19.000 2.500 C 19.000 3.416 18.494 3.921 18.227 4.187 L 18.207 4.207 C 17.995 4.419 17.996 4.438 17.999 4.482 C 18.000 4.487 18.000 4.493 18.000 4.500 L 18.000 5.500 C 18.000 6.052 17.552 6.500 17.000 6.500 C 16.448 6.500 16.000 6.052 16.000 5.500 L 16.000 4.500 C 16.000 3.584 16.506 3.079 16.773 2.813 L 16.793 2.793 C 17.005 2.581 17.004 2.562 17.001 2.518 C 17.000 2.513 17.000 2.507 17.000 2.500 L 17.000 1.500 C 17.000 0.948 17.448 0.500 18.000 0.500 ZM 13.500 1.500 C 13.500 0.948 13.052 0.500 12.500 0.500 C 11.948 0.500 11.500 0.948 11.500 1.500 L 11.500 2.500 C 11.500 2.507 11.500 2.513 11.501 2.518 C 11.504 2.562 11.505 2.581 11.293 2.793 L 11.273 2.813 C 11.006 3.079 10.500 3.584 10.500 4.500 L 10.500 5.500 C 10.500 6.052 10.948 6.500 11.500 6.500 C 12.052 6.500 12.500 6.052 12.500 5.500 L 12.500 4.500 C 12.500 4.493 12.500 4.487 12.499 4.482 C 12.496 4.438 12.495 4.419 12.707 4.207 L 12.727 4.187 C 12.994 3.921 13.500 3.416 13.500 2.500 L 13.500 1.500 Z"),
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
        return _bowlFill!!
    }

private var _bowlFill: ImageVector? = null
