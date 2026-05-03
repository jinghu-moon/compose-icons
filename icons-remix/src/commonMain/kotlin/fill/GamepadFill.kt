package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GamepadFill: ImageVector
    get() {
        if (_gamepadFill != null) return _gamepadFill!!
        _gamepadFill = remixIcon(
            name = "GamepadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 4.000 C 20.314 4.000 23.000 6.686 23.000 10.000 L 23.000 14.000 C 23.000 17.314 20.314 20.000 17.000 20.000 L 7.000 20.000 C 3.686 20.000 1.000 17.314 1.000 14.000 L 1.000 10.000 C 1.000 6.686 3.686 4.000 7.000 4.000 L 17.000 4.000 ZM 10.000 9.000 L 8.000 9.000 L 8.000 11.000 L 6.000 11.000 L 6.000 13.000 L 7.999 13.000 L 8.000 15.000 L 10.000 15.000 L 9.999 13.000 L 12.000 13.000 L 12.000 11.000 L 10.000 11.000 L 10.000 9.000 ZM 18.000 13.000 L 16.000 13.000 L 16.000 15.000 L 18.000 15.000 L 18.000 13.000 ZM 16.000 9.000 L 14.000 9.000 L 14.000 11.000 L 16.000 11.000 L 16.000 9.000 Z"),
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
        return _gamepadFill!!
    }

private var _gamepadFill: ImageVector? = null
