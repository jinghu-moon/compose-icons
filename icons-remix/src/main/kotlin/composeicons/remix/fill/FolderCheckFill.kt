package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderCheckFill: ImageVector
    get() {
        if (_folderCheckFill != null) return _folderCheckFill!!
        _folderCheckFill = remixIcon(
            name = "FolderCheckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 13c1.093 0 2.118 .292 3 .803v-7.803C22 5.448 21.552 5 21 5h-8.586l-2-2h-7.414C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h10.341C13.12 20.374 13 19.701 13 19c0-3.314 2.686-6 6-6ZM15.465 18.465 19 22l4.95-4.95L22.535 15.636 19 19.172 16.879 17.051l-1.414 1.414Z"),
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
        return _folderCheckFill!!
    }

private var _folderCheckFill: ImageVector? = null
