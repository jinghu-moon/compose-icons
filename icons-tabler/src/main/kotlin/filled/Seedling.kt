package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Seedling: ImageVector
    get() {
        if (_seedling != null) return _seedling!!
        _seedling = tablerFilledIcon(
            name = "Seedling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 3.000 C 9.540 2.999 12.523 5.641 12.950 9.155 C 14.268 7.776 16.093 6.997 18.000 7.000 L 21.000 7.000 C 21.552 7.000 22.000 7.448 22.000 8.000 L 22.000 9.000 C 22.000 12.866 18.866 16.000 15.000 16.000 L 13.000 16.000 L 13.000 20.000 C 13.000 20.552 12.552 21.000 12.000 21.000 C 11.448 21.000 11.000 20.552 11.000 20.000 L 11.000 13.000 L 9.000 13.000 C 5.134 13.000 2.000 9.866 2.000 6.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 Z"),
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
        return _seedling!!
    }

private var _seedling: ImageVector? = null
