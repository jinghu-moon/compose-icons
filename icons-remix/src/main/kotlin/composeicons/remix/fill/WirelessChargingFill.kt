package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WirelessChargingFill: ImageVector
    get() {
        if (_wirelessChargingFill != null) return _wirelessChargingFill!!
        _wirelessChargingFill = remixIcon(
            name = "WirelessChargingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.929 4.929 5.343 6.343C3.895 7.791 3 9.791 3 12c0 2.209 .895 4.209 2.343 5.657L3.929 19.071C2.119 17.261 1 14.762 1 12 1 9.238 2.119 6.738 3.929 4.929ZM20.071 4.929C21.881 6.738 23 9.238 23 12c0 2.762-1.119 5.261-2.929 7.071L18.657 17.657C20.105 16.209 21 14.209 21 12 21 9.791 20.105 7.792 18.658 6.344L20.071 4.929ZM13 5v6h3l-5 8v-6h-3L13 5ZM6.757 7.757 8.172 9.172C7.448 9.895 7 10.895 7 12c0 1.104 .448 2.104 1.172 2.828L6.757 16.243C5.672 15.157 5 13.657 5 12 5 10.343 5.672 8.843 6.757 7.757ZM17.244 7.758C18.329 8.844 19 10.344 19 12c0 1.657-.672 3.157-1.757 4.243L15.828 14.828C16.552 14.104 17 13.104 17 12 17 10.896 16.553 9.896 15.829 9.173L17.244 7.758Z"),
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
        return _wirelessChargingFill!!
    }

private var _wirelessChargingFill: ImageVector? = null
