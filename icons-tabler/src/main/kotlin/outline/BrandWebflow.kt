package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWebflow: ImageVector
    get() {
        if (_brandWebflow != null) return _brandWebflow!!
        _brandWebflow = tablerOutlineIcon(
            name = "BrandWebflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 10.000 C 17.000 10.000 15.624 13.606 15.500 14.000 C 15.454 13.600 14.000 6.000 14.000 6.000 C 11.373 6.000 10.234 7.562 9.500 9.500 C 9.500 9.500 7.657 14.093 7.500 14.500 C 7.487 14.132 7.000 10.000 7.000 10.000 C 6.850 7.629 4.789 6.020 3.000 6.020 L 5.000 19.000 C 7.745 18.987 9.720 17.438 10.500 15.500 C 10.500 15.500 11.940 11.200 12.000 11.000 C 12.013 11.180 13.000 19.000 13.000 19.000 C 15.758 19.000 17.694 17.374 18.500 15.500 L 22.000 6.000 C 19.268 6.000 17.747 8.055 17.000 10.000"),
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
        return _brandWebflow!!
    }

private var _brandWebflow: ImageVector? = null
