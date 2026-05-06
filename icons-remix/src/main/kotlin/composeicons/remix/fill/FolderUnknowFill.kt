package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderUnknowFill: ImageVector
    get() {
        if (_folderUnknowFill != null) return _folderUnknowFill!!
        _folderUnknowFill = remixIcon(
            name = "FolderUnknowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM11 16v2h2v-2h-2ZM8.567 10.814l1.961 .392C10.666 10.518 11.272 10 12 10c.828 0 1.5 .672 1.5 1.5C13.5 12.328 12.828 13 12 13h-1v2h1c1.933 0 3.5-1.567 3.5-3.5C15.5 9.567 13.933 8 12 8 10.302 8 8.886 9.209 8.567 10.814Z"),
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
        return _folderUnknowFill!!
    }

private var _folderUnknowFill: ImageVector? = null
