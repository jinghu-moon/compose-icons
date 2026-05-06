package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderCheckLine: ImageVector
    get() {
        if (_folderCheckLine != null) return _folderCheckLine!!
        _folderCheckLine = remixIcon(
            name = "FolderCheckLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 3C2.448 3 2 3.448 2 4v16c0 .552 .448 1 1 1h10v-2h-9v-14h5.586l2 2h8.414v6h2v-7C22 5.448 21.552 5 21 5h-8.586l-2-2h-7.414ZM15.465 18.465 19 22l4.95-4.95L22.535 15.636 19 19.172 16.879 17.051l-1.414 1.414Z"),
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
        return _folderCheckLine!!
    }

private var _folderCheckLine: ImageVector? = null
