package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBinFill: ImageVector
    get() {
        if (_deleteBinFill != null) return _deleteBinFill!!
        _deleteBinFill = remixIcon(
            name = "DeleteBinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 6.000 L 22.000 6.000 L 22.000 8.000 L 20.000 8.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 8.000 L 2.000 8.000 L 2.000 6.000 L 7.000 6.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 L 16.000 2.000 C 16.552 2.000 17.000 2.448 17.000 3.000 L 17.000 6.000 ZM 9.000 11.000 L 9.000 17.000 L 11.000 17.000 L 11.000 11.000 L 9.000 11.000 ZM 13.000 11.000 L 13.000 17.000 L 15.000 17.000 L 15.000 11.000 L 13.000 11.000 ZM 9.000 4.000 L 9.000 6.000 L 15.000 6.000 L 15.000 4.000 L 9.000 4.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _deleteBinFill!!
    }

private var _deleteBinFill: ImageVector? = null
