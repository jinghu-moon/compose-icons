package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShutDownLine: ImageVector
    get() {
        if (_shutDownLine != null) return _shutDownLine!!
        _shutDownLine = remixIcon(
            name = "ShutDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.265 3.807 7.412 5.446C5.349 6.892 4 9.289 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 9.289 18.651 6.892 16.588 5.446L17.735 3.807C20.314 5.616 22 8.611 22 12c0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 8.611 3.686 5.616 6.265 3.807ZM11 12v-10h2v10h-2Z"),
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
        return _shutDownLine!!
    }

private var _shutDownLine: ImageVector? = null
