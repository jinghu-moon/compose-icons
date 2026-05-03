package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PrinterCloudFill: ImageVector
    get() {
        if (_printerCloudFill != null) return _printerCloudFill!!
        _printerCloudFill = remixIcon(
            name = "PrinterCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 2.000 L 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 6.000 L 6.000 6.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 ZM 22.000 9.000 C 22.000 8.448 21.552 8.000 21.000 8.000 L 3.000 8.000 C 2.448 8.000 2.000 8.448 2.000 9.000 L 2.000 19.000 C 2.000 19.552 2.448 20.000 3.000 20.000 L 5.000 20.000 L 5.000 15.000 L 12.194 15.000 C 12.437 14.109 12.909 13.312 13.611 12.611 C 14.685 11.537 15.981 11.000 17.500 11.000 C 19.019 11.000 20.315 11.537 21.389 12.611 C 21.617 12.839 21.820 13.076 22.000 13.324 L 22.000 9.000 ZM 8.000 10.000 L 8.000 12.000 L 5.000 12.000 L 5.000 10.000 L 8.000 10.000 ZM 21.000 16.500 C 21.000 14.567 19.433 13.000 17.500 13.000 C 15.567 13.000 14.000 14.567 14.000 16.500 L 14.003 16.603 C 12.847 16.928 12.000 17.990 12.000 19.250 C 12.000 20.712 13.142 21.908 14.583 21.995 L 14.750 22.000 L 20.250 22.000 L 20.417 21.995 C 21.858 21.908 23.000 20.712 23.000 19.250 C 23.000 17.990 22.153 16.928 20.999 16.603 L 21.000 16.500 ZM 7.000 17.000 L 10.562 17.000 C 10.187 17.686 10.000 18.436 10.000 19.250 C 10.000 20.282 10.290 21.199 10.872 22.000 L 7.000 22.000 L 7.000 17.000 Z"),
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
        return _printerCloudFill!!
    }

private var _printerCloudFill: ImageVector? = null
