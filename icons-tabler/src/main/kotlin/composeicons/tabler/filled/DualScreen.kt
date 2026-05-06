package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) return _dualScreen!!
        _dualScreen = tablerFilledIcon(
            name = "DualScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 3c.552 0 1 .448 1 1v15c0 .552-.448 1-1 1h-5v2c-0 .328-.161 .635-.431 .822-.27 .187-.613 .229-.92 .114l-8-3C4.259 19.79 4 19.417 4 19v-15c-0-.223 .075-.44 .212-.616l.068-.079 .078-.072 .066-.05 .092-.058 .065-.033 .1-.04 .099-.028 .046-.01 .108-.013L5 3ZM13.351 6.064c.39 .146 .649 .519 .649 .936v11h4v-13h-7.486Z"),
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
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
