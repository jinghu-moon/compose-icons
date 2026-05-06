package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderCloseLine: ImageVector
    get() {
        if (_folderCloseLine != null) return _folderCloseLine!!
        _folderCloseLine = remixIcon(
            name = "FolderCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h10v-2h-9v-14h5.586l2 2h8.414v5h2v-6C22 5.448 21.552 5 21 5h-8.586l-2-2h-7.414ZM20.414 18l2.121 2.121-1.414 1.414L19 19.414l-2.121 2.121L15.465 20.121l2.121-2.121L15.465 15.879l1.414-1.414 2.121 2.121 2.121-2.121 1.414 1.414-2.121 2.121Z"),
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
        return _folderCloseLine!!
    }

private var _folderCloseLine: ImageVector? = null
