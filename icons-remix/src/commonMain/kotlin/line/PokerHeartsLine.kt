package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerHeartsLine: ImageVector
    get() {
        if (_pokerHeartsLine != null) return _pokerHeartsLine!!
        _pokerHeartsLine = remixIcon(
            name = "PokerHeartsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.811 L 13.635 6.488 C 14.272 5.584 15.318 5.000 16.500 5.000 C 18.433 5.000 20.000 6.567 20.000 8.500 C 20.000 11.379 18.041 14.122 15.643 16.336 C 14.488 17.403 13.324 18.260 12.445 18.852 C 12.286 18.959 12.137 19.057 12.000 19.146 C 11.863 19.057 11.714 18.959 11.555 18.852 C 10.676 18.260 9.512 17.403 8.357 16.336 C 5.959 14.122 4.000 11.379 4.000 8.500 C 4.000 6.567 5.567 5.000 7.500 5.000 C 8.682 5.000 9.728 5.584 10.365 6.488 L 12.000 8.811 ZM 10.556 3.926 C 9.682 3.341 8.631 3.000 7.500 3.000 C 4.462 3.000 2.000 5.462 2.000 8.500 C 2.000 16.000 12.000 21.485 12.000 21.485 C 12.000 21.485 22.000 16.000 22.000 8.500 C 22.000 5.462 19.538 3.000 16.500 3.000 C 15.369 3.000 14.318 3.341 13.444 3.926 C 12.880 4.304 12.390 4.783 12.000 5.337 C 11.610 4.783 11.120 4.304 10.556 3.926 Z"),
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
        return _pokerHeartsLine!!
    }

private var _pokerHeartsLine: ImageVector? = null
