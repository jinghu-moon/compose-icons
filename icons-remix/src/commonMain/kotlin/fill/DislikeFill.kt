package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DislikeFill: ImageVector
    get() {
        if (_dislikeFill != null) return _dislikeFill!!
        _dislikeFill = remixIcon(
            name = "DislikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.808 1.393 L 21.192 19.778 L 19.778 21.192 L 16.032 17.445 L 12.000 21.485 L 3.522 12.993 C 1.482 10.709 1.493 7.240 3.555 4.970 L 1.394 2.808 L 2.808 1.393 ZM 20.243 4.757 C 22.505 7.025 22.583 10.637 20.479 12.993 L 18.844 14.629 L 7.260 3.046 C 8.929 2.839 10.668 3.334 12.001 4.529 C 14.350 2.420 17.980 2.490 20.243 4.757 Z"),
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
        return _dislikeFill!!
    }

private var _dislikeFill: ImageVector? = null
