package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerDiamondsFill: ImageVector
    get() {
        if (_pokerDiamondsFill != null) return _pokerDiamondsFill!!
        _pokerDiamondsFill = remixIcon(
            name = "PokerDiamondsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.036 10.733 11.226 1.946c.4-.489 1.148-.489 1.548-0l7.19 8.788c.603 .737 .603 1.796 0 2.533l-7.19 8.788c-.4 .489-1.148 .489-1.548 0L4.036 13.267c-.603-.737-.603-1.796 0-2.533Z"),
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
        return _pokerDiamondsFill!!
    }

private var _pokerDiamondsFill: ImageVector? = null
