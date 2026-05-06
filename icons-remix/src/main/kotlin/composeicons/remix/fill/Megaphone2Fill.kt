package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Megaphone2Fill: ImageVector
    get() {
        if (_megaphone2Fill != null) return _megaphone2Fill!!
        _megaphone2Fill = remixIcon(
            name = "Megaphone2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.31 20.095c.106 1.065-.646 2.024-1.705 2.176-.935 .133-1.835-.407-2.158-1.295L7 17h5l.31 3.095ZM19.445 2.037C20.11 1.594 21 2.07 21 2.869v15.263c0 .799-.89 1.275-1.555 .832L15 16h-7.5C4.463 16 2 13.538 2 10.5 2 7.463 4.462 5 7.5 5h7.5L19.445 2.037Z"),
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
        return _megaphone2Fill!!
    }

private var _megaphone2Fill: ImageVector? = null
