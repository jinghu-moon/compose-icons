package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HammerFill: ImageVector
    get() {
        if (_hammerFill != null) return _hammerFill!!
        _hammerFill = remixIcon(
            name = "HammerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 8.000 L 17.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 7.000 C 21.000 7.552 20.552 8.000 20.000 8.000 L 17.000 8.000 ZM 15.000 22.000 C 15.000 22.552 14.552 23.000 14.000 23.000 L 10.000 23.000 C 9.448 23.000 9.000 22.552 9.000 22.000 L 9.000 8.000 L 2.500 8.000 L 2.500 6.074 C 2.500 5.719 2.689 5.390 2.996 5.211 L 8.500 2.000 L 15.000 2.000 L 15.000 22.000 Z"),
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
        return _hammerFill!!
    }

private var _hammerFill: ImageVector? = null
