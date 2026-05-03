package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandbagFill: ImageVector
    get() {
        if (_handbagFill != null) return _handbagFill!!
        _handbagFill = remixIcon(
            name = "HandbagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 15.866 2.000 19.000 5.134 19.000 9.000 L 20.074 9.000 C 20.597 9.000 21.031 9.402 21.071 9.923 L 21.917 20.923 C 21.960 21.474 21.548 21.955 20.997 21.997 L 20.920 22.000 L 3.080 22.000 C 2.528 22.000 2.080 21.552 2.080 21.000 L 2.083 20.923 L 2.929 9.923 C 2.969 9.402 3.404 9.000 3.926 9.000 L 5.000 9.000 C 5.000 5.134 8.134 2.000 12.000 2.000 ZM 14.000 13.000 L 10.000 13.000 L 10.000 15.000 L 14.000 15.000 L 14.000 13.000 ZM 12.000 4.000 C 9.311 4.000 7.118 6.122 7.005 8.783 L 7.000 9.000 L 17.000 9.000 C 17.000 6.311 14.878 4.118 12.217 4.005 L 12.000 4.000 Z"),
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
        return _handbagFill!!
    }

private var _handbagFill: ImageVector? = null
