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
                pathData = parseSvgPathData("M18.414 9 12 2.586 5.586 9h5.414v7h2v-7h5.414ZM3 14v4c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-4h-2v4c0 .552-.448 1-1 1h-12C5.448 19 5 18.552 5 18v-4h-2Z"),
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
