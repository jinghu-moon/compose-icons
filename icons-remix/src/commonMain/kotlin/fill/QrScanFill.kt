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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 15.000 L 21.000 20.007 C 21.000 20.555 20.555 21.000 20.007 21.000 L 3.993 21.000 C 3.445 21.000 3.000 20.555 3.000 20.007 L 3.000 15.000 L 21.000 15.000 ZM 2.000 11.000 L 22.000 11.000 L 22.000 13.000 L 2.000 13.000 L 2.000 11.000 ZM 21.000 9.000 L 3.000 9.000 L 3.000 3.993 C 3.000 3.445 3.445 3.000 3.993 3.000 L 20.007 3.000 C 20.555 3.000 21.000 3.445 21.000 3.993 L 21.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _qrScanFill!!
    }

private var _qrScanFill: ImageVector? = null
