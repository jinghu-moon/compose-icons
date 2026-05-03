package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FindReplaceFill: ImageVector
    get() {
        if (_findReplaceFill != null) return _findReplaceFill!!
        _findReplaceFill = remixIcon(
            name = "FindReplaceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.031 16.617 L 22.314 20.899 L 20.899 22.314 L 16.617 18.031 C 15.077 19.263 13.124 20.000 11.000 20.000 C 6.032 20.000 2.000 15.968 2.000 11.000 C 2.000 6.032 6.032 2.000 11.000 2.000 C 15.968 2.000 20.000 6.032 20.000 11.000 C 20.000 13.124 19.263 15.077 18.031 16.617 ZM 16.659 9.000 C 15.836 6.669 13.614 5.000 11.000 5.000 C 7.685 5.000 5.000 7.685 5.000 11.000 L 7.000 11.000 C 7.000 8.792 8.792 7.000 11.000 7.000 C 11.691 7.000 12.342 7.176 12.909 7.485 L 12.000 9.000 L 16.659 9.000 ZM 17.000 11.000 L 15.000 11.000 C 15.000 13.208 13.208 15.000 11.000 15.000 C 10.309 15.000 9.658 14.824 9.091 14.515 L 10.000 13.000 L 7.536 13.000 L 5.341 13.000 C 6.164 15.331 8.386 17.000 11.000 17.000 C 14.315 17.000 17.000 14.315 17.000 11.000 Z"),
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
        return _findReplaceFill!!
    }

private var _findReplaceFill: ImageVector? = null
