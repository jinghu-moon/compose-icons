package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerOutlineIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.500 5.000 C 18.185 5.002 19.728 5.944 20.498 7.443 C 21.268 8.942 21.137 10.745 20.157 12.116 C 19.178 13.487 17.514 14.196 15.847 13.953 L 11.500 16.962 L 11.500 17.000 C 11.503 18.590 10.264 19.907 8.676 20.000 L 8.500 20.000 C 7.074 20.000 5.844 18.996 5.560 17.598 L 3.000 16.500 L 3.000 13.000 L 6.510 14.755 C 7.281 14.068 8.353 13.828 9.344 14.120 L 12.071 10.302 C 11.833 8.989 12.190 7.639 13.045 6.615 C 13.901 5.591 15.166 5.000 16.500 5.000"),
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
        pathData = parseSvgPathData("M 15.500 9.500 C 15.500 10.052 15.948 10.500 16.500 10.500 C 17.052 10.500 17.500 10.052 17.500 9.500 C 17.500 8.948 17.052 8.500 16.500 8.500 C 15.948 8.500 15.500 8.948 15.500 9.500"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
