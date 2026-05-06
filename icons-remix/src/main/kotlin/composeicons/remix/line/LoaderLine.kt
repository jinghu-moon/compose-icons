package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LoaderLine: ImageVector
    get() {
        if (_loaderLine != null) return _loaderLine!!
        _loaderLine = remixIcon(
            name = "LoaderLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1ZM12 17c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1ZM20.66 7c.276 .478 .112 1.09-.366 1.366L17.696 9.866c-.478 .276-1.09 .112-1.366-.366-.276-.478-.112-1.09 .366-1.366L19.294 6.634c.478-.276 1.09-.112 1.366 .366ZM7.669 14.5c.276 .478 .112 1.09-.366 1.366L4.705 17.366C4.227 17.642 3.615 17.478 3.339 17c-.276-.478-.112-1.09 .366-1.366L6.303 14.134c.478-.276 1.09-.112 1.366 .366ZM20.66 17c-.276 .478-.888 .642-1.366 .366L16.696 15.866c-.478-.276-.642-.888-.366-1.366 .276-.478 .888-.642 1.366-.366l2.598 1.5c.478 .276 .642 .888 .366 1.366ZM7.669 9.5c-.276 .478-.888 .642-1.366 .366L3.705 8.366C3.227 8.09 3.063 7.478 3.339 7c.276-.478 .888-.642 1.366-.366L7.303 8.134c.478 .276 .642 .888 .366 1.366Z"),
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
        return _loaderLine!!
    }

private var _loaderLine: ImageVector? = null
