package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin5Fill: ImageVector
    get() {
        if (_deleteBin5Fill != null) return _deleteBin5Fill!!
        _deleteBin5Fill = remixIcon(
            name = "DeleteBin5Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 8h16v13c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13ZM7 5v-2C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v2h5v2h-20v-2h5ZM9 4v1h6v-1h-6ZM9 12v6h2v-6h-2ZM13 12v6h2v-6h-2Z"),
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
        return _deleteBin5Fill!!
    }

private var _deleteBin5Fill: ImageVector? = null
