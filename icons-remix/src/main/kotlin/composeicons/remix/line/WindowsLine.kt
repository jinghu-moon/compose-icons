package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WindowsLine: ImageVector
    get() {
        if (_windowsLine != null) return _windowsLine!!
        _windowsLine = remixIcon(
            name = "WindowsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.001 2.5v19l-18-2v-15l18-2ZM19.001 12.999 12.001 13v5.487l7 .778v-6.266ZM5.001 17.71l5 .555v-5.265L5.001 12.999v4.711ZM19.001 10.999v-6.264l-7 .777v5.488l7-.001ZM10.001 5.734 5.001 6.29v4.709L10.001 11v-5.266Z"),
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
        return _windowsLine!!
    }

private var _windowsLine: ImageVector? = null
