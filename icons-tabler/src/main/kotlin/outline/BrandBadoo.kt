package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBadoo: ImageVector
    get() {
        if (_brandBadoo != null) return _brandBadoo!!
        _brandBadoo = tablerOutlineIcon(
            name = "BrandBadoo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 9.430 C 22.000 15.268 17.523 20.000 12.000 20.000 C 6.477 20.000 2.000 15.338 2.000 9.500 C 2.000 6.833 3.830 4.490 6.322 4.071 C 8.814 3.653 11.222 5.463 12.000 8.000 C 12.768 5.460 15.177 3.646 17.668 4.069 C 20.163 4.486 22.000 6.759 22.000 9.429"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.500 10.000 C 7.500 12.761 9.515 15.000 12.000 15.000 C 14.485 15.000 16.500 12.761 16.500 10.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandBadoo!!
    }

private var _brandBadoo: ImageVector? = null
