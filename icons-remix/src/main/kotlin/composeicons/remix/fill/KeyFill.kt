package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KeyFill: ImageVector
    get() {
        if (_keyFill != null) return _keyFill!!
        _keyFill = remixIcon(
            name = "KeyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 14h-4.341C11.835 16.33 9.612 18 7 18 3.686 18 1 15.314 1 12 1 8.686 3.686 6 7 6c2.612 0 4.835 1.67 5.659 4h10.341v4h-2v4h-4v-4ZM7 14c1.105 0 2-.895 2-2C9 10.895 8.105 10 7 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _keyFill!!
    }

private var _keyFill: ImageVector? = null
