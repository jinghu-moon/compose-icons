package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileZipFill: ImageVector
    get() {
        if (_fileZipFill != null) return _fileZipFill!!
        _fileZipFill = remixIcon(
            name = "FileZipFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2v2h2v-2h8.007c.549 0 .993 .444 .993 .992v18.016c0 .537-.445 .992-.993 .992h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.445 2 3.993 2h6.007ZM12 4v2h2v-2h-2ZM10 6v2h2v-2h-2ZM12 8v2h2v-2h-2ZM10 10v2h2v-2h-2ZM12 12v2h-2v3h4v-5h-2Z"),
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
        return _fileZipFill!!
    }

private var _fileZipFill: ImageVector? = null
