package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorFillIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 72.000 144.000 C 72.000 147.216 70.073 150.120 67.110 151.370 C 66.127 151.789 65.069 152.004 64.000 152.000 L 52.000 152.000 C 47.582 152.000 44.000 148.418 44.000 144.000 C 44.000 139.582 47.582 136.000 52.000 136.000 L 56.000 136.000 L 56.000 88.000 L 52.000 88.000 C 47.582 88.000 44.000 84.418 44.000 80.000 C 44.000 75.582 47.582 72.000 52.000 72.000 L 64.000 72.000 C 66.852 72.006 69.484 73.530 70.910 76.000 L 92.000 112.120 L 113.090 76.000 C 114.516 73.530 117.148 72.006 120.000 72.000 L 132.000 72.000 C 136.418 72.000 140.000 75.582 140.000 80.000 C 140.000 84.418 136.418 88.000 132.000 88.000 L 128.000 88.000 L 128.000 136.000 L 132.000 136.000 C 136.418 136.000 140.000 139.582 140.000 144.000 C 140.000 148.418 136.418 152.000 132.000 152.000 L 120.000 152.000 C 118.931 152.004 117.873 151.789 116.890 151.370 C 113.927 150.120 112.000 147.216 112.000 144.000 L 112.000 109.590 L 98.910 132.000 C 97.476 134.458 94.845 135.969 92.000 135.969 C 89.155 135.969 86.524 134.458 85.090 132.000 L 72.000 109.590 ZM 200.000 184.000 L 88.000 184.000 C 83.582 184.000 80.000 180.418 80.000 176.000 C 80.000 171.582 83.582 168.000 88.000 168.000 L 200.000 168.000 C 204.418 168.000 208.000 171.582 208.000 176.000 C 208.000 180.418 204.418 184.000 200.000 184.000 ZM 200.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 148.418 152.000 144.000 C 152.000 139.582 155.582 136.000 160.000 136.000 L 200.000 136.000 C 204.418 136.000 208.000 139.582 208.000 144.000 C 208.000 148.418 204.418 152.000 200.000 152.000 ZM 200.000 120.000 L 160.000 120.000 C 155.582 120.000 152.000 116.418 152.000 112.000 C 152.000 107.582 155.582 104.000 160.000 104.000 L 200.000 104.000 C 204.418 104.000 208.000 107.582 208.000 112.000 C 208.000 116.418 204.418 120.000 200.000 120.000 Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
