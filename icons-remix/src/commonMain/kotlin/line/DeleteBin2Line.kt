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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 6.000 L 22.000 6.000 L 22.000 8.000 L 20.000 8.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 8.000 L 2.000 8.000 L 2.000 6.000 L 7.000 6.000 L 7.000 3.000 C 7.000 2.448 7.448 2.000 8.000 2.000 L 16.000 2.000 C 16.552 2.000 17.000 2.448 17.000 3.000 L 17.000 6.000 ZM 18.000 8.000 L 6.000 8.000 L 6.000 20.000 L 18.000 20.000 L 18.000 8.000 ZM 13.414 14.000 L 15.182 15.767 L 13.768 17.182 L 12.000 15.414 L 10.232 17.182 L 8.818 15.767 L 10.586 14.000 L 8.818 12.232 L 10.232 10.818 L 12.000 12.585 L 13.768 10.818 L 15.182 12.232 L 13.414 14.000 ZM 9.000 4.000 L 9.000 6.000 L 15.000 6.000 L 15.000 4.000 L 9.000 4.000 Z"),
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
        return _deleteBin2Line!!
    }

private var _deleteBin2Line: ImageVector? = null
