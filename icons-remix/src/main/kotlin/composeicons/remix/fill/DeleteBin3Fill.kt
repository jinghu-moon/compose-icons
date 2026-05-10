package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin3Fill: ImageVector
    get() {
        if (_deleteBin3Fill != null) return _deleteBin3Fill!!
        _deleteBin3Fill = remixIcon(
            name = "DeleteBin3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 7v14c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-14h-2v-2h20v2h-2ZM11 9v2h2v-2h-2ZM11 12v2h2v-2h-2ZM11 15v2h2v-2h-2ZM7 2h10v2h-10v-2Z"),
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
        return _deleteBin3Fill!!
    }

private var _deleteBin3Fill: ImageVector? = null
