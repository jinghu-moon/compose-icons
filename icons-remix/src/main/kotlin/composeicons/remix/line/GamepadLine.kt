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
                pathData = parseSvgPathData("M17 4c3.314 0 6 2.686 6 6v4c0 3.314-2.686 6-6 6h-10C3.686 20 1 17.314 1 14v-4C1 6.686 3.686 4 7 4h10ZM17 6h-10C4.858 6 3.109 7.684 3.005 9.8L3 10v4c0 2.142 1.684 3.891 3.8 3.995L7 18h10c2.142 0 3.891-1.684 3.995-3.8L21 14v-4C21 7.858 19.316 6.109 17.2 6.005L17 6ZM10 9v2h2v2h-2.001L10 15h-2L7.999 13h-1.999v-2h2v-2h2ZM18 13v2h-2v-2h2ZM16 9v2h-2v-2h2Z"),
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
