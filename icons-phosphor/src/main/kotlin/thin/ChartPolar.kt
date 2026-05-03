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
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 219.910 124.000 L 187.850 124.000 C 185.810 94.041 161.959 70.190 132.000 68.150 L 132.000 36.090 C 179.638 38.226 217.774 76.362 219.910 124.000 ZM 124.000 124.000 L 76.170 124.000 C 78.169 98.458 98.458 78.169 124.000 76.170 ZM 124.000 132.000 L 124.000 179.830 C 98.458 177.831 78.169 157.542 76.170 132.000 ZM 132.000 132.000 L 179.830 132.000 C 177.831 157.542 157.542 177.831 132.000 179.830 ZM 132.000 124.000 L 132.000 76.170 C 157.542 78.169 177.831 98.458 179.830 124.000 ZM 124.000 36.090 L 124.000 68.150 C 94.041 70.190 70.190 94.041 68.150 124.000 L 36.090 124.000 C 38.226 76.362 76.362 38.226 124.000 36.090 ZM 36.090 132.000 L 68.150 132.000 C 70.190 161.959 94.041 185.810 124.000 187.850 L 124.000 219.910 C 76.362 217.774 38.226 179.638 36.090 132.000 ZM 132.000 219.910 L 132.000 187.850 C 161.959 185.810 185.810 161.959 187.850 132.000 L 219.910 132.000 C 217.774 179.638 179.638 217.774 132.000 219.910 Z"),
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
