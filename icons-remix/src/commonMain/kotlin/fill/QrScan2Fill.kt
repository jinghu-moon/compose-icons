package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QrScan2Fill: ImageVector
    get() {
        if (_qrScan2Fill != null) return _qrScan2Fill!!
        _qrScan2Fill = remixIcon(
            name = "QrScan2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 3.000 L 21.000 3.000 L 21.000 9.000 L 15.000 9.000 L 15.000 3.000 ZM 9.000 3.000 L 9.000 9.000 L 3.000 9.000 L 3.000 3.000 L 9.000 3.000 ZM 15.000 21.000 L 15.000 15.000 L 21.000 15.000 L 21.000 21.000 L 15.000 21.000 ZM 9.000 21.000 L 3.000 21.000 L 3.000 15.000 L 9.000 15.000 L 9.000 21.000 ZM 3.000 11.000 L 21.000 11.000 L 21.000 13.000 L 3.000 13.000 L 3.000 11.000 Z"),
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
        return _qrScan2Fill!!
    }

private var _qrScan2Fill: ImageVector? = null
