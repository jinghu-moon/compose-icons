package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBin5Line: ImageVector
    get() {
        if (_deleteBin5Line != null) return _deleteBin5Line!!
        _deleteBin5Line = remixIcon(
            name = "DeleteBin5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 8h16v13c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13ZM6 10v10h12v-10h-12ZM9 12h2v6h-2v-6ZM13 12h2v6h-2v-6ZM7 5v-2C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v2h5v2h-20v-2h5ZM9 4v1h6v-1h-6Z"),
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
        return _deleteBin5Line!!
    }

private var _deleteBin5Line: ImageVector? = null
