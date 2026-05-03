package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TiktokFill: ImageVector
    get() {
        if (_tiktokFill != null) return _tiktokFill!!
        _tiktokFill = remixIcon(
            name = "TiktokFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 8.245 L 16.000 15.500 C 16.000 19.090 13.090 22.000 9.500 22.000 C 5.910 22.000 3.000 19.090 3.000 15.500 C 3.000 11.910 5.910 9.000 9.500 9.000 C 10.016 9.000 10.519 9.060 11.000 9.174 L 11.000 12.337 C 10.545 12.121 10.037 12.000 9.500 12.000 C 7.567 12.000 6.000 13.567 6.000 15.500 C 6.000 17.433 7.567 19.000 9.500 19.000 C 11.433 19.000 13.000 17.433 13.000 15.500 L 13.000 2.000 L 16.000 2.000 C 16.000 4.761 18.239 7.000 21.000 7.000 L 21.000 10.000 C 19.108 10.000 17.370 9.343 16.000 8.245 Z"),
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
        return _tiktokFill!!
    }

private var _tiktokFill: ImageVector? = null
