package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZalando: ImageVector
    get() {
        if (_brandZalando != null) return _brandZalando!!
        _brandZalando = tablerOutlineIcon(
            name = "BrandZalando",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.531 21.000 C 6.881 21.000 6.531 20.850 6.335 20.730 C 6.069 20.573 5.582 20.167 5.138 18.983 C 4.359 16.738 3.974 14.376 4.001 12.000 C 4.016 9.255 4.437 6.930 5.138 5.025 C 5.582 3.825 6.068 3.420 6.335 3.262 C 6.527 3.159 6.880 3.000 7.530 3.000 C 7.774 3.000 8.062 3.022 8.401 3.075 C 10.675 3.504 12.852 4.342 14.826 5.550 L 14.833 5.550 C 16.850 6.725 18.641 8.252 20.120 10.058 C 20.903 11.048 20.999 11.685 20.999 12.000 C 20.999 12.315 20.903 12.953 20.120 13.943 C 18.640 15.746 16.849 17.270 14.833 18.443 L 14.826 18.443 C 12.852 19.651 10.675 20.490 8.401 20.917 C 8.114 20.970 7.822 20.998 7.530 21.000"),
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
        return _brandZalando!!
    }

private var _brandZalando: ImageVector? = null
