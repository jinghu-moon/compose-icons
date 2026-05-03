package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVivaldi: ImageVector
    get() {
        if (_brandVivaldi != null) return _brandVivaldi!!
        _brandVivaldi = tablerOutlineIcon(
            name = "BrandVivaldi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.648 6.808 C 19.180 11.088 16.711 15.368 14.240 19.644 C 13.843 20.421 12.874 20.945 12.000 21.000 C 11.038 21.102 10.300 20.598 9.846 19.746 C 8.283 17.062 6.740 14.372 5.186 11.682 C 4.243 10.049 3.295 8.416 2.356 6.777 C 1.904 6.029 1.881 5.097 2.296 4.327 C 2.713 3.555 3.504 3.058 4.381 3.020 C 5.332 2.955 6.231 3.458 6.668 4.301 C 7.365 5.491 8.711 8.131 9.218 8.983 C 9.883 10.184 11.128 10.949 12.500 11.000 C 14.626 11.133 16.474 10.050 16.710 7.942 C 16.710 7.778 16.938 4.764 17.556 3.980 C 18.175 3.196 19.196 2.825 20.162 3.087 C 21.126 3.347 21.841 4.160 21.976 5.149 C 22.056 5.730 21.935 6.320 21.633 6.823"),
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
        return _brandVivaldi!!
    }

private var _brandVivaldi: ImageVector? = null
