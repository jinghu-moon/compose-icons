package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorThinIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 180.000 C 177.974 180.000 212.000 145.974 212.000 104.000 C 212.000 62.026 177.974 28.000 136.000 28.000 C 94.026 28.000 60.000 62.026 60.000 104.000 C 60.044 145.955 94.045 179.956 136.000 180.000 ZM 136.000 36.000 C 173.555 36.000 204.000 66.445 204.000 104.000 C 204.000 141.555 173.555 172.000 136.000 172.000 C 98.445 172.000 68.000 141.555 68.000 104.000 C 68.039 66.461 98.461 36.039 136.000 36.000 ZM 210.890 176.280 C 212.415 177.874 212.361 180.402 210.770 181.930 C 191.694 200.326 166.485 211.012 140.000 211.930 L 140.000 236.000 L 168.000 236.000 C 170.209 236.000 172.000 237.791 172.000 240.000 C 172.000 242.209 170.209 244.000 168.000 244.000 L 104.000 244.000 C 101.791 244.000 100.000 242.209 100.000 240.000 C 100.000 237.791 101.791 236.000 104.000 236.000 L 132.000 236.000 L 132.000 211.920 C 89.481 210.345 51.849 183.952 35.887 144.512 C 19.924 105.072 28.606 59.935 58.060 29.230 C 59.044 28.173 60.521 27.728 61.924 28.066 C 63.328 28.404 64.441 29.473 64.836 30.861 C 65.230 32.250 64.846 33.744 63.830 34.770 C 26.062 74.028 26.665 136.294 65.187 174.813 C 103.709 213.332 165.975 213.931 205.230 176.160 C 205.996 175.425 207.023 175.024 208.085 175.046 C 209.147 175.069 210.156 175.513 210.890 176.280 Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
