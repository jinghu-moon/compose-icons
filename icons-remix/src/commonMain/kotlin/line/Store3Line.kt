package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Store3Line: ImageVector
    get() {
        if (_store3Line != null) return _store3Line!!
        _store3Line = remixIcon(
            name = "Store3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 13.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 13.000 L 2.000 13.000 L 2.000 11.000 L 3.000 6.000 L 21.000 6.000 L 22.000 11.000 L 22.000 13.000 L 21.000 13.000 ZM 5.000 13.000 L 5.000 19.000 L 19.000 19.000 L 19.000 13.000 L 5.000 13.000 ZM 4.040 11.000 L 19.960 11.000 L 19.360 8.000 L 4.640 8.000 L 4.040 11.000 ZM 6.000 14.000 L 14.000 14.000 L 14.000 17.000 L 6.000 17.000 L 6.000 14.000 ZM 3.000 3.000 L 21.000 3.000 L 21.000 5.000 L 3.000 5.000 L 3.000 3.000 Z"),
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
        return _store3Line!!
    }

private var _store3Line: ImageVector? = null
