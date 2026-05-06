package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderVideoLine: ImageVector
    get() {
        if (_folderVideoLine != null) return _folderVideoLine!!
        _folderVideoLine = remixIcon(
            name = "FolderVideoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19v-14h5.586l2 2h8.414v12h-16ZM21 5h-8.586l-2-2h-7.414C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h18c.552 0 1-.448 1-1v-14C22 5.448 21.552 5 21 5ZM15.001 12.667 10.122 9.414c-.066-.044-.143-.067-.222-.067-.221 0-.4 .179-.4 .4v6.505c0 .079 .023 .156 .067 .222 .123 .184 .371 .233 .555 .111l4.879-3.253c.044-.029 .082-.067 .111-.111 .123-.184 .073-.432-.111-.555Z"),
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
        return _folderVideoLine!!
    }

private var _folderVideoLine: ImageVector? = null
