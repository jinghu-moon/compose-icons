package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerFilledIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 C 17.520 1.000 22.000 2.494 22.000 5.002 L 22.000 5.502 C 22.000 5.669 21.958 5.833 21.879 5.979 L 13.740 20.985 C 13.383 21.614 12.714 22.002 11.991 21.999 C 11.267 21.996 10.602 21.602 10.251 20.969 L 2.121 5.979 C 2.042 5.833 2.000 5.670 2.000 5.504 L 2.000 5.004 C 2.000 2.495 6.480 1.000 12.000 1.000"),
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
        return _cone2!!
    }

private var _cone2: ImageVector? = null
