package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FinderFill: ImageVector
    get() {
        if (_finderFill != null) return _finderFill!!
        _finderFill = remixIcon(
            name = "FinderFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.001 3.000 C 21.553 3.000 22.001 3.448 22.001 4.000 L 22.001 20.000 C 22.001 20.552 21.553 21.000 21.001 21.000 L 3.001 21.000 C 2.449 21.000 2.001 20.552 2.001 20.000 L 2.001 4.000 C 2.001 3.448 2.449 3.000 3.001 3.000 L 21.001 3.000 ZM 20.001 5.000 L 11.536 5.000 C 10.846 6.977 10.501 9.644 10.501 13.000 L 13.501 13.000 C 13.386 13.919 13.350 14.878 13.394 15.877 C 14.620 15.666 16.098 15.100 17.421 14.168 L 18.556 15.832 C 16.914 16.927 15.253 17.611 13.580 17.875 C 13.632 18.245 13.693 18.620 13.764 19.000 L 20.001 19.000 L 20.001 5.000 ZM 6.556 14.168 L 5.446 15.832 C 7.603 17.270 9.793 18.000 12.001 18.000 L 12.001 16.000 C 10.209 16.000 8.399 15.397 6.556 14.168 ZM 17.001 7.000 C 17.553 7.000 18.001 7.448 18.001 8.000 L 18.001 9.000 C 18.001 9.552 17.553 10.000 17.001 10.000 C 16.449 10.000 16.001 9.552 16.001 9.000 L 16.001 8.000 C 16.001 7.448 16.449 7.000 17.001 7.000 ZM 7.001 7.000 C 6.449 7.000 6.001 7.452 6.001 8.000 C 6.001 8.366 6.001 8.699 6.001 9.000 C 6.001 9.552 6.449 10.000 7.001 10.000 C 7.553 10.000 8.001 9.550 8.001 9.000 L 8.001 8.000 C 8.001 7.448 7.553 7.000 7.001 7.000 Z"),
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
        return _finderFill!!
    }

private var _finderFill: ImageVector? = null
