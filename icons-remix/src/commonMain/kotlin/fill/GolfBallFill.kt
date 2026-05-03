package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GolfBallFill: ImageVector
    get() {
        if (_golfBallFill != null) return _golfBallFill!!
        _golfBallFill = remixIcon(
            name = "GolfBallFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 ZM 14.000 7.000 C 14.000 6.448 13.552 6.000 13.000 6.000 C 12.448 6.000 12.000 6.448 12.000 7.000 C 12.000 7.552 12.448 8.000 13.000 8.000 C 13.552 8.000 14.000 7.552 14.000 7.000 ZM 13.000 11.000 C 13.552 11.000 14.000 10.552 14.000 10.000 C 14.000 9.448 13.552 9.000 13.000 9.000 C 12.448 9.000 12.000 9.448 12.000 10.000 C 12.000 10.552 12.448 11.000 13.000 11.000 ZM 17.000 12.000 C 17.000 11.448 16.552 11.000 16.000 11.000 C 15.448 11.000 15.000 11.448 15.000 12.000 C 15.000 12.552 15.448 13.000 16.000 13.000 C 16.552 13.000 17.000 12.552 17.000 12.000 ZM 16.000 10.000 C 16.552 10.000 17.000 9.552 17.000 9.000 C 17.000 8.448 16.552 8.000 16.000 8.000 C 15.448 8.000 15.000 8.448 15.000 9.000 C 15.000 9.552 15.448 10.000 16.000 10.000 Z"),
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
        return _golfBallFill!!
    }

private var _golfBallFill: ImageVector? = null
