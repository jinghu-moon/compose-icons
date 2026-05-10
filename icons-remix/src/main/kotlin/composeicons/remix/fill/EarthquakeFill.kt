package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EarthquakeFill: ImageVector
    get() {
        if (_earthquakeFill != null) return _earthquakeFill!!
        _earthquakeFill = remixIcon(
            name = "EarthquakeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.327 1.612c.35-.318 .868-.344 1.246-.079l.099 .079L23 11h-3v9c0 .513-.386 .935-.883 .993L19 21h-6.5L15 17 11.5 14l4-3L13 9l.5-3-3 3L13 11 8 14l3.75 3.5L8.5 21h-3.5c-.513 0-.936-.386-.993-.883L4 20v-9h-3L11.327 1.612Z"),
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
        return _earthquakeFill!!
    }

private var _earthquakeFill: ImageVector? = null
