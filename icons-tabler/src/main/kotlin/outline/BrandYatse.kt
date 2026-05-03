package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYatse: ImageVector
    get() {
        if (_brandYatse != null) return _brandYatse!!
        _brandYatse = tablerOutlineIcon(
            name = "BrandYatse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 L 12.000 5.876 L 12.000 10.964 L 16.197 8.234 L 21.000 10.965 L 11.719 16.443 L 9.336 17.853 L 7.002 19.230 L 4.002 21.000 L 4.002 15.435 L 7.002 13.664 L 7.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandYatse!!
    }

private var _brandYatse: ImageVector? = null
