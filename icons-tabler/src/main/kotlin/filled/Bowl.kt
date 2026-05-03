package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bowl: ImageVector
    get() {
        if (_bowl != null) return _bowl!!
        _bowl = tablerFilledIcon(
            name = "Bowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 7.000 C 21.105 7.000 22.000 7.895 22.000 9.000 L 22.000 9.500 C 22.000 11.194 19.753 14.990 18.017 16.483 L 18.000 16.496 L 18.000 17.000 C 18.000 18.047 17.194 18.917 16.150 18.995 L 16.000 19.000 L 8.000 19.000 C 6.895 19.000 6.000 18.105 6.000 17.000 L 6.000 16.504 L 5.935 16.451 C 4.175 14.955 2.141 11.486 2.007 9.681 L 2.000 9.500 L 2.000 9.000 C 2.000 7.895 2.895 7.000 4.000 7.000 Z"),
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
        return _bowl!!
    }

private var _bowl: ImageVector? = null
