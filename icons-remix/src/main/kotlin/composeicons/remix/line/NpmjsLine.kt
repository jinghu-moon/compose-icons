package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NpmjsLine: ImageVector
    get() {
        if (_npmjsLine != null) return _npmjsLine!!
        _npmjsLine = remixIcon(
            name = "NpmjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.001 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h16ZM19.001 5h-14v14h14v-14ZM17.001 7v10h-2.5v-7.5h-2.5v7.5h-5v-10h10Z"),
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
        return _npmjsLine!!
    }

private var _npmjsLine: ImageVector? = null
