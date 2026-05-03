package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TwitterXLine: ImageVector
    get() {
        if (_twitterXLine != null) return _twitterXLine!!
        _twitterXLine = remixIcon(
            name = "TwitterXLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.488 14.651 L 15.250 21.000 L 22.250 21.000 L 14.392 10.522 L 20.931 3.000 L 18.281 3.000 L 13.164 8.886 L 8.750 3.000 L 1.750 3.000 L 9.261 13.014 L 2.319 21.000 L 4.969 21.000 L 10.488 14.651 ZM 16.250 19.000 L 5.750 5.000 L 7.750 5.000 L 18.250 19.000 L 16.250 19.000 Z"),
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
        return _twitterXLine!!
    }

private var _twitterXLine: ImageVector? = null
