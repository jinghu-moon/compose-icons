package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Store3Fill: ImageVector
    get() {
        if (_store3Fill != null) return _store3Fill!!
        _store3Fill = remixIcon(
            name = "Store3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 13.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 13.000 L 2.000 13.000 L 2.000 11.000 L 3.000 6.000 L 21.000 6.000 L 22.000 11.000 L 22.000 13.000 L 21.000 13.000 ZM 5.000 13.000 L 5.000 19.000 L 19.000 19.000 L 19.000 13.000 L 5.000 13.000 ZM 6.000 14.000 L 14.000 14.000 L 14.000 17.000 L 6.000 17.000 L 6.000 14.000 ZM 3.000 3.000 L 21.000 3.000 L 21.000 5.000 L 3.000 5.000 L 3.000 3.000 Z"),
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
        return _store3Fill!!
    }

private var _store3Fill: ImageVector? = null
