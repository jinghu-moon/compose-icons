package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorFillIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 224.000 C 224.000 228.418 220.418 232.000 216.000 232.000 L 40.000 232.000 C 35.582 232.000 32.000 228.418 32.000 224.000 C 32.000 219.582 35.582 216.000 40.000 216.000 L 216.000 216.000 C 220.418 216.000 224.000 219.582 224.000 224.000 ZM 208.000 128.000 L 151.570 128.000 L 167.280 54.710 C 169.306 45.262 166.954 35.404 160.881 27.888 C 154.808 20.372 145.663 16.003 136.000 16.000 L 120.000 16.000 C 110.337 16.003 101.192 20.372 95.119 27.888 C 89.046 35.404 86.694 45.262 88.720 54.710 L 104.430 128.000 L 48.000 128.000 C 39.163 128.000 32.000 135.163 32.000 144.000 L 32.000 184.000 C 32.000 192.837 39.163 200.000 48.000 200.000 L 208.000 200.000 C 216.837 200.000 224.000 192.837 224.000 184.000 L 224.000 144.000 C 224.000 135.163 216.837 128.000 208.000 128.000 Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
