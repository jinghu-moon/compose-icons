package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderVideoFill: ImageVector
    get() {
        if (_folderVideoFill != null) return _folderVideoFill!!
        _folderVideoFill = remixIcon(
            name = "FolderVideoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 5h-8.586l-2-2h-7.414C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-14C22 5.448 21.552 5 21 5ZM15.001 12.667c.184 .123 .233 .371 .111 .555-.029 .044-.067 .082-.111 .111l-4.879 3.253c-.184 .123-.432 .073-.555-.111-.044-.066-.067-.143-.067-.222v-6.505c0-.221 .179-.4 .4-.4 .079 0 .156 .023 .222 .067l4.879 3.253Z"),
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
        return _folderVideoFill!!
    }

private var _folderVideoFill: ImageVector? = null
