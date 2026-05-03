package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorRegularIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 80.000 L 108.940 80.000 L 87.160 36.420 C 85.803 33.709 83.031 31.998 80.000 32.000 L 48.000 32.000 C 43.582 32.000 40.000 35.582 40.000 40.000 L 40.000 80.000 L 24.000 80.000 C 19.582 80.000 16.000 83.582 16.000 88.000 C 16.000 92.418 19.582 96.000 24.000 96.000 L 40.000 96.000 L 40.000 208.000 L 24.000 208.000 C 19.582 208.000 16.000 211.582 16.000 216.000 C 16.000 220.418 19.582 224.000 24.000 224.000 L 128.000 224.000 C 132.418 224.000 136.000 220.418 136.000 216.000 C 136.000 211.582 132.418 208.000 128.000 208.000 L 112.000 208.000 L 112.000 96.000 L 208.000 96.000 L 208.000 184.000 L 192.000 184.000 L 192.000 176.000 C 192.000 171.582 188.418 168.000 184.000 168.000 C 179.582 168.000 176.000 171.582 176.000 176.000 L 176.000 184.000 C 176.000 192.837 183.163 200.000 192.000 200.000 L 208.000 200.000 C 216.837 200.000 224.000 192.837 224.000 184.000 L 224.000 96.000 L 240.000 96.000 C 244.418 96.000 248.000 92.418 248.000 88.000 C 248.000 83.582 244.418 80.000 240.000 80.000 ZM 56.000 48.000 L 75.060 48.000 L 91.060 80.000 L 56.000 80.000 ZM 56.000 208.000 L 56.000 160.000 L 96.000 160.000 L 96.000 208.000 ZM 96.000 144.000 L 56.000 144.000 L 56.000 96.000 L 96.000 96.000 Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
