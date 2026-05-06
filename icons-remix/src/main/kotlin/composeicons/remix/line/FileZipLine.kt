package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileZipLine: ImageVector
    get() {
        if (_fileZipLine != null) return _fileZipLine!!
        _fileZipLine = remixIcon(
            name = "FileZipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 22h-16C3.448 22 3 21.552 3 21v-18C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1ZM19 20v-16h-14v16h14ZM14 12v5h-4v-3h2v-2h2ZM12 4h2v2h-2v-2ZM10 6h2v2h-2v-2ZM12 8h2v2h-2v-2ZM10 10h2v2h-2v-2Z"),
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
        return _fileZipLine!!
    }

private var _fileZipLine: ImageVector? = null
