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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 116h-57.21C181.092 88.059 156.516 67.989 128 67.989 99.484 67.989 74.908 88.059 69.21 116h-57.21c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h57.21c5.698 27.941 30.274 48.011 58.79 48.011 28.516 0 53.092-20.07 58.79-48.011h57.21c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
