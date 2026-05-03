package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBin4Fill: ImageVector
    get() {
        if (_deleteBin4Fill != null) return _deleteBin4Fill!!
        _deleteBin4Fill = remixIcon(
            name = "DeleteBin4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 7.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 7.000 L 2.000 7.000 L 2.000 5.000 L 22.000 5.000 L 22.000 7.000 L 20.000 7.000 ZM 11.000 10.000 L 11.000 17.000 L 13.000 17.000 L 13.000 10.000 L 11.000 10.000 ZM 7.000 2.000 L 17.000 2.000 L 17.000 4.000 L 7.000 4.000 L 7.000 2.000 Z"),
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
        return _deleteBin4Fill!!
    }

private var _deleteBin4Fill: ImageVector? = null
