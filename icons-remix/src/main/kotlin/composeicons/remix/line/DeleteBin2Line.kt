package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeleteBin2Line: ImageVector
    get() {
        if (_deleteBin2Line != null) return _deleteBin2Line!!
        _deleteBin2Line = remixIcon(
            name = "DeleteBin2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 6h5v2h-2v13c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-13h-2v-2h5v-3C7 2.448 7.448 2 8 2h8c.552 0 1 .448 1 1v3ZM18 8h-12v12h12v-12ZM13.414 14l1.768 1.768-1.414 1.414L12 15.414l-1.768 1.768L8.818 15.767l1.768-1.768L8.818 12.232l1.414-1.414L12 12.585l1.768-1.768 1.414 1.414-1.768 1.768ZM9 4v2h6v-2h-6Z"),
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
        return _deleteBin2Line!!
    }

private var _deleteBin2Line: ImageVector? = null
