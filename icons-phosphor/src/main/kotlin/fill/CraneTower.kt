package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorFillIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 127.730 208.000 L 112.000 208.000 L 112.000 164.000 C 112.000 161.791 110.209 160.000 108.000 160.000 L 44.000 160.000 C 41.791 160.000 40.000 161.791 40.000 164.000 L 40.000 208.000 L 24.270 208.000 C 19.979 207.932 16.367 211.195 16.000 215.470 C 15.853 217.682 16.631 219.856 18.147 221.473 C 19.664 223.090 21.783 224.005 24.000 224.000 L 128.000 224.000 C 130.217 224.005 132.336 223.090 133.853 221.473 C 135.369 219.856 136.147 217.682 136.000 215.470 C 135.633 211.195 132.021 207.932 127.730 208.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 239.730 80.000 L 108.940 80.000 L 87.160 36.420 C 85.803 33.709 83.031 31.998 80.000 32.000 L 48.000 32.000 C 43.582 32.000 40.000 35.582 40.000 40.000 L 40.000 80.000 L 24.270 80.000 C 19.979 79.932 16.367 83.195 16.000 87.470 C 15.853 89.682 16.631 91.856 18.147 93.473 C 19.664 95.090 21.783 96.005 24.000 96.000 L 40.000 96.000 L 40.000 140.000 C 40.000 142.209 41.791 144.000 44.000 144.000 L 108.000 144.000 C 110.209 144.000 112.000 142.209 112.000 140.000 L 112.000 96.000 L 208.000 96.000 L 208.000 184.000 L 192.000 184.000 L 192.000 176.270 C 192.053 171.989 188.795 168.391 184.530 168.020 C 182.318 167.873 180.144 168.651 178.527 170.167 C 176.910 171.684 175.995 173.803 176.000 176.020 L 176.000 184.020 C 176.000 192.857 183.163 200.020 192.000 200.020 L 208.000 200.020 C 216.837 200.020 224.000 192.857 224.000 184.020 L 224.000 96.000 L 240.000 96.000 C 242.217 96.005 244.336 95.090 245.853 93.473 C 247.369 91.856 248.147 89.682 248.000 87.470 C 247.633 83.195 244.021 79.932 239.730 80.000 ZM 56.000 80.000 L 56.000 48.000 L 75.060 48.000 L 91.060 80.000 Z"),
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
