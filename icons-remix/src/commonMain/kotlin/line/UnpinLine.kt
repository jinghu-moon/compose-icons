package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UnpinLine: ImageVector
    get() {
        if (_unpinLine != null) return _unpinLine!!
        _unpinLine = remixIcon(
            name = "UnpinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.970 17.172 L 19.556 18.586 L 16.021 15.051 L 15.948 15.125 L 15.241 18.661 L 13.826 20.075 L 9.584 15.832 L 4.634 20.782 L 3.220 19.368 L 8.169 14.418 L 3.927 10.175 L 5.341 8.761 L 8.877 8.054 L 8.950 7.980 L 5.414 4.444 L 6.828 3.030 L 20.970 17.172 ZM 10.365 9.394 L 9.863 9.896 L 7.041 10.461 L 13.541 16.961 L 14.105 14.139 L 14.607 13.637 L 10.365 9.394 ZM 18.776 9.468 L 17.436 10.809 L 18.850 12.223 L 20.190 10.882 L 20.897 11.590 L 22.312 10.175 L 13.826 1.690 L 12.412 3.104 L 13.119 3.811 L 11.779 5.152 L 13.193 6.566 L 14.533 5.226 L 18.776 9.468 Z"),
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
        return _unpinLine!!
    }

private var _unpinLine: ImageVector? = null
