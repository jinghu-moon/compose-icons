package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Forward10Line: ImageVector
    get() {
        if (_forward10Line != null) return _forward10Line!!
        _forward10Line = remixIcon(
            name = "Forward10Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2C6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10h-2c0 4.418-3.582 8-8 8C7.582 20 4 16.418 4 12 4 7.582 7.582 4 12 4c2.75 0 5.176 1.387 6.615 3.5L16 7.5v1.25c-.418-.314-.937-.5-1.5-.5C13.119 8.25 12 9.369 12 10.75v2.5c0 1.381 1.119 2.5 2.5 2.5 1.381 0 2.5-1.119 2.5-2.5v-2.5c0-.455-.122-.882-.334-1.25h5.334v-6h-2l0 2.499C18.176 3.571 15.271 2 12 2ZM15.5 10.75v2.5c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2.5c0-.552 .448-1 1-1 .552 0 1 .448 1 1ZM10 8.5h-1.5v7h1.5v-7Z"),
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
        return _forward10Line!!
    }

private var _forward10Line: ImageVector? = null
