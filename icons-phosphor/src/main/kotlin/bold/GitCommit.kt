package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorBoldIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 116.000 L 186.790 116.000 C 181.092 88.059 156.516 67.989 128.000 67.989 C 99.484 67.989 74.908 88.059 69.210 116.000 L 12.000 116.000 C 5.373 116.000 -0.000 121.373 -0.000 128.000 C -0.000 134.627 5.373 140.000 12.000 140.000 L 69.210 140.000 C 74.908 167.941 99.484 188.011 128.000 188.011 C 156.516 188.011 181.092 167.941 186.790 140.000 L 244.000 140.000 C 250.627 140.000 256.000 134.627 256.000 128.000 C 256.000 121.373 250.627 116.000 244.000 116.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 Z"),
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
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
