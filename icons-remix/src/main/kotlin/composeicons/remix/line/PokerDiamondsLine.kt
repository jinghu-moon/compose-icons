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
                pathData = parseSvgPathData("M4.036 10.733c-.603 .737-.603 1.796 0 2.533l7.19 8.788c.4 .489 1.148 .489 1.548 0l7.19-8.788c.603-.737 .603-1.796 0-2.533L12.774 1.946c-.4-.489-1.148-.489-1.548 0L4.036 10.733ZM12 4.158 18.416 12l-6.416 7.842L5.584 12 12 4.158Z"),
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
