package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerHeartsFill: ImageVector
    get() {
        if (_pokerHeartsFill != null) return _pokerHeartsFill!!
        _pokerHeartsFill = remixIcon(
            name = "PokerHeartsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 8.5C2 5.462 4.462 3 7.5 3 9.36 3 11.005 3.923 12 5.337 12.995 3.923 14.64 3 16.5 3 19.538 3 22 5.462 22 8.5 22 16 12 21.485 12 21.485 12 21.485 2 16 2 8.5Z"),
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
        return _pokerHeartsFill!!
    }

private var _pokerHeartsFill: ImageVector? = null
