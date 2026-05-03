package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorLightIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 42.000 C 106.245 41.986 86.607 55.028 78.181 75.085 C 69.755 95.141 74.187 118.296 89.424 133.823 C 104.662 149.350 127.728 154.217 147.940 146.170 L 114.770 205.050 C 113.144 207.938 114.167 211.599 117.055 213.225 C 119.943 214.851 123.604 213.828 125.230 210.940 L 174.770 122.940 C 184.386 106.235 184.369 85.672 174.726 68.983 C 165.082 52.294 147.275 42.011 128.000 42.000 ZM 128.000 138.000 C 104.804 138.000 86.000 119.196 86.000 96.000 C 86.000 72.804 104.804 54.000 128.000 54.000 C 151.196 54.000 170.000 72.804 170.000 96.000 C 170.000 119.196 151.196 138.000 128.000 138.000 Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
