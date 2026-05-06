package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeyboardLine: ImageVector
    get() {
        if (_keyboardLine != null) return _keyboardLine!!
        _keyboardLine = remixIcon(
            name = "KeyboardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 17h18v2h-18v-2ZM3 11h3v3h-3v-3ZM8 11h3v3h-3v-3ZM3 5h3v3h-3v-3ZM13 5h3v3h-3v-3ZM18 5h3v3h-3v-3ZM13 11h3v3h-3v-3ZM18 11h3v3h-3v-3ZM8 5h3v3h-3v-3Z"),
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
        return _keyboardLine!!
    }

private var _keyboardLine: ImageVector? = null
