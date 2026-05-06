package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileList3Line: ImageVector
    get() {
        if (_fileList3Line != null) return _fileList3Line!!
        _fileList3Line = remixIcon(
            name = "FileList3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 22h-14C3.343 22 2 20.657 2 19v-16C2 2.448 2.448 2 3 2h14c.552 0 1 .448 1 1v12h4v4c0 1.657-1.343 3-3 3ZM18 17v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h-2ZM16 20v-16h-12v15c0 .552 .448 1 1 1h11ZM6 7h8v2h-8v-2ZM6 11h8v2h-8v-2ZM6 15h5v2h-5v-2Z"),
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
        return _fileList3Line!!
    }

private var _fileList3Line: ImageVector? = null
