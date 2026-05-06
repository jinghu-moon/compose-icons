package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileShredLine: ImageVector
    get() {
        if (_fileShredLine != null) return _fileShredLine!!
        _fileShredLine = remixIcon(
            name = "FileShredLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 12h12v-4h-4v-4h-8v8ZM4 12v-9.005C4 2.446 4.445 2 4.996 2h10.004l5 5L20 12h2v2h-20v-2h2ZM3 16h2v6h-2v-6ZM19 16h2v6h-2v-6ZM15 16h2v6h-2v-6ZM11 16h2v6h-2v-6ZM7 16h2v6h-2v-6Z"),
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
        return _fileShredLine!!
    }

private var _fileShredLine: ImageVector? = null
