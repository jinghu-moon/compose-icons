package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DiamondRingLine: ImageVector
    get() {
        if (_diamondRingLine != null) return _diamondRingLine!!
        _diamondRingLine = remixIcon(
            name = "DiamondRingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.465 1.000 L 7.691 3.661 L 9.556 5.357 C 6.053 6.407 3.500 9.655 3.500 13.500 C 3.500 18.194 7.306 22.000 12.000 22.000 C 16.694 22.000 20.500 18.194 20.500 13.500 C 20.500 9.655 17.947 6.407 14.444 5.357 L 16.309 3.661 L 14.535 1.000 L 9.465 1.000 ZM 12.000 7.000 C 15.590 7.000 18.500 9.910 18.500 13.500 C 18.500 17.090 15.590 20.000 12.000 20.000 C 8.410 20.000 5.500 17.090 5.500 13.500 C 5.500 9.910 8.410 7.000 12.000 7.000 ZM 10.309 3.339 L 10.535 3.000 L 13.465 3.000 L 13.691 3.339 L 12.000 4.876 L 10.309 3.339 Z"),
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
        return _diamondRingLine!!
    }

private var _diamondRingLine: ImageVector? = null
