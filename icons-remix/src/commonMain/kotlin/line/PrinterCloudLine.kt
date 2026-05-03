package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PrinterCloudLine: ImageVector
    get() {
        if (_printerCloudLine != null) return _printerCloudLine!!
        _printerCloudLine = remixIcon(
            name = "PrinterCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 7.000 L 21.000 7.000 C 21.552 7.000 22.000 7.448 22.000 8.000 L 22.000 13.324 C 21.820 13.076 21.617 12.839 21.389 12.611 C 20.961 12.183 20.498 11.841 20.000 11.583 L 20.000 9.000 L 4.000 9.000 L 4.000 17.000 L 6.000 17.000 L 6.000 16.000 C 6.000 15.448 6.448 15.000 7.000 15.000 L 12.194 15.000 C 12.168 15.093 12.145 15.188 12.125 15.283 C 11.695 15.568 11.314 15.925 10.982 16.357 C 10.823 16.565 10.683 16.779 10.562 17.000 L 8.000 17.000 L 8.000 20.000 L 10.054 20.000 C 10.163 20.732 10.435 21.399 10.872 22.000 L 7.000 22.000 C 6.448 22.000 6.000 21.552 6.000 21.000 L 6.000 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 L 2.000 8.000 C 2.000 7.448 2.448 7.000 3.000 7.000 L 6.000 7.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 L 17.000 2.000 ZM 16.000 4.000 L 8.000 4.000 L 8.000 7.000 L 16.000 7.000 L 16.000 4.000 ZM 8.000 10.000 L 8.000 12.000 L 5.000 12.000 L 5.000 10.000 L 8.000 10.000 ZM 21.000 16.500 C 21.000 14.567 19.433 13.000 17.500 13.000 C 15.567 13.000 14.000 14.567 14.000 16.500 L 14.003 16.603 C 12.847 16.928 12.000 17.990 12.000 19.250 C 12.000 20.712 13.142 21.908 14.583 21.995 L 14.750 22.000 L 20.250 22.000 L 20.417 21.995 C 21.858 21.908 23.000 20.712 23.000 19.250 C 23.000 17.990 22.153 16.928 20.999 16.603 L 21.000 16.500 ZM 16.007 16.355 C 16.080 15.595 16.720 15.000 17.500 15.000 C 18.280 15.000 18.920 15.595 18.993 16.355 L 19.000 16.500 L 19.000 18.120 C 19.696 18.319 20.177 18.454 20.444 18.526 C 20.844 18.633 21.082 19.044 20.974 19.444 C 20.885 19.778 20.585 19.998 20.255 20.000 L 14.745 20.000 C 14.415 19.998 14.115 19.778 14.026 19.444 C 13.918 19.044 14.156 18.633 14.556 18.526 C 14.793 18.462 15.200 18.348 15.776 18.184 L 16.000 18.120 L 16.000 16.500 L 16.007 16.355 Z"),
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
        return _printerCloudLine!!
    }

private var _printerCloudLine: ImageVector? = null
