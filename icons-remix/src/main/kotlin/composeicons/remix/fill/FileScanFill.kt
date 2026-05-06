package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileScanFill: ImageVector
    get() {
        if (_fileScanFill != null) return _fileScanFill!!
        _fileScanFill = remixIcon(
            name = "FileScanFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 20.992c0 .558-.445 1.008-.993 1.008h-16.014C3.445 22 3 21.556 3 21.008v-6.008h18v5.992ZM23 13h-22v-2h22v2ZM21 9h-18v-6.008C3 2.456 3.447 2 3.998 2h10.002l7 7Z"),
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
        return _fileScanFill!!
    }

private var _fileScanFill: ImageVector? = null
