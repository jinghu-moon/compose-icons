package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EraserLine: ImageVector
    get() {
        if (_eraserLine != null) return _eraserLine!!
        _eraserLine = remixIcon(
            name = "EraserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.586 8.854 3.636 13.804l5.194 5.194 1.17-.001v-.001h1.172l3.778-3.778L8.586 8.854ZM10 7.44l6.364 6.364 2.828-2.828L12.828 4.612 10 7.44ZM14 18.997h7v2h-9l-3.998 .003L1.515 14.511c-.391-.391-.391-1.024 0-1.414L12.121 2.491c.391-.391 1.024-.391 1.414 0l7.778 7.778c.39 .391 .39 1.024 0 1.414l-7.314 7.314Z"),
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
        return _eraserLine!!
    }

private var _eraserLine: ImageVector? = null
