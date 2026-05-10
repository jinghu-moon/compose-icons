package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileListFill: ImageVector
    get() {
        if (_fileListFill != null) return _fileListFill!!
        _fileListFill = remixIcon(
            name = "FileListFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM8 7v2h8v-2h-8ZM8 11v2h8v-2h-8ZM8 15v2h8v-2h-8Z"),
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
        return _fileListFill!!
    }

private var _fileListFill: ImageVector? = null
