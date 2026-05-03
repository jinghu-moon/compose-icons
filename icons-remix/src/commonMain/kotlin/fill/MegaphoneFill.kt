package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MegaphoneFill: ImageVector
    get() {
        if (_megaphoneFill != null) return _megaphoneFill!!
        _megaphoneFill = remixIcon(
            name = "MegaphoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 10.063 L 21.000 4.000 C 21.000 3.448 20.552 3.000 20.000 3.000 L 19.000 3.000 C 17.021 4.979 13.303 6.087 11.000 6.613 L 11.000 17.387 C 13.303 17.913 17.021 19.021 19.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 13.937 C 21.863 13.715 22.500 12.932 22.500 12.000 C 22.500 11.068 21.863 10.285 21.000 10.063 ZM 5.000 7.000 C 3.895 7.000 3.000 7.895 3.000 9.000 L 3.000 15.000 C 3.000 16.105 3.895 17.000 5.000 17.000 L 6.000 17.000 L 7.000 22.000 L 9.000 22.000 L 9.000 7.000 L 5.000 7.000 Z"),
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
        return _megaphoneFill!!
    }

private var _megaphoneFill: ImageVector? = null
