package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderImageFill: ImageVector
    get() {
        if (_folderImageFill != null) return _folderImageFill!!
        _folderImageFill = remixIcon(
            name = "FolderImageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM10 10.5C10 9.672 9.328 9 8.5 9 7.672 9 7 9.672 7 10.5 7 11.328 7.672 12 8.5 12 9.328 12 10 11.328 10 10.5ZM18 17 14 11 7 17h11Z"),
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
        return _folderImageFill!!
    }

private var _folderImageFill: ImageVector? = null
