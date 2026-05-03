package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVercel: ImageVector
    get() {
        if (_brandVercel != null) return _brandVercel!!
        _brandVercel = tablerFilledIcon(
            name = "BrandVercel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.143 3.486 C 11.324 3.185 11.649 3.001 12.000 3.001 C 12.351 3.001 12.676 3.185 12.857 3.486 L 21.857 18.486 C 22.042 18.795 22.047 19.179 21.869 19.493 C 21.692 19.806 21.360 20.000 21.000 20.000 L 3.000 20.000 C 2.640 20.000 2.308 19.806 2.131 19.493 C 1.953 19.179 1.958 18.795 2.143 18.486 Z"),
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
        return _brandVercel!!
    }

private var _brandVercel: ImageVector? = null
