package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBin6Line: ImageVector
    get() {
        if (_deleteBin6Line != null) return _deleteBin6Line!!
        _deleteBin6Line = remixIcon(
            name = "DeleteBin6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 4v-2h10v2h5v2h-2v15c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-15h-2v-2h5ZM6 6v14h12v-14h-12ZM9 9h2v8h-2v-8ZM13 9h2v8h-2v-8Z"),
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
        return _deleteBin6Line!!
    }

private var _deleteBin6Line: ImageVector? = null
