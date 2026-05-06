package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderLockLine: ImageVector
    get() {
        if (_folderLockLine != null) return _folderLockLine!!
        _folderLockLine = remixIcon(
            name = "FolderLockLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM4 5v14h16v-12h-8.414L9.586 5h-5.586ZM15 13h1v4h-8v-4h1v-1C9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3v1ZM13 13v-1c0-.552-.448-1-1-1-.552 0-1 .448-1 1v1h2Z"),
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
        return _folderLockLine!!
    }

private var _folderLockLine: ImageVector? = null
