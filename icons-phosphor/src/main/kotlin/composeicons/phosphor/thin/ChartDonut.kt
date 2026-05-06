package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartDonut: ImageVector
    get() {
        if (_chartDonut != null) return _chartDonut!!
        _chartDonut = phosphorThinIcon(
            name = "ChartDonut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4 16.294 .001 30.555 10.946 34.771 26.685 4.216 15.739-2.664 32.347-16.775 40.493-14.111 8.146-31.934 5.799-43.455-5.722C91.02 141.934 88.673 124.111 96.82 110c.532-.92 .676-2.014 .4-3.04-.276-1.026-.949-1.901-1.87-2.43l-48.5-28C44.936 75.429 42.492 76.087 41.39 78 18.76 117.196 25.278 166.705 57.281 198.709c32.003 32.004 81.512 38.524 120.709 15.895 39.197-22.628 58.309-68.763 46.597-112.481C212.875 58.405 173.26 28.003 128 28ZM46.38 85.5l41.67 24c-3.744 8.096-4.93 17.142-3.4 25.93L38.18 147.93C33.502 126.803 36.404 104.703 46.38 85.5ZM40.25 155.65 86.71 143.2c5.891 15.916 20.391 27.041 37.29 28.61v48.1C85.367 218.181 51.922 192.518 40.25 155.65ZM132 219.91v-48.1c22.643-2.083 39.969-21.076 39.969-43.815C171.969 105.256 154.643 86.263 132 84.18v-48.09c49.18 2.177 87.932 42.682 87.932 91.91 0 49.228-38.752 89.733-87.932 91.91Z"),
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
        return _chartDonut!!
    }

private var _chartDonut: ImageVector? = null
