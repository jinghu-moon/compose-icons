package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerDiamondsLine: ImageVector
    get() {
        if (_pokerDiamondsLine != null) return _pokerDiamondsLine!!
        _pokerDiamondsLine = remixIcon(
            name = "PokerDiamondsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.036 10.733 C 3.433 11.470 3.433 12.530 4.036 13.267 L 11.226 22.054 C 11.626 22.543 12.374 22.543 12.774 22.054 L 19.964 13.267 C 20.566 12.530 20.566 11.470 19.964 10.733 L 12.774 1.946 C 12.374 1.457 11.626 1.457 11.226 1.946 L 4.036 10.733 ZM 12.000 4.158 L 18.416 12.000 L 12.000 19.842 L 5.584 12.000 L 12.000 4.158 Z"),
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
        return _pokerDiamondsLine!!
    }

private var _pokerDiamondsLine: ImageVector? = null
