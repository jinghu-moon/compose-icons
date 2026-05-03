package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PushpinLine: ImageVector
    get() {
        if (_pushpinLine != null) return _pushpinLine!!
        _pushpinLine = remixIcon(
            name = "PushpinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.827 1.690 L 22.313 10.175 L 20.898 11.590 L 20.191 10.882 L 15.949 15.125 L 15.241 18.661 L 13.827 20.075 L 9.585 15.832 L 4.635 20.782 L 3.221 19.368 L 8.170 14.418 L 3.928 10.175 L 5.342 8.761 L 8.878 8.054 L 13.120 3.811 L 12.413 3.104 L 13.827 1.690 ZM 14.534 5.226 L 9.864 9.896 L 7.042 10.461 L 13.542 16.961 L 14.106 14.139 L 18.777 9.468 L 14.534 5.226 Z"),
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
        return _pushpinLine!!
    }

private var _pushpinLine: ImageVector? = null
