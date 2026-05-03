package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAdonisJs: ImageVector
    get() {
        if (_brandAdonisJs != null) return _brandAdonisJs!!
        _brandAdonisJs = tablerOutlineIcon(
            name = "BrandAdonisJs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 19.200 3.000 21.000 4.800 21.000 12.000 C 21.000 19.200 19.200 21.000 12.000 21.000 C 4.800 21.000 3.000 19.200 3.000 12.000 C 3.000 4.800 4.800 3.000 12.000 3.000"),
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
                pathData = parseSvgPathData("M 8.863 16.922 C 10.000 16.500 10.500 16.000 12.000 16.000 C 13.500 16.000 14.000 16.500 15.138 16.922 C 15.851 17.186 16.654 16.820 16.916 16.150 C 17.042 15.830 17.026 15.477 16.872 15.167 L 13.164 7.693 C 12.867 7.095 12.106 6.834 11.464 7.110 C 11.192 7.224 10.970 7.430 10.837 7.693 L 7.128 15.167 C 6.807 15.815 7.111 16.582 7.807 16.881 C 8.139 17.024 8.522 17.048 8.863 16.921 L 8.863 16.922"),
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
        return _brandAdonisJs!!
    }

private var _brandAdonisJs: ImageVector? = null
