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
                pathData = parseSvgPathData("M17 4c3.314 0 6 2.686 6 6v4c0 3.314-2.686 6-6 6h-10C3.686 20 1 17.314 1 14v-4C1 6.686 3.686 4 7 4h10ZM10 9h-2v2h-2v2h1.999L8 15h2L9.999 13h2.001v-2h-2v-2ZM18 13h-2v2h2v-2ZM16 9h-2v2h2v-2Z"),
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
