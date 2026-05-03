package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BriefcaseMetal: ImageVector
    get() {
        if (_briefcaseMetal != null) return _briefcaseMetal!!
        _briefcaseMetal = phosphorFillIcon(
            name = "BriefcaseMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 28.000 112.000 L 228.000 112.000 C 230.209 112.000 232.000 113.791 232.000 116.000 L 232.000 156.000 C 232.000 158.209 230.209 160.000 228.000 160.000 L 28.000 160.000 C 25.791 160.000 24.000 158.209 24.000 156.000 L 24.000 116.000 C 24.000 113.791 25.791 112.000 28.000 112.000 ZM 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 180.000 C 232.000 177.791 230.209 176.000 228.000 176.000 L 28.000 176.000 C 25.791 176.000 24.000 177.791 24.000 180.000 ZM 232.000 72.000 L 232.000 92.000 C 232.000 94.209 230.209 96.000 228.000 96.000 L 28.000 96.000 C 25.791 96.000 24.000 94.209 24.000 92.000 L 24.000 72.000 C 24.000 63.163 31.163 56.000 40.000 56.000 L 80.000 56.000 L 80.000 48.000 C 80.000 34.745 90.745 24.000 104.000 24.000 L 152.000 24.000 C 165.255 24.000 176.000 34.745 176.000 48.000 L 176.000 56.000 L 216.000 56.000 C 224.837 56.000 232.000 63.163 232.000 72.000 ZM 160.000 48.000 C 160.000 43.582 156.418 40.000 152.000 40.000 L 104.000 40.000 C 99.582 40.000 96.000 43.582 96.000 48.000 L 96.000 56.000 L 160.000 56.000 Z"),
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
        return _briefcaseMetal!!
    }

private var _briefcaseMetal: ImageVector? = null
