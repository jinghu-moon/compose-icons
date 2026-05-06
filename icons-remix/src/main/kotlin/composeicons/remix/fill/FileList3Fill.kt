package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileList3Fill: ImageVector
    get() {
        if (_fileList3Fill != null) return _fileList3Fill!!
        _fileList3Fill = remixIcon(
            name = "FileList3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 22h-14C3.343 22 2 20.657 2 19v-16C2 2.448 2.448 2 3 2h14c.552 0 1 .448 1 1v12h4v4c0 1.657-1.343 3-3 3ZM18 17v2c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h-2ZM6 7v2h8v-2h-8ZM6 11v2h8v-2h-8ZM6 15v2h5v-2h-5Z"),
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
        return _fileList3Fill!!
    }

private var _fileList3Fill: ImageVector? = null
