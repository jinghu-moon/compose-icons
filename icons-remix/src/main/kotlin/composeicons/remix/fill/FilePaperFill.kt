package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FilePaperFill: ImageVector
    get() {
        if (_filePaperFill != null) return _filePaperFill!!
        _filePaperFill = remixIcon(
            name = "FilePaperFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 15v-12C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v16c0 1.657-1.343 3-3 3h-14C2.343 22 1 20.657 1 19v-2h16v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-4h-16Z"),
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
        return _filePaperFill!!
    }

private var _filePaperFill: ImageVector? = null
