package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileScanLine: ImageVector
    get() {
        if (_fileScanLine != null) return _fileScanLine!!
        _fileScanLine = remixIcon(
            name = "FileScanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 20h14v-5h2v5.993c0 .557-.445 1.007-.993 1.007h-16.014C3.445 22 3 21.556 3 21.008v-6.008h2v5ZM23 13h-22v-2h22v2ZM21 8v1h-2L14 4h-9v5h-2v-6.008C3 2.456 3.449 2 4.002 2h10.995L21 8Z"),
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
        return _fileScanLine!!
    }

private var _fileScanLine: ImageVector? = null
