package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileUnknowFill: ImageVector
    get() {
        if (_fileUnknowFill != null) return _fileUnknowFill!!
        _fileUnknowFill = remixIcon(
            name = "FileUnknowFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5v14.008c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007ZM11 15v2h2v-2h-2ZM13 13.355c1.446-.43 2.5-1.77 2.5-3.355C15.5 8.067 13.933 6.5 12 6.5c-1.698 0-3.114 1.209-3.433 2.813l1.961 .392C10.666 9.018 11.272 8.5 12 8.5c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.552 0-1 .448-1 1v1.5h2v-.645Z"),
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
        return _fileUnknowFill!!
    }

private var _fileUnknowFill: ImageVector? = null
