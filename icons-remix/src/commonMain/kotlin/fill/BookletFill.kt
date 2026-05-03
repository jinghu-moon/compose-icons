package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BookletFill: ImageVector
    get() {
        if (_bookletFill != null) return _bookletFill!!
        _bookletFill = remixIcon(
            name = "BookletFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 2.000 L 8.000 22.000 L 4.000 22.000 L 4.000 18.000 L 2.000 18.000 L 2.000 16.000 L 4.000 16.000 L 4.000 13.000 L 2.000 13.000 L 2.000 11.000 L 4.000 11.000 L 4.000 8.000 L 2.000 8.000 L 2.000 6.000 L 4.000 6.000 L 4.000 2.000 L 8.000 2.000 ZM 20.005 2.000 C 21.107 2.000 22.000 2.898 22.000 3.991 L 22.000 20.009 C 22.000 21.109 21.107 22.000 20.005 22.000 L 10.000 22.000 L 10.000 2.000 L 20.005 2.000 Z"),
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
        return _bookletFill!!
    }

private var _bookletFill: ImageVector? = null
