package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TaxiFill: ImageVector
    get() {
        if (_taxiFill != null) return _taxiFill!!
        _taxiFill = remixIcon(
            name = "TaxiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 20.000 22.000 C 19.448 22.000 19.000 21.552 19.000 21.000 L 19.000 20.000 L 5.000 20.000 L 5.000 21.000 C 5.000 21.552 4.552 22.000 4.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 12.000 L 4.481 6.212 C 4.796 5.477 5.519 5.000 6.319 5.000 L 9.000 5.000 L 9.000 3.000 L 15.000 3.000 L 15.000 5.000 L 17.681 5.000 C 18.481 5.000 19.204 5.477 19.520 6.212 L 22.000 12.000 ZM 4.176 12.000 L 19.824 12.000 L 17.681 7.000 L 6.319 7.000 L 4.176 12.000 ZM 6.500 17.000 C 7.328 17.000 8.000 16.328 8.000 15.500 C 8.000 14.672 7.328 14.000 6.500 14.000 C 5.672 14.000 5.000 14.672 5.000 15.500 C 5.000 16.328 5.672 17.000 6.500 17.000 ZM 17.500 17.000 C 18.328 17.000 19.000 16.328 19.000 15.500 C 19.000 14.672 18.328 14.000 17.500 14.000 C 16.672 14.000 16.000 14.672 16.000 15.500 C 16.000 16.328 16.672 17.000 17.500 17.000 Z"),
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
        return _taxiFill!!
    }

private var _taxiFill: ImageVector? = null
