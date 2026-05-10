package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileEditFill: ImageVector
    get() {
        if (_fileEditFill != null) return _fileEditFill!!
        _fileEditFill = remixIcon(
            name = "FileEditFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 15.243v5.766c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.551 3 20.993v-11.993h6c.552 0 1-.448 1-1v-6h10.002c.551 0 .998 .455 .998 .992v3.766l-8.999 8.999-.006 4.239 4.246 .006L21 15.243ZM21.778 8.808l1.414 1.414L15.414 18l-1.416-.002L14 16.586 21.778 8.808ZM3 7 8 2.003v4.997h-5Z"),
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
        return _fileEditFill!!
    }

private var _fileEditFill: ImageVector? = null
