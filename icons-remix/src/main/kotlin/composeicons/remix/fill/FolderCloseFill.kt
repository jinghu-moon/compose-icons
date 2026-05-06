package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderCloseFill: ImageVector
    get() {
        if (_folderCloseFill != null) return _folderCloseFill!!
        _folderCloseFill = remixIcon(
            name = "FolderCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 12c1.093 0 2.118 .292 3 .803v-6.803C22 5.448 21.552 5 21 5h-8.586l-2-2h-7.414C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h10.803C13.292 20.118 13 19.093 13 18c0-3.314 2.686-6 6-6ZM20.414 18l2.121 2.121-1.414 1.414L19 19.414l-2.121 2.121L15.465 20.121l2.121-2.121L15.465 15.879l1.414-1.414 2.121 2.121 2.121-2.121 1.414 1.414-2.121 2.121Z"),
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
        return _folderCloseFill!!
    }

private var _folderCloseFill: ImageVector? = null
