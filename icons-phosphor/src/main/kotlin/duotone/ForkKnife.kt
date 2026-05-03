package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorDuotoneIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 208.000 168.000 L 152.000 168.000 C 152.000 168.000 152.000 64.000 208.000 40.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 72.000 88.000 L 72.000 40.000 C 72.000 35.582 75.582 32.000 80.000 32.000 C 84.418 32.000 88.000 35.582 88.000 40.000 L 88.000 88.000 C 88.000 92.418 84.418 96.000 80.000 96.000 C 75.582 96.000 72.000 92.418 72.000 88.000 ZM 216.000 40.000 L 216.000 224.000 C 216.000 228.418 212.418 232.000 208.000 232.000 C 203.582 232.000 200.000 228.418 200.000 224.000 L 200.000 176.000 L 152.000 176.000 C 147.582 176.000 144.000 172.418 144.000 168.000 C 144.371 148.837 146.792 129.768 151.220 111.120 C 161.000 70.630 179.540 43.490 204.850 32.650 C 207.321 31.592 210.159 31.845 212.403 33.324 C 214.647 34.804 215.999 37.312 216.000 40.000 ZM 200.000 53.900 C 167.830 78.470 161.530 138.320 160.300 160.000 L 200.000 160.000 ZM 119.890 38.690 C 119.464 35.831 117.528 33.424 114.827 32.395 C 112.126 31.365 109.079 31.873 106.858 33.723 C 104.637 35.573 103.586 38.477 104.110 41.320 L 112.000 88.630 C 112.000 106.303 97.673 120.630 80.000 120.630 C 62.327 120.630 48.000 106.303 48.000 88.630 L 55.880 41.320 C 56.404 38.477 55.353 35.573 53.132 33.723 C 50.911 31.873 47.864 31.365 45.163 32.395 C 42.462 33.424 40.526 35.831 40.100 38.690 L 32.100 86.690 C 32.032 87.123 31.998 87.561 32.000 88.000 C 32.033 111.409 48.923 131.390 72.000 135.320 L 72.000 224.000 C 72.000 228.418 75.582 232.000 80.000 232.000 C 84.418 232.000 88.000 228.418 88.000 224.000 L 88.000 135.320 C 111.077 131.390 127.967 111.409 128.000 88.000 C 127.999 87.561 127.962 87.123 127.890 86.690 Z"),
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
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
