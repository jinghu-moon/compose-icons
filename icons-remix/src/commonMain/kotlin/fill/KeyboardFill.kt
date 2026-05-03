package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KeyboardFill: ImageVector
    get() {
        if (_keyboardFill != null) return _keyboardFill!!
        _keyboardFill = remixIcon(
            name = "KeyboardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 17.000 L 21.000 17.000 L 21.000 19.000 L 3.000 19.000 L 3.000 17.000 ZM 3.000 11.000 L 6.000 11.000 L 6.000 14.000 L 3.000 14.000 L 3.000 11.000 ZM 8.000 11.000 L 11.000 11.000 L 11.000 14.000 L 8.000 14.000 L 8.000 11.000 ZM 3.000 5.000 L 6.000 5.000 L 6.000 8.000 L 3.000 8.000 L 3.000 5.000 ZM 13.000 5.000 L 16.000 5.000 L 16.000 8.000 L 13.000 8.000 L 13.000 5.000 ZM 18.000 5.000 L 21.000 5.000 L 21.000 8.000 L 18.000 8.000 L 18.000 5.000 ZM 13.000 11.000 L 16.000 11.000 L 16.000 14.000 L 13.000 14.000 L 13.000 11.000 ZM 18.000 11.000 L 21.000 11.000 L 21.000 14.000 L 18.000 14.000 L 18.000 11.000 ZM 8.000 5.000 L 11.000 5.000 L 11.000 8.000 L 8.000 8.000 L 8.000 5.000 Z"),
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
        return _keyboardFill!!
    }

private var _keyboardFill: ImageVector? = null
