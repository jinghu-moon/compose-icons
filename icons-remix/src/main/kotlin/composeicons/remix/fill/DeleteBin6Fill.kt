package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin6Fill: ImageVector
    get() {
        if (_deleteBin6Fill != null) return _deleteBin6Fill!!
        _deleteBin6Fill = remixIcon(
            name = "DeleteBin6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 4h5v2h-2v15c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-15h-2v-2h5v-2h10v2ZM9 9v8h2v-8h-2ZM13 9v8h2v-8h-2Z"),
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
        return _deleteBin6Fill!!
    }

private var _deleteBin6Fill: ImageVector? = null
