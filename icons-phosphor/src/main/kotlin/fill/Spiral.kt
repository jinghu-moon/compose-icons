package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorFillIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 144.000 C 248.000 148.418 244.418 152.000 240.000 152.000 C 235.582 152.000 232.000 148.418 232.000 144.000 C 231.939 91.006 188.994 48.061 136.000 48.000 C 134.600 48.000 133.200 48.000 131.820 48.100 C 89.330 50.353 56.025 85.450 56.000 128.000 C 56.039 163.330 84.670 191.961 120.000 192.000 C 144.289 191.972 163.972 172.289 164.000 148.000 C 164.000 130.327 149.673 116.000 132.000 116.000 C 127.582 116.000 124.000 119.582 124.000 124.000 C 124.000 128.418 127.582 132.000 132.000 132.000 C 140.837 132.000 148.000 139.163 148.000 148.000 C 148.000 163.464 135.464 176.000 120.000 176.000 C 93.502 175.972 72.028 154.498 72.000 128.000 C 72.039 92.670 100.670 64.039 136.000 64.000 C 180.162 64.050 215.950 99.838 216.000 144.000 C 215.945 192.578 176.578 231.945 128.000 232.000 C 75.006 231.939 32.061 188.994 32.000 136.000 C 32.061 78.588 78.588 32.061 136.000 32.000 C 197.828 32.066 247.934 82.172 248.000 144.000 Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
