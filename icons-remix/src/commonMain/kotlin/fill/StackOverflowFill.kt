package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackOverflowFill: ImageVector
    get() {
        if (_stackOverflowFill != null) return _stackOverflowFill!!
        _stackOverflowFill = remixIcon(
            name = "StackOverflowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.001 20.003 L 18.001 14.669 L 20.001 14.669 L 20.001 22.003 L 4.001 22.003 L 4.001 14.669 L 6.001 14.669 L 6.001 20.003 L 18.001 20.003 ZM 7.600 14.736 L 7.913 12.757 L 16.750 14.456 L 16.637 16.042 L 7.600 14.736 ZM 8.799 10.204 L 9.532 8.605 L 17.530 12.337 L 16.797 13.936 L 8.799 10.204 ZM 11.065 6.272 L 12.198 4.939 L 18.996 10.604 L 17.863 11.937 L 11.065 6.272 ZM 15.397 2.140 L 20.662 9.204 L 19.263 10.271 L 13.998 3.206 L 15.397 2.140 ZM 7.333 18.668 L 7.333 16.669 L 16.663 16.669 L 16.663 18.668 L 7.333 18.668 Z"),
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
        return _stackOverflowFill!!
    }

private var _stackOverflowFill: ImageVector? = null
