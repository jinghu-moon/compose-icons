package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEnvato: ImageVector
    get() {
        if (_brandEnvato != null) return _brandEnvato!!
        _brandEnvato = tablerOutlineIcon(
            name = "BrandEnvato",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.711 17.875 C 4.177 16.536 3.361 13.697 4.840 11.405 C 6.255 9.212 8.609 7.797 9.939 7.127 L 4.710 17.875 L 4.711 17.875"),
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
                pathData = parseSvgPathData("M 19.715 12.508 C 19.175 15.917 17.621 18.664 15.560 19.856 C 11.491 22.209 7.416 20.306 6.263 19.668 C 7.140 18.232 10.696 12.448 13.145 9.077 C 15.859 5.340 19.009 3.099 19.710 3.000 C 19.710 3.201 19.740 3.550 19.781 4.030 C 19.925 5.739 20.224 9.294 19.715 12.508"),
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
        return _brandEnvato!!
    }

private var _brandEnvato: ImageVector? = null
