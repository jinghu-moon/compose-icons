package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = tablerFilledIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.67C10.981 1.67 10.036 2.202 9.508 3.073L1.398 16.61c-.524 .896-.532 2.004-.02 2.907 .512 .904 1.466 1.466 2.504 1.478h16.225c1.037-.007 1.993-.566 2.508-1.466 .516-.9 .514-2.007-.005-2.905L14.494 3.078C13.966 2.205 13.02 1.671 12 1.67Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
