package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerFilledIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.500 4.000 C 18.499 4.005 20.338 5.093 21.303 6.843 C 22.269 8.594 22.209 10.730 21.146 12.423 C 20.084 14.116 18.187 15.100 16.191 14.992 L 16.113 14.985 L 12.467 17.509 L 12.456 17.603 C 12.189 19.378 10.749 20.783 8.885 20.983 L 8.676 21.000 L 8.500 21.000 C 6.822 21.000 5.322 19.953 4.744 18.377 L 4.728 18.329 L 2.606 17.419 C 2.278 17.278 2.050 16.973 2.007 16.619 L 2.000 16.500 L 2.000 13.000 C 2.000 12.654 2.180 12.332 2.474 12.150 C 2.769 11.968 3.137 11.951 3.447 12.106 L 6.411 13.587 L 6.585 13.487 C 7.242 13.128 7.987 12.961 8.735 13.005 L 8.901 13.019 L 11.027 10.042 L 11.017 9.944 C 10.908 8.600 11.297 7.262 12.109 6.186 L 12.278 5.974 C 13.323 4.723 14.870 4.000 16.500 4.000M 16.500 7.500 C 15.395 7.500 14.500 8.395 14.500 9.500 C 14.500 10.605 15.395 11.500 16.500 11.500 C 17.605 11.500 18.500 10.605 18.500 9.500 C 18.500 8.395 17.605 7.500 16.500 7.500"),
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
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
