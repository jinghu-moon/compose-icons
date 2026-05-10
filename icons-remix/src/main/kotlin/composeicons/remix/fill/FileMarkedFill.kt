package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileMarkedFill: ImageVector
    get() {
        if (_fileMarkedFill != null) return _fileMarkedFill!!
        _fileMarkedFill = remixIcon(
            name = "FileMarkedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 2.992v18.016c0 .537-.445 .992-.993 .992h-16.013C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.445 2 3.993 2h16.013c.549 0 .993 .444 .993 .992ZM7 4v9l3.5-2L14 13v-9h-7Z"),
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
        return _fileMarkedFill!!
    }

private var _fileMarkedFill: ImageVector? = null
