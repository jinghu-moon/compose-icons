package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MosaicFill: ImageVector
    get() {
        if (_mosaicFill != null) return _mosaicFill!!
        _mosaicFill = remixIcon(
            name = "MosaicFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3h16ZM7 15v2h2v-2h-2ZM11 15v2h2v-2h-2ZM15 15v2h2v-2h-2ZM9 13v2h2v-2h-2ZM13 13v2h2v-2h-2ZM7 11v2h2v-2h-2ZM11 11v2h2v-2h-2ZM15 11v2h2v-2h-2ZM9 9v2h2v-2h-2ZM13 9v2h2v-2h-2ZM7 7v2h2v-2h-2ZM11 7v2h2v-2h-2ZM15 7v2h2v-2h-2Z"),
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
        return _mosaicFill!!
    }

private var _mosaicFill: ImageVector? = null
