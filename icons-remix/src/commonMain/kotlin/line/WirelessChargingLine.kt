package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WirelessChargingLine: ImageVector
    get() {
        if (_wirelessChargingLine != null) return _wirelessChargingLine!!
        _wirelessChargingLine = remixIcon(
            name = "WirelessChargingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.929 4.929 L 5.343 6.343 C 3.895 7.791 3.000 9.791 3.000 12.000 C 3.000 14.209 3.895 16.209 5.343 17.657 L 3.929 19.071 C 2.119 17.262 1.000 14.762 1.000 12.000 C 1.000 9.239 2.119 6.739 3.929 4.929 ZM 20.071 4.929 C 21.881 6.739 23.000 9.239 23.000 12.000 C 23.000 14.762 21.881 17.262 20.071 19.071 L 18.657 17.657 C 20.105 16.209 21.000 14.209 21.000 12.000 C 21.000 9.791 20.105 7.792 18.658 6.344 L 20.071 4.929 ZM 13.000 5.000 L 13.000 11.000 L 16.000 11.000 L 11.000 19.000 L 11.000 13.000 L 8.000 13.000 L 13.000 5.000 ZM 6.757 7.757 L 8.172 9.172 C 7.448 9.896 7.000 10.896 7.000 12.000 C 7.000 13.105 7.448 14.105 8.172 14.828 L 6.757 16.243 C 5.672 15.157 5.000 13.657 5.000 12.000 C 5.000 10.343 5.672 8.843 6.757 7.757 ZM 17.244 7.758 C 18.329 8.844 19.000 10.344 19.000 12.000 C 19.000 13.657 18.328 15.157 17.243 16.243 L 15.828 14.828 C 16.552 14.105 17.000 13.105 17.000 12.000 C 17.000 10.896 16.553 9.896 15.829 9.173 L 17.244 7.758 Z"),
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
        return _wirelessChargingLine!!
    }

private var _wirelessChargingLine: ImageVector? = null
