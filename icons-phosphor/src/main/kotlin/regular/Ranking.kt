package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorRegularIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.410 102.530 C 111.739 100.517 111.895 98.320 112.844 96.422 C 113.793 94.524 115.457 93.081 117.470 92.410 L 129.470 88.410 C 131.910 87.597 134.592 88.006 136.678 89.510 C 138.764 91.013 140.000 93.428 140.000 96.000 L 140.000 136.000 C 140.000 140.418 136.418 144.000 132.000 144.000 C 127.582 144.000 124.000 140.418 124.000 136.000 L 124.000 107.100 L 122.530 107.590 C 120.517 108.261 118.320 108.105 116.422 107.156 C 114.524 106.207 113.081 104.543 112.410 102.530 ZM 248.000 208.000 C 248.000 212.418 244.418 216.000 240.000 216.000 L 16.000 216.000 C 11.582 216.000 8.000 212.418 8.000 208.000 C 8.000 203.582 11.582 200.000 16.000 200.000 L 24.000 200.000 L 24.000 104.000 C 24.000 95.163 31.163 88.000 40.000 88.000 L 80.000 88.000 L 80.000 56.000 C 80.000 47.163 87.163 40.000 96.000 40.000 L 160.000 40.000 C 168.837 40.000 176.000 47.163 176.000 56.000 L 176.000 128.000 L 216.000 128.000 C 224.837 128.000 232.000 135.163 232.000 144.000 L 232.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 203.582 248.000 208.000 ZM 176.000 144.000 L 176.000 200.000 L 216.000 200.000 L 216.000 144.000 ZM 96.000 200.000 L 160.000 200.000 L 160.000 56.000 L 96.000 56.000 ZM 40.000 200.000 L 80.000 200.000 L 80.000 104.000 L 40.000 104.000 Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
