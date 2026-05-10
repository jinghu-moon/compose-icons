package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderForbidFill: ImageVector
    get() {
        if (_folderForbidFill != null) return _folderForbidFill!!
        _folderForbidFill = remixIcon(
            name = "FolderForbidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 11.255C20.866 10.464 19.487 10 18 10c-3.866 0-7 3.134-7 7 0 1.487 .464 2.866 1.255 4h-9.255C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v5.255ZM18 22c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5ZM16.707 19.708c.392 .187 .83 .292 1.293 .292 1.657 0 3-1.343 3-3 0-.463-.105-.902-.292-1.293l-4.001 4.001ZM15.292 18.293l4.001-4.001C18.902 14.105 18.463 14 18 14c-1.657 0-3 1.343-3 3 0 .463 .105 .902 .292 1.293Z"),
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
        return _folderForbidFill!!
    }

private var _folderForbidFill: ImageVector? = null
