package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.QrCodeFill: ImageVector
    get() {
        if (_qrCodeFill != null) return _qrCodeFill!!
        _qrCodeFill = remixIcon(
            name = "QrCodeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 17.000 L 16.000 16.000 L 13.000 16.000 L 13.000 13.000 L 16.000 13.000 L 16.000 15.000 L 18.000 15.000 L 18.000 17.000 L 17.000 17.000 L 17.000 19.000 L 15.000 19.000 L 15.000 21.000 L 13.000 21.000 L 13.000 18.000 L 15.000 18.000 L 15.000 17.000 L 16.000 17.000 ZM 21.000 21.000 L 17.000 21.000 L 17.000 19.000 L 19.000 19.000 L 19.000 17.000 L 21.000 17.000 L 21.000 21.000 ZM 3.000 3.000 L 11.000 3.000 L 11.000 11.000 L 3.000 11.000 L 3.000 3.000 ZM 13.000 3.000 L 21.000 3.000 L 21.000 11.000 L 13.000 11.000 L 13.000 3.000 ZM 3.000 13.000 L 11.000 13.000 L 11.000 21.000 L 3.000 21.000 L 3.000 13.000 ZM 18.000 13.000 L 21.000 13.000 L 21.000 15.000 L 18.000 15.000 L 18.000 13.000 ZM 6.000 6.000 L 6.000 8.000 L 8.000 8.000 L 8.000 6.000 L 6.000 6.000 ZM 6.000 16.000 L 6.000 18.000 L 8.000 18.000 L 8.000 16.000 L 6.000 16.000 ZM 16.000 6.000 L 16.000 8.000 L 18.000 8.000 L 18.000 6.000 L 16.000 6.000 Z"),
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
        return _qrCodeFill!!
    }

private var _qrCodeFill: ImageVector? = null
