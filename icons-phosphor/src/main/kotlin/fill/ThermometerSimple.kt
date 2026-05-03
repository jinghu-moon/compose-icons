package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorFillIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 146.080 L 160.000 40.000 C 160.000 22.327 145.673 8.000 128.000 8.000 C 110.327 8.000 96.000 22.327 96.000 40.000 L 96.000 146.080 C 75.920 160.062 67.243 185.461 74.570 208.806 C 81.897 232.151 103.532 248.036 128.000 248.036 C 152.468 248.036 174.103 232.151 181.430 208.806 C 188.757 185.461 180.080 160.062 160.000 146.080 ZM 128.000 24.000 C 136.837 24.000 144.000 31.163 144.000 40.000 L 144.000 104.000 L 112.000 104.000 L 112.000 40.000 C 112.000 31.163 119.163 24.000 128.000 24.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
