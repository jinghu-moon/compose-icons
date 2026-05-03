package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Share2Fill: ImageVector
    get() {
        if (_share2Fill != null) return _share2Fill!!
        _share2Fill = remixIcon(
            name = "Share2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.414 9.000 L 12.000 2.586 L 5.586 9.000 L 11.000 9.000 L 11.000 16.000 L 13.000 16.000 L 13.000 9.000 L 18.414 9.000 ZM 3.000 14.000 L 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 L 21.000 14.000 L 19.000 14.000 L 19.000 18.000 C 19.000 18.552 18.552 19.000 18.000 19.000 L 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 L 5.000 14.000 L 3.000 14.000 Z"),
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
        return _share2Fill!!
    }

private var _share2Fill: ImageVector? = null
