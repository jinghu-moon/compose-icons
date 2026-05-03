package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MoonStars: ImageVector
    get() {
        if (_moonStars != null) return _moonStars!!
        _moonStars = phosphorFillIcon(
            name = "MoonStars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 96.000 C 240.000 100.418 236.418 104.000 232.000 104.000 L 216.000 104.000 L 216.000 120.000 C 216.000 124.418 212.418 128.000 208.000 128.000 C 203.582 128.000 200.000 124.418 200.000 120.000 L 200.000 104.000 L 184.000 104.000 C 179.582 104.000 176.000 100.418 176.000 96.000 C 176.000 91.582 179.582 88.000 184.000 88.000 L 200.000 88.000 L 200.000 72.000 C 200.000 67.582 203.582 64.000 208.000 64.000 C 212.418 64.000 216.000 67.582 216.000 72.000 L 216.000 88.000 L 232.000 88.000 C 236.418 88.000 240.000 91.582 240.000 96.000 ZM 144.000 56.000 L 152.000 56.000 L 152.000 64.000 C 152.000 68.418 155.582 72.000 160.000 72.000 C 164.418 72.000 168.000 68.418 168.000 64.000 L 168.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 52.418 184.000 48.000 C 184.000 43.582 180.418 40.000 176.000 40.000 L 168.000 40.000 L 168.000 32.000 C 168.000 27.582 164.418 24.000 160.000 24.000 C 155.582 24.000 152.000 27.582 152.000 32.000 L 152.000 40.000 L 144.000 40.000 C 139.582 40.000 136.000 43.582 136.000 48.000 C 136.000 52.418 139.582 56.000 144.000 56.000 ZM 209.140 150.330 C 180.323 156.023 150.565 146.975 129.795 126.205 C 109.025 105.435 99.977 75.677 105.670 46.860 C 106.229 44.025 105.216 41.108 103.019 39.231 C 100.822 37.353 97.784 36.806 95.070 37.800 C 53.319 53.067 27.510 95.002 32.693 139.154 C 37.876 183.306 72.694 218.124 116.846 223.307 C 160.998 228.490 202.933 202.681 218.200 160.930 C 219.194 158.216 218.647 155.178 216.769 152.981 C 214.892 150.784 211.975 149.771 209.140 150.330 Z"),
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
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
