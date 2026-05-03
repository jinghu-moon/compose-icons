package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirefox: ImageVector
    get() {
        if (_brandFirefox != null) return _brandFirefox!!
        _brandFirefox = tablerOutlineIcon(
            name = "BrandFirefox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.028 7.820 C 1.766 12.133 3.345 17.462 7.591 19.847 C 11.836 22.231 17.209 20.807 19.715 16.632 C 22.221 12.457 20.952 7.045 16.851 4.420 C 15.215 3.400 13.787 3.400 12.000 3.400 L 10.353 3.400"),
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
        pathData = parseSvgPathData("M 4.914 9.485 C 3.158 7.916 4.109 4.105 5.023 3.315 C 5.109 4.211 5.608 4.523 6.134 5.000 C 7.014 4.725 7.447 4.718 8.001 5.000 C 8.821 4.090 9.695 2.646 10.629 2.907 C 9.547 4.648 10.559 6.640 12.000 7.080 C 11.830 8.055 10.516 8.993 9.240 9.766 C 7.944 10.704 8.518 11.616 9.240 12.000 C 10.189 12.506 12.851 11.000 13.785 12.354 C 12.087 12.456 12.249 15.461 9.802 15.081 C 12.325 16.038 14.147 15.543 15.260 14.741 C 17.225 13.221 18.139 11.199 18.139 9.184 C 18.125 7.786 18.333 6.489 16.879 4.434"),
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
        return _brandFirefox!!
    }

private var _brandFirefox: ImageVector? = null
