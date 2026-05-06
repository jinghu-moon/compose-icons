package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorLightIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 120C230 63.667 184.333 18 128 18 71.667 18 26 63.667 26 120c.003 1.827 .839 3.554 2.27 4.69l.13 .11L122 195v23h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-23l93.6-70.2h0C229.111 123.667 230 121.889 230 120ZM217.8 114h-43.9C172.6 71.08 157.4 45.38 145.47 31.7c39.919 7.97 69.553 41.689 72.33 82.3ZM128 31.43c6.003 5.039 11.202 10.964 15.42 17.57 13.84 21.08 17.82 46 18.47 65h-67.78C95.17 82.12 104.6 61.14 112.58 49 116.792 42.39 121.992 36.464 128 31.43ZM157.8 126 128 179.65 98.2 126ZM84.47 126l24.62 44.32L50 126ZM171.53 126h34.47l-59.09 44.32ZM110.53 31.7C98.6 45.38 83.4 71.08 82.1 114h-43.9C40.977 73.389 70.611 39.67 110.53 31.7Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
