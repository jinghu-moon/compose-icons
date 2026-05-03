package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IrregularPolyhedronOff: ImageVector
    get() {
        if (_irregularPolyhedronOff != null) return _irregularPolyhedronOff!!
        _irregularPolyhedronOff = tablerOutlineIcon(
            name = "IrregularPolyhedronOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.706 4.730 C 4.310 4.960 4.122 5.430 4.248 5.870 L 6.000 12.000 L 4.248 18.130 C 4.106 18.624 4.362 19.145 4.840 19.335 L 11.122 21.838 C 11.687 22.054 12.313 22.054 12.878 21.838 L 19.160 19.335 C 19.200 19.319 19.239 19.300 19.276 19.280M 18.802 14.806 L 18.000 12.000 L 19.752 5.870 C 19.894 5.376 19.638 4.855 19.160 4.665 L 12.878 2.162 C 12.313 1.946 11.687 1.946 11.122 2.162 L 7.578 3.574"),
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
        pathData = parseSvgPathData("M 4.500 5.500 C 5.161 5.714 5.661 5.880 6.000 6.000M 12.000 8.000 C 12.290 7.997 12.603 7.940 12.878 7.830 L 19.500 5.500"),
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
        pathData = parseSvgPathData("M 6.000 12.000 L 11.210 13.862 C 11.721 14.045 12.279 14.045 12.790 13.862 L 13.532 13.597M 16.488 12.540 C 16.800 12.430 17.304 12.249 18.000 12.000"),
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
        pathData = parseSvgPathData("M 12.000 22.000 L 12.000 12.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _irregularPolyhedronOff!!
    }

private var _irregularPolyhedronOff: ImageVector? = null
