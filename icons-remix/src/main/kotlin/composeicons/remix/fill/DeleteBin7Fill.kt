package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin7Fill: ImageVector
    get() {
        if (_deleteBin7Fill != null) return _deleteBin7Fill!!
        _deleteBin7Fill = remixIcon(
            name = "DeleteBin7Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6v-3C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v3h5v2h-2v13c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13h-2v-2h5ZM9 4v2h6v-2h-6Z"),
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
        return _deleteBin7Fill!!
    }

private var _deleteBin7Fill: ImageVector? = null
