package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBandlab: ImageVector
    get() {
        if (_brandBandlab != null) return _brandBandlab!!
        _brandBandlab = tablerOutlineIcon(
            name = "BrandBandlab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.885 7.000 L 4.349 11.907 C 2.328 15.752 1.850 20.682 8.170 21.000 L 14.978 21.000 C 19.838 20.793 22.967 18.025 19.585 11.907 L 16.597 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 15.078 4.000 L 9.942 4.000 L 13.620 12.768 C 14.167 13.908 14.467 14.590 13.782 15.444 C 13.729 15.537 12.450 17.351 10.729 16.939 C 9.904 16.752 9.345 16.013 9.409 15.199 C 9.449 14.289 10.029 13.482 10.897 13.125 C 11.744 12.722 12.697 12.597 13.620 12.767"),
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
        return _brandBandlab!!
    }

private var _brandBandlab: ImageVector? = null
