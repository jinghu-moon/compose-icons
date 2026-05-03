package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorRegularIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 120.000 L 183.420 120.000 C 179.426 92.465 155.823 72.039 128.000 72.039 C 100.177 72.039 76.574 92.465 72.580 120.000 L 8.000 120.000 C 3.582 120.000 0.000 123.582 0.000 128.000 C 0.000 132.418 3.582 136.000 8.000 136.000 L 72.580 136.000 C 76.574 163.535 100.177 183.961 128.000 183.961 C 155.823 183.961 179.426 163.535 183.420 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 Z"),
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
