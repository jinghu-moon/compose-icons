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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 7c1.105 0 2 .895 2 2v.5c0 1.694-2.247 5.49-3.983 6.983L18 16.496v.504c0 1.047-.806 1.917-1.85 1.995L16 19h-8C6.895 19 6 18.105 6 17v-.496l-.065-.053C4.175 14.955 2.141 11.486 2.007 9.681L2 9.5v-.5C2 7.895 2.895 7 4 7Z"),
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
        return _bowl!!
    }

private var _bowl: ImageVector? = null
