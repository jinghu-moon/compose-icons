package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GamepadLine: ImageVector
    get() {
        if (_gamepadLine != null) return _gamepadLine!!
        _gamepadLine = remixIcon(
            name = "GamepadLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 4.000 C 20.314 4.000 23.000 6.686 23.000 10.000 L 23.000 14.000 C 23.000 17.314 20.314 20.000 17.000 20.000 L 7.000 20.000 C 3.686 20.000 1.000 17.314 1.000 14.000 L 1.000 10.000 C 1.000 6.686 3.686 4.000 7.000 4.000 L 17.000 4.000 ZM 17.000 6.000 L 7.000 6.000 C 4.858 6.000 3.109 7.684 3.005 9.800 L 3.000 10.000 L 3.000 14.000 C 3.000 16.142 4.684 17.891 6.800 17.995 L 7.000 18.000 L 17.000 18.000 C 19.142 18.000 20.891 16.316 20.995 14.200 L 21.000 14.000 L 21.000 10.000 C 21.000 7.858 19.316 6.109 17.200 6.005 L 17.000 6.000 ZM 10.000 9.000 L 10.000 11.000 L 12.000 11.000 L 12.000 13.000 L 9.999 13.000 L 10.000 15.000 L 8.000 15.000 L 7.999 13.000 L 6.000 13.000 L 6.000 11.000 L 8.000 11.000 L 8.000 9.000 L 10.000 9.000 ZM 18.000 13.000 L 18.000 15.000 L 16.000 15.000 L 16.000 13.000 L 18.000 13.000 ZM 16.000 9.000 L 16.000 11.000 L 14.000 11.000 L 14.000 9.000 L 16.000 9.000 Z"),
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
        return _gamepadLine!!
    }

private var _gamepadLine: ImageVector? = null
