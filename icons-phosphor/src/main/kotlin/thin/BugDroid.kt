package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorThinIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.170 51.490 L 202.830 34.830 C 204.393 33.267 204.393 30.733 202.830 29.170 C 201.267 27.607 198.733 27.607 197.170 29.170 L 180.170 46.170 C 149.658 21.889 106.422 21.889 75.910 46.170 L 58.910 29.170 C 57.347 27.607 54.813 27.607 53.250 29.170 C 51.687 30.733 51.687 33.267 53.250 34.830 L 69.830 51.490 C 53.326 67.292 43.995 89.151 44.000 112.000 L 44.000 152.000 C 44.000 198.392 81.608 236.000 128.000 236.000 C 174.392 236.000 212.000 198.392 212.000 152.000 L 212.000 112.000 C 212.005 89.151 202.674 67.292 186.170 51.490 ZM 128.000 36.000 C 169.955 36.044 203.956 70.045 204.000 112.000 L 204.000 124.000 L 52.000 124.000 L 52.000 112.000 C 52.044 70.045 86.045 36.044 128.000 36.000 ZM 128.000 228.000 C 86.045 227.956 52.044 193.955 52.000 152.000 L 52.000 132.000 L 204.000 132.000 L 204.000 152.000 C 203.956 193.955 169.955 227.956 128.000 228.000 ZM 148.000 92.000 C 148.000 87.582 151.582 84.000 156.000 84.000 C 160.418 84.000 164.000 87.582 164.000 92.000 C 164.000 96.418 160.418 100.000 156.000 100.000 C 151.582 100.000 148.000 96.418 148.000 92.000 ZM 92.000 92.000 C 92.000 87.582 95.582 84.000 100.000 84.000 C 104.418 84.000 108.000 87.582 108.000 92.000 C 108.000 96.418 104.418 100.000 100.000 100.000 C 95.582 100.000 92.000 96.418 92.000 92.000 Z"),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
