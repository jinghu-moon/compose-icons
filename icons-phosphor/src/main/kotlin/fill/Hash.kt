package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorFillIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.250 112.000 L 147.750 112.000 L 139.750 144.000 L 108.250 144.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 208.000 104.000 C 208.000 99.582 204.418 96.000 200.000 96.000 L 168.250 96.000 L 175.760 65.940 C 176.746 61.688 174.142 57.431 169.907 56.372 C 165.673 55.313 161.371 57.844 160.240 62.060 L 151.750 96.000 L 120.250 96.000 L 127.760 65.940 C 128.746 61.688 126.142 57.431 121.907 56.372 C 117.673 55.313 113.371 57.844 112.240 62.060 L 103.750 96.000 L 64.000 96.000 C 59.582 96.000 56.000 99.582 56.000 104.000 C 56.000 108.418 59.582 112.000 64.000 112.000 L 99.750 112.000 L 91.750 144.000 L 56.000 144.000 C 51.582 144.000 48.000 147.582 48.000 152.000 C 48.000 156.418 51.582 160.000 56.000 160.000 L 87.750 160.000 L 80.240 190.060 C 79.169 194.346 81.775 198.688 86.060 199.760 C 86.714 199.923 87.386 200.003 88.060 200.000 C 91.727 199.995 94.921 197.497 95.810 193.940 L 104.250 160.000 L 135.750 160.000 L 128.240 190.060 C 127.169 194.346 129.775 198.688 134.060 199.760 C 134.695 199.918 135.346 199.998 136.000 200.000 C 139.667 199.995 142.861 197.497 143.750 193.940 L 152.250 160.000 L 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 C 200.000 147.582 196.418 144.000 192.000 144.000 L 156.250 144.000 L 164.250 112.000 L 200.000 112.000 C 204.418 112.000 208.000 108.418 208.000 104.000 Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
