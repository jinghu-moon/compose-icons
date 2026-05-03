package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RssFill: ImageVector
    get() {
        if (_rssFill != null) return _rssFill!!
        _rssFill = remixIcon(
            name = "RssFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 C 12.941 3.000 21.000 11.059 21.000 21.000 L 18.000 21.000 C 18.000 12.716 11.284 6.000 3.000 6.000 L 3.000 3.000 ZM 3.000 10.000 C 9.075 10.000 14.000 14.925 14.000 21.000 L 11.000 21.000 C 11.000 16.582 7.418 13.000 3.000 13.000 L 3.000 10.000 ZM 3.000 17.000 C 5.209 17.000 7.000 18.791 7.000 21.000 L 3.000 21.000 L 3.000 17.000 Z"),
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
        return _rssFill!!
    }

private var _rssFill: ImageVector? = null
