package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCohost: ImageVector
    get() {
        if (_brandCohost != null) return _brandCohost!!
        _brandCohost = tablerOutlineIcon(
            name = "BrandCohost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 14.000 C 14.000 15.105 15.343 16.000 17.000 16.000 C 18.657 16.000 20.000 15.105 20.000 14.000 C 20.000 12.895 18.657 12.000 17.000 12.000 C 15.343 12.000 14.000 12.895 14.000 14.000"),
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
        pathData = parseSvgPathData("M 4.526 17.666 C 3.393 16.894 2.629 15.742 2.235 14.210 C 1.837 12.670 1.945 11.273 2.555 10.020 C 3.165 8.765 4.145 7.680 5.493 6.766 C 6.841 5.852 8.423 5.141 10.242 4.634 C 12.052 4.130 13.758 3.926 15.362 4.024 C 16.970 4.124 18.341 4.561 19.474 5.334 C 20.607 6.107 21.371 7.258 21.765 8.790 C 22.163 10.331 22.055 11.728 21.445 12.982 C 20.835 14.235 19.855 15.319 18.507 16.234 C 17.159 17.149 15.577 17.860 13.758 18.367 C 11.948 18.870 10.242 19.074 8.638 18.977 C 7.030 18.875 5.659 18.439 4.526 17.667"),
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
        pathData = parseSvgPathData("M 11.000 12.508 C 10.470 12.192 9.770 12.000 9.000 12.000 C 7.343 12.000 6.000 12.895 6.000 14.000 C 6.000 15.105 7.343 16.000 9.000 16.000 C 9.767 16.000 10.467 15.808 11.000 15.492"),
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
        return _brandCohost!!
    }

private var _brandCohost: ImageVector? = null
