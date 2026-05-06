package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderUnknowLine: ImageVector
    get() {
        if (_folderUnknowLine != null) return _folderUnknowLine!!
        _folderUnknowLine = remixIcon(
            name = "FolderUnknowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM4 5v14h16v-12h-8.414L9.586 5h-5.586ZM11 16h2v2h-2v-2ZM8.567 10.814C8.886 9.209 10.302 8 12 8c1.933 0 3.5 1.567 3.5 3.5C15.5 13.433 13.933 15 12 15h-1v-2h1c.828 0 1.5-.672 1.5-1.5C13.5 10.672 12.828 10 12 10c-.728 0-1.334 .518-1.471 1.206L8.567 10.814Z"),
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
        return _folderUnknowLine!!
    }

private var _folderUnknowLine: ImageVector? = null
