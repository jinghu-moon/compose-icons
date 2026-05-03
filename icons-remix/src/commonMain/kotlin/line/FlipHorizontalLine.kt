package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlipHorizontalLine: ImageVector
    get() {
        if (_flipHorizontalLine != null) return _flipHorizontalLine!!
        _flipHorizontalLine = remixIcon(
            name = "FlipHorizontalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 L 11.000 22.000 L 13.000 22.000 L 13.000 2.000 L 11.000 2.000 ZM 2.000 6.000 C 2.000 4.895 2.895 4.000 4.000 4.000 L 7.000 4.000 C 8.105 4.000 9.000 4.895 9.000 6.000 L 9.000 18.000 C 9.000 19.105 8.105 20.000 7.000 20.000 L 4.000 20.000 C 2.895 20.000 2.000 19.105 2.000 18.000 L 2.000 6.000 ZM 20.000 6.000 L 20.000 18.000 L 17.000 18.000 L 17.000 6.000 L 20.000 6.000 ZM 17.000 4.000 C 15.895 4.000 15.000 4.895 15.000 6.000 L 15.000 18.000 C 15.000 19.105 15.895 20.000 17.000 20.000 L 20.000 20.000 C 21.105 20.000 22.000 19.105 22.000 18.000 L 22.000 6.000 C 22.000 4.895 21.105 4.000 20.000 4.000 L 17.000 4.000 Z"),
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
        return _flipHorizontalLine!!
    }

private var _flipHorizontalLine: ImageVector? = null
