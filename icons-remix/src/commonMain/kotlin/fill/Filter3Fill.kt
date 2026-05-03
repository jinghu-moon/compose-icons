package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Filter3Fill: ImageVector
    get() {
        if (_filter3Fill != null) return _filter3Fill!!
        _filter3Fill = remixIcon(
            name = "Filter3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 18.000 L 14.000 18.000 L 14.000 16.000 L 10.000 16.000 L 10.000 18.000 ZM 3.000 6.000 L 3.000 8.000 L 21.000 8.000 L 21.000 6.000 L 3.000 6.000 ZM 6.000 13.000 L 18.000 13.000 L 18.000 11.000 L 6.000 11.000 L 6.000 13.000 Z"),
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
        return _filter3Fill!!
    }

private var _filter3Fill: ImageVector? = null
