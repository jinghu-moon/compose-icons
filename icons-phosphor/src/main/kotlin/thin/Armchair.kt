package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorThinIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 92.230 L 212.000 72.000 C 212.000 52.118 195.882 36.000 176.000 36.000 L 80.000 36.000 C 60.118 36.000 44.000 52.118 44.000 72.000 L 44.000 92.230 C 25.787 94.276 12.019 109.678 12.019 128.005 C 12.019 146.332 25.787 161.734 44.000 163.780 L 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 L 200.000 212.000 C 206.627 212.000 212.000 206.627 212.000 200.000 L 212.000 163.780 C 230.213 161.734 243.981 146.332 243.981 128.005 C 243.981 109.678 230.213 94.276 212.000 92.230 ZM 80.000 44.000 L 176.000 44.000 C 191.464 44.000 204.000 56.536 204.000 72.000 L 204.000 92.230 C 185.782 94.267 172.004 109.668 172.000 128.000 L 172.000 132.000 L 84.000 132.000 L 84.000 128.000 C 83.996 109.668 70.218 94.267 52.000 92.230 L 52.000 72.000 C 52.000 56.536 64.536 44.000 80.000 44.000 ZM 208.300 156.000 L 208.000 156.000 C 205.791 156.000 204.000 157.791 204.000 160.000 L 204.000 200.000 C 204.000 202.209 202.209 204.000 200.000 204.000 L 56.000 204.000 C 53.791 204.000 52.000 202.209 52.000 200.000 L 52.000 160.000 L 52.000 160.000 C 52.000 157.791 50.209 156.000 48.000 156.000 L 47.700 156.000 C 32.276 155.835 19.891 143.226 20.001 127.802 C 20.111 112.378 32.674 99.947 48.099 100.002 C 63.524 100.056 75.999 112.575 76.000 128.000 L 76.000 168.000 C 76.000 170.209 77.791 172.000 80.000 172.000 C 82.209 172.000 84.000 170.209 84.000 168.000 L 84.000 140.000 L 172.000 140.000 L 172.000 168.000 C 172.000 170.209 173.791 172.000 176.000 172.000 C 178.209 172.000 180.000 170.209 180.000 168.000 L 180.000 128.000 C 180.001 112.575 192.476 100.056 207.901 100.002 C 223.326 99.947 235.889 112.378 235.999 127.802 C 236.109 143.226 223.724 155.835 208.300 156.000 Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
