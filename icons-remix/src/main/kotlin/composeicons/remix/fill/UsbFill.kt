package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UsbFill: ImageVector
    get() {
        if (_usbFill != null) return _usbFill!!
        _usbFill = remixIcon(
            name = "UsbFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1l3 5h-2v7.381l3-1.499L15.999 11h-.999v-4h4v4h-1.001L18 13.118l-5 2.5 .001 1.553C14.166 17.583 15 18.694 15 20c0 1.657-1.343 3-3 3C10.343 23 9 21.657 9 20c0-1.187 .689-2.213 1.689-2.699L6 14 5.999 11.732C5.402 11.386 5 10.74 5 10 5 8.895 5.895 8 7 8c1.105 0 2 .895 2 2 0 .74-.402 1.387-1 1.732L8 13l3 2.086v-9.086h-2L12 1Z"),
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
        return _usbFill!!
    }

private var _usbFill: ImageVector? = null
