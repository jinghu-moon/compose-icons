package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorRegularIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 96.000 L 208.000 96.000 C 208.000 91.582 204.418 88.000 200.000 88.000 L 136.000 88.000 C 131.582 88.000 128.000 91.582 128.000 96.000 L 64.000 96.000 L 64.000 52.000 C 64.000 45.373 69.373 40.000 76.000 40.000 C 81.792 39.976 86.833 43.952 88.160 49.590 C 89.075 53.881 93.275 56.635 97.574 55.763 C 101.874 54.891 104.669 50.718 103.840 46.410 C 101.040 33.288 89.417 23.932 76.000 24.000 C 60.536 24.000 48.000 36.536 48.000 52.000 L 48.000 96.000 L 16.000 96.000 C 11.582 96.000 8.000 99.582 8.000 104.000 L 8.000 144.000 C 8.033 174.914 33.086 199.967 64.000 200.000 L 64.000 216.000 C 64.000 220.418 67.582 224.000 72.000 224.000 C 76.418 224.000 80.000 220.418 80.000 216.000 L 80.000 200.000 L 176.000 200.000 L 176.000 216.000 C 176.000 220.418 179.582 224.000 184.000 224.000 C 188.418 224.000 192.000 220.418 192.000 216.000 L 192.000 200.000 C 222.914 199.967 247.967 174.914 248.000 144.000 L 248.000 104.000 C 248.000 99.582 244.418 96.000 240.000 96.000 ZM 192.000 104.000 L 192.000 136.000 L 144.000 136.000 L 144.000 104.000 ZM 232.000 144.000 C 232.000 166.091 214.091 184.000 192.000 184.000 L 64.000 184.000 C 41.909 184.000 24.000 166.091 24.000 144.000 L 24.000 112.000 L 128.000 112.000 L 128.000 144.000 C 128.000 148.418 131.582 152.000 136.000 152.000 L 200.000 152.000 C 204.418 152.000 208.000 148.418 208.000 144.000 L 208.000 112.000 L 232.000 112.000 Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
