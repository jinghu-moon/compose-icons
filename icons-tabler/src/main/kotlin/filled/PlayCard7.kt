package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard7: ImageVector
    get() {
        if (_playCard7 != null) return _playCard7!!
        _playCard7 = tablerFilledIcon(
            name = "PlayCard7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.448 18.000 16.000 18.448 16.000 19.000 C 16.000 19.552 16.448 20.000 17.000 20.000 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 14.000 8.000 L 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000 L 9.007 9.117 C 9.066 9.620 9.493 10.000 10.000 10.000 L 12.612 10.000 L 11.052 14.684 C 10.930 15.025 11.002 15.406 11.241 15.679 C 11.479 15.952 11.847 16.075 12.201 15.999 C 12.556 15.924 12.842 15.662 12.949 15.316 L 14.949 9.316 C 15.051 9.011 14.999 8.676 14.811 8.415 C 14.623 8.154 14.321 8.000 14.000 8.000M 7.010 4.000 L 7.000 4.000 C 6.448 4.000 6.000 4.448 6.000 5.000 C 6.000 5.552 6.448 6.000 7.000 6.000 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCard7!!
    }

private var _playCard7: ImageVector? = null
