package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PhoneLockFill: ImageVector
    get() {
        if (_phoneLockFill != null) return _phoneLockFill!!
        _phoneLockFill = remixIcon(
            name = "PhoneLockFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.001 10.100 C 18.678 10.035 18.343 10.000 18.000 10.000 C 15.581 10.000 13.563 11.718 13.100 14.000 L 12.000 14.000 L 12.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 3.000 C 5.000 2.448 5.448 2.000 6.000 2.000 L 18.000 2.000 ZM 18.000 12.000 C 19.657 12.000 21.000 13.343 21.000 15.000 L 21.000 16.000 L 22.000 16.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 15.000 22.000 C 14.448 22.000 14.000 21.552 14.000 21.000 L 14.000 16.000 L 15.000 16.000 L 15.000 15.000 C 15.000 13.343 16.343 12.000 18.000 12.000 ZM 18.000 14.000 C 17.487 14.000 17.000 14.450 17.000 15.000 L 17.000 16.000 L 19.000 16.000 L 19.000 15.000 C 19.000 14.448 18.552 14.000 18.000 14.000 Z"),
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
        return _phoneLockFill!!
    }

private var _phoneLockFill: ImageVector? = null
