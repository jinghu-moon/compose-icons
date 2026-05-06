package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QrScanFill: ImageVector
    get() {
        if (_qrScanFill != null) return _qrScanFill!!
        _qrScanFill = remixIcon(
            name = "QrScanFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 15v5.007c0 .549-.445 .993-.993 .993h-16.013C3.445 21 3 20.555 3 20.007v-5.007h18ZM2 11h20v2h-20v-2ZM21 9h-18v-5.007C3 3.445 3.445 3 3.993 3h16.013c.549 0 .993 .445 .993 .993v5.007Z"),
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
        return _qrScanFill!!
    }

private var _qrScanFill: ImageVector? = null
