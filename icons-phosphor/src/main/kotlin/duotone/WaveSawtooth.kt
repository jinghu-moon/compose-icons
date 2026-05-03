package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) return _waveSawtooth!!
        _waveSawtooth = phosphorDuotoneIcon(
            name = "WaveSawtooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 128.000 64.000 L 128.000 128.000 L 24.000 128.000 ZM 232.000 128.000 L 128.000 128.000 L 128.000 192.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 236.190 134.810 L 132.190 198.810 C 129.722 200.327 126.627 200.392 124.098 198.979 C 121.569 197.566 120.002 194.897 120.000 192.000 L 120.000 78.320 L 28.190 134.810 C 24.442 136.951 19.670 135.732 17.408 132.056 C 15.146 128.379 16.209 123.571 19.810 121.190 L 123.810 57.190 C 126.278 55.673 129.373 55.608 131.902 57.021 C 134.431 58.434 135.998 61.103 136.000 64.000 L 136.000 177.680 L 227.810 121.190 C 231.558 119.049 236.330 120.268 238.592 123.944 C 240.854 127.621 239.791 132.429 236.190 134.810 Z"),
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
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null
