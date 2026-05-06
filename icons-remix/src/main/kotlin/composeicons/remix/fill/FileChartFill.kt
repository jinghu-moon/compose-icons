package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileChartFill: ImageVector
    get() {
        if (_fileChartFill != null) return _fileChartFill!!
        _fileChartFill = remixIcon(
            name = "FileChartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 2l5 5v14.008c0 .548-.445 .992-.993 .992h-16.013C3.445 22 3 21.545 3 21.008v-18.016C3 2.444 3.445 2 3.993 2h12.007ZM11 7v10h2v-10h-2ZM15 11v6h2v-6h-2ZM7 13v4h2v-4h-2Z"),
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
        return _fileChartFill!!
    }

private var _fileChartFill: ImageVector? = null
