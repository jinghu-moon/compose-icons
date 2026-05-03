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
                pathData = parseSvgPathData("M 4.036 10.733 L 11.226 1.946 C 11.626 1.457 12.374 1.457 12.774 1.946 L 19.964 10.733 C 20.566 11.470 20.566 12.530 19.964 13.267 L 12.774 22.054 C 12.374 22.543 11.626 22.543 11.226 22.054 L 4.036 13.267 C 3.433 12.530 3.433 11.470 4.036 10.733 Z"),
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
