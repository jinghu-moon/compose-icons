package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin2Fill: ImageVector
    get() {
        if (_deleteBin2Fill != null) return _deleteBin2Fill!!
        _deleteBin2Fill = remixIcon(
            name = "DeleteBin2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6v-3C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v3h5v2h-2v13c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13h-2v-2h5ZM13.414 14l1.768-1.768L13.768 10.818 12 12.585 10.232 10.818 8.818 12.232l1.768 1.768L8.818 15.767l1.414 1.414L12 15.414l1.768 1.768 1.414-1.414L13.414 14ZM9 4v2h6v-2h-6Z"),
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
        return _deleteBin2Fill!!
    }

private var _deleteBin2Fill: ImageVector? = null
