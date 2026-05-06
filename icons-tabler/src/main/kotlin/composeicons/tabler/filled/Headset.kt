package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerFilledIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c4.971 0 9 4.029 9 9v6c.001 1.331-.876 2.503-2.152 2.879C18.17 21.78 15.31 23 12 23c-.552 0-1-.448-1-1 0-.552 .448-1 1-1 1.889 0 3.482-.482 4.334-1.075C14.969 19.614 14 18.4 14 17l.001-3.051 .004-.051C14.057 12.282 15.383 10.999 17 11h1c.351 0 .688 .06 1 .171v-.171C19.002 7.179 15.94 4.063 12.12 3.998 8.3 3.932 5.133 6.942 5.004 10.76L5 11.17C5.313 11.06 5.65 11 6 11h1c1.657 0 3 1.343 3 3v3c0 1.657-1.343 3-3 3h-1C4.343 20 3 18.657 3 17v-6C3 6.029 7.029 2 12 2"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
