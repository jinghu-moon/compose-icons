package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorThinIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM219.91 124h-32.06C185.81 94.041 161.959 70.19 132 68.15v-32.06c47.638 2.136 85.774 40.272 87.91 87.91ZM124 124h-47.83C78.169 98.458 98.458 78.169 124 76.17ZM124 132v47.83C98.458 177.831 78.169 157.542 76.17 132ZM132 132h47.83c-1.999 25.542-22.288 45.831-47.83 47.83ZM132 124v-47.83c25.542 1.999 45.831 22.288 47.83 47.83ZM124 36.09v32.06C94.041 70.19 70.19 94.041 68.15 124h-32.06C38.226 76.362 76.362 38.226 124 36.09ZM36.09 132h32.06c2.04 29.959 25.891 53.81 55.85 55.85v32.06C76.362 217.774 38.226 179.638 36.09 132ZM132 219.91v-32.06c29.959-2.04 53.81-25.891 55.85-55.85h32.06c-2.136 47.638-40.272 85.774-87.91 87.91Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
