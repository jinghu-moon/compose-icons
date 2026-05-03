package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorFillIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 200.000 L 232.000 200.000 L 232.000 144.000 C 232.000 135.163 224.837 128.000 216.000 128.000 L 176.000 128.000 L 176.000 56.000 C 176.000 47.163 168.837 40.000 160.000 40.000 L 96.000 40.000 C 87.163 40.000 80.000 47.163 80.000 56.000 L 80.000 88.000 L 40.000 88.000 C 31.163 88.000 24.000 95.163 24.000 104.000 L 24.000 200.000 L 16.000 200.000 C 11.582 200.000 8.000 203.582 8.000 208.000 C 8.000 212.418 11.582 216.000 16.000 216.000 L 240.000 216.000 C 244.418 216.000 248.000 212.418 248.000 208.000 C 248.000 203.582 244.418 200.000 240.000 200.000 ZM 80.000 200.000 L 40.000 200.000 L 40.000 104.000 L 80.000 104.000 ZM 140.000 136.000 C 140.000 140.418 136.418 144.000 132.000 144.000 C 127.582 144.000 124.000 140.418 124.000 136.000 L 124.000 107.100 L 122.530 107.590 C 118.338 108.987 113.807 106.722 112.410 102.530 C 111.013 98.338 113.278 93.807 117.470 92.410 L 129.470 88.410 C 131.910 87.597 134.592 88.006 136.678 89.510 C 138.764 91.013 140.000 93.428 140.000 96.000 ZM 216.000 200.000 L 176.000 200.000 L 176.000 144.000 L 216.000 144.000 Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
