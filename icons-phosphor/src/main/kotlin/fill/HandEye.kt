package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandEye: ImageVector
    get() {
        if (_handEye != null) return _handEye!!
        _handEye = phosphorFillIcon(
            name = "HandEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 180.000 C 144.000 188.837 136.837 196.000 128.000 196.000 C 119.163 196.000 112.000 188.837 112.000 180.000 C 112.000 171.163 119.163 164.000 128.000 164.000 C 136.837 164.000 144.000 171.163 144.000 180.000 ZM 216.000 104.000 L 216.000 152.000 C 216.000 200.601 176.601 240.000 128.000 240.000 C 79.399 240.000 40.000 200.601 40.000 152.000 L 40.000 64.000 C 40.000 55.163 47.163 48.000 56.000 48.000 C 64.837 48.000 72.000 55.163 72.000 64.000 L 72.000 120.000 C 72.000 124.418 75.582 128.000 80.000 128.000 C 84.418 128.000 88.000 124.418 88.000 120.000 L 88.000 32.000 C 88.000 23.163 95.163 16.000 104.000 16.000 C 112.837 16.000 120.000 23.163 120.000 32.000 L 120.000 112.000 C 120.000 116.418 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 116.418 136.000 112.000 L 136.000 48.000 C 136.000 39.163 143.163 32.000 152.000 32.000 C 160.837 32.000 168.000 39.163 168.000 48.000 L 168.000 128.000 C 168.000 132.418 171.582 136.000 176.000 136.000 C 180.418 136.000 184.000 132.418 184.000 128.000 L 184.000 104.000 C 184.000 95.163 191.163 88.000 200.000 88.000 C 208.837 88.000 216.000 95.163 216.000 104.000 ZM 179.580 178.210 C 178.880 176.810 162.080 144.000 128.000 144.000 C 93.920 144.000 77.120 176.810 76.420 178.210 C 75.856 179.337 75.856 180.663 76.420 181.790 C 77.120 183.190 93.920 216.000 128.000 216.000 C 162.080 216.000 178.880 183.190 179.580 181.790 C 180.144 180.663 180.144 179.337 179.580 178.210 Z"),
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
        return _handEye!!
    }

private var _handEye: ImageVector? = null
