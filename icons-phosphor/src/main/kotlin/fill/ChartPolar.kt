package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorFillIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 199.540 L 120.000 227.280 C 120.008 228.426 119.524 229.519 118.671 230.284 C 117.818 231.049 116.678 231.412 115.540 231.280 C 68.007 225.468 30.552 188.013 24.740 140.480 C 24.608 139.342 24.971 138.202 25.736 137.349 C 26.501 136.496 27.594 136.012 28.740 136.020 L 56.460 136.020 C 60.250 169.413 86.606 195.760 120.000 199.540 ZM 183.420 136.000 L 136.000 136.000 L 136.000 183.420 C 160.553 179.837 179.837 160.553 183.420 136.000 ZM 136.000 72.580 L 136.000 120.000 L 183.420 120.000 C 179.837 95.447 160.553 76.163 136.000 72.580 ZM 227.280 136.000 L 199.540 136.000 C 195.758 169.401 169.401 195.758 136.000 199.540 L 136.000 227.280 C 135.992 228.426 136.476 229.519 137.329 230.284 C 138.182 231.049 139.322 231.412 140.460 231.280 C 187.993 225.468 225.448 188.013 231.260 140.480 C 231.398 139.342 231.040 138.200 230.279 137.343 C 229.518 136.487 228.426 135.997 227.280 136.000 ZM 199.540 120.000 L 227.280 120.000 C 228.426 120.008 229.519 119.524 230.284 118.671 C 231.049 117.818 231.412 116.678 231.280 115.540 C 225.468 68.007 188.013 30.552 140.480 24.740 C 139.342 24.608 138.202 24.971 137.349 25.736 C 136.496 26.501 136.012 27.594 136.020 28.740 L 136.020 56.460 C 169.413 60.250 195.760 86.606 199.540 120.000 ZM 115.540 24.740 C 68.007 30.552 30.552 68.007 24.740 115.540 C 24.608 116.678 24.971 117.818 25.736 118.671 C 26.501 119.524 27.594 120.008 28.740 120.000 L 56.460 120.000 C 60.242 86.599 86.599 60.242 120.000 56.460 L 120.000 28.720 C 120.002 27.578 119.515 26.489 118.663 25.729 C 117.811 24.969 116.675 24.609 115.540 24.740 ZM 72.580 120.000 L 120.000 120.000 L 120.000 72.580 C 95.447 76.163 76.163 95.447 72.580 120.000 ZM 120.000 183.420 L 120.000 136.000 L 72.580 136.000 C 76.163 160.553 95.447 179.837 120.000 183.420 Z"),
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
