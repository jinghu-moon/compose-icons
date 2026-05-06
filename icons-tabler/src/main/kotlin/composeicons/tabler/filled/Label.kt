package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Label: ImageVector
    get() {
        if (_label != null) return _label!!
        _label = tablerFilledIcon(
            name = "Label",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.52 6c.607 0 1.181 .276 1.561 .75l3.7 4.625c.292 .365 .292 .885 0 1.25l-3.7 4.624c-.379 .474-.954 .751-1.561 .751h-10.52C4.343 18 3 16.657 3 15v-6C3 7.343 4.343 6 6 6Z"),
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
        return _label!!
    }

private var _label: ImageVector? = null
