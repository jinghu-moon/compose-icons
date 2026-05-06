package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarFan: ImageVector
    get() {
        if (_carFan != null) return _carFan!!
        _carFan = tablerFilledIcon(
            name = "CarFan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.363 2.068l4.912 1.914c.905 .352 1.551 1.164 1.692 2.125 .141 .961-.246 1.924-1.012 2.521l-3.045 2.371L21 11c.33-0 .639 .163 .826 .436 .186 .273 .226 .62 .106 .927l-1.914 4.912c-.352 .905-1.164 1.551-2.125 1.692-.961 .141-1.924-.246-2.521-1.012L13 14.908v6.092c0 .33-.163 .639-.436 .826-.273 .186-.62 .226-.927 .106L6.725 20.018C5.82 19.666 5.174 18.854 5.033 17.893c-.141-.961 .246-1.924 1.012-2.521L9.09 13h-6.09c-.33 0-.639-.163-.826-.436-.186-.273-.226-.62-.106-.927L3.982 6.725C4.334 5.82 5.146 5.174 6.107 5.033c.961-.141 1.924 .246 2.521 1.012l2.371 3.044L11 3c-0-.33 .163-.639 .436-.826 .273-.186 .62-.226 .927-.106"),
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
        return _carFan!!
    }

private var _carFan: ImageVector? = null
