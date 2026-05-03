package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GlobeSimple: ImageVector
    get() {
        if (_globeSimple != null) return _globeSimple!!
        _globeSimple = phosphorLightIcon(
            name = "GlobeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 217.800 122.000 L 173.890 122.000 C 172.350 81.230 155.410 53.770 143.460 39.330 C 184.298 46.521 214.971 80.630 217.800 122.000 ZM 128.000 215.830 C 122.223 209.937 117.128 203.413 112.810 196.380 C 101.325 177.538 94.892 156.053 94.130 134.000 L 161.870 134.000 C 161.108 156.053 154.675 177.538 143.190 196.380 C 138.872 203.413 133.777 209.937 128.000 215.830 ZM 94.130 122.000 C 94.892 99.947 101.325 78.462 112.810 59.620 C 117.128 52.587 122.223 46.063 128.000 40.170 C 133.777 46.063 138.872 52.587 143.190 59.620 C 154.675 78.462 161.108 99.947 161.870 122.000 ZM 112.540 39.330 C 100.540 53.770 83.650 81.230 82.110 122.000 L 38.200 122.000 C 41.029 80.630 71.702 46.521 112.540 39.330 ZM 38.200 134.000 L 82.110 134.000 C 83.650 174.770 100.590 202.230 112.540 216.670 C 71.702 209.479 41.029 175.370 38.200 134.000 ZM 143.460 216.670 C 155.410 202.230 172.350 174.770 173.890 134.000 L 217.800 134.000 C 214.971 175.370 184.298 209.479 143.460 216.670 Z"),
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
        return _globeSimple!!
    }

private var _globeSimple: ImageVector? = null
