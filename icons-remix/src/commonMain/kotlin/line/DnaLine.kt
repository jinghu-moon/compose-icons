package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DnaLine: ImageVector
    get() {
        if (_dnaLine != null) return _dnaLine!!
        _dnaLine = remixIcon(
            name = "DnaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 1.000 C 18.000 1.716 17.936 2.379 17.816 3.000 L 8.232 3.000 C 8.414 3.727 8.700 4.383 9.081 5.000 L 17.181 5.000 C 16.132 7.317 14.187 8.994 12.000 10.727 C 8.729 8.135 6.000 5.668 6.000 1.000 L 4.000 1.000 C 4.000 6.466 7.210 9.464 10.386 12.000 C 7.210 14.536 4.000 17.534 4.000 23.000 L 6.000 23.000 C 6.000 18.040 9.080 15.566 12.618 12.786 L 12.710 12.714 C 16.149 10.012 20.000 6.987 20.000 1.000 L 18.000 1.000 ZM 17.816 21.000 L 8.232 21.000 C 8.414 20.273 8.700 19.617 9.081 19.000 L 17.181 19.000 C 16.394 17.262 15.103 15.884 13.583 14.572 C 14.116 14.152 14.653 13.735 15.181 13.309 C 17.766 15.598 20.000 18.440 20.000 23.000 L 18.000 23.000 C 18.000 22.285 17.936 21.621 17.816 21.000 Z"),
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
        return _dnaLine!!
    }

private var _dnaLine: ImageVector? = null
