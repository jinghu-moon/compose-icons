package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag2: ImageVector
    get() {
        if (_flag2 != null) return _flag2!!
        _flag2 = tablerFilledIcon(
            name = "Flag2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 19.507 4.000 19.934 4.380 19.993 4.883 L 20.000 5.000 L 20.000 14.000 C 20.000 14.507 19.620 14.934 19.117 14.993 L 19.000 15.000 L 6.000 15.000 L 6.000 21.000 C 6.000 21.507 5.620 21.934 5.117 21.993 L 5.000 22.000 C 4.493 22.000 4.066 21.620 4.007 21.117 L 4.000 21.000 L 4.000 5.000 C 4.000 4.493 4.380 4.066 4.883 4.007 L 5.000 4.000 L 19.000 4.000 Z"),
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
        return _flag2!!
    }

private var _flag2: ImageVector? = null
