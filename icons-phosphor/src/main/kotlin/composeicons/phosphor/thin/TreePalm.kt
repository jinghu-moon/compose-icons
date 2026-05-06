package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorThinIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.9 56C223.009 43.233 206.347 35.981 188.9 35.981c-17.447 0-34.109 7.251-46 20.019C136.259 63 131.181 71.331 128 80.44 124.791 71.318 119.678 62.984 113 55.99 101.11 43.256 84.469 36.028 67.048 36.03 49.626 36.032 32.987 43.264 21.1 56c-.898 .946-1.279 2.27-1.02 3.548 .259 1.278 1.125 2.35 2.32 2.872L90.86 92.2c-4.206 .319-8.374 1.026-12.45 2.11C61.007 98.875 46.146 110.2 37.13 125.77 28.073 141.24 25.623 159.703 30.33 177c.345 1.288 1.309 2.319 2.57 2.75 .416 .139 .852 .209 1.29 .21 .878 .001 1.732-.287 2.43-.82L124 112.6v111.4c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-111.4l87.38 66.58c.698 .533 1.552 .821 2.43 .82 .438-.001 .874-.071 1.29-.21 1.261-.431 2.225-1.462 2.57-2.75 4.719-17.309 2.268-35.789-6.8-51.27C209.854 110.2 194.993 98.875 177.59 94.31c-4.076-1.084-8.244-1.791-12.45-2.11L233.6 62.41c1.191-.523 2.054-1.593 2.313-2.868 .259-1.275-.119-2.596-1.013-3.542ZM67.08 44c15.236 .03 29.78 6.365 40.18 17.5 9.392 9.904 15.182 22.679 16.44 36.27L31.12 57.48C41.086 48.792 53.859 44.004 67.08 44ZM36.77 169C34.533 155.487 37.091 141.617 44 129.79 51.962 116.032 65.092 106.026 80.47 102c5.102-1.34 10.355-2.012 15.63-2 8.414 .001 16.732 1.78 24.41 5.22ZM212 129.79c6.909 11.827 9.467 25.697 7.23 39.21L135.49 105.2c28.043-12.498 60.999-1.906 76.51 24.59ZM132.34 97.79c1.242-13.594 7.018-26.375 16.4-36.29 20.141-21.665 53.84-23.435 76.14-4Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
