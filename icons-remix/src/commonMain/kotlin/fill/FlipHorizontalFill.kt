package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlipHorizontalFill: ImageVector
    get() {
        if (_flipHorizontalFill != null) return _flipHorizontalFill!!
        _flipHorizontalFill = remixIcon(
            name = "FlipHorizontalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 2.000 L 11.000 22.000 L 13.000 22.000 L 13.000 2.000 L 11.000 2.000 ZM 7.000 6.000 L 7.000 18.000 L 4.000 18.000 L 4.000 6.000 L 7.000 6.000 ZM 4.000 4.000 C 2.895 4.000 2.000 4.895 2.000 6.000 L 2.000 18.000 C 2.000 19.105 2.895 20.000 4.000 20.000 L 7.000 20.000 C 8.105 20.000 9.000 19.105 9.000 18.000 L 9.000 6.000 C 9.000 4.895 8.105 4.000 7.000 4.000 L 4.000 4.000 ZM 15.000 6.000 C 15.000 4.895 15.895 4.000 17.000 4.000 L 20.000 4.000 C 21.105 4.000 22.000 4.895 22.000 6.000 L 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 17.000 20.000 C 15.895 20.000 15.000 19.105 15.000 18.000 L 15.000 6.000 Z"),
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
        return _flipHorizontalFill!!
    }

private var _flipHorizontalFill: ImageVector? = null
