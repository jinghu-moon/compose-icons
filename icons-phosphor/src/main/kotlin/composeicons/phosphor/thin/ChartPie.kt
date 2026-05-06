package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorThinIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM205.58 78.59 132 121.07v-85c29.992 1.329 57.453 17.198 73.58 42.52ZM124 36.09v89.6L46.42 170.48C31.906 142.596 32.633 109.231 48.349 82.006 64.066 54.782 92.595 37.466 124 36.09ZM128 220C96.562 219.991 67.304 203.93 50.42 177.41L209.58 85.52c14.844 28.516 13.726 62.711-2.947 90.197C189.959 203.202 160.148 219.991 128 220Z"),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
