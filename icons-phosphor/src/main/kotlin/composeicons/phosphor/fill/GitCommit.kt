package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorFillIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 128c0 4.418-3.582 8-8 8h-64.58c-3.994 27.535-27.597 47.961-55.42 47.961C100.177 183.961 76.574 163.535 72.58 136h-64.58C3.582 136 0 132.418 0 128c0-4.418 3.582-8 8-8h64.58C76.574 92.465 100.177 72.039 128 72.039c27.823 0 51.426 20.427 55.42 47.961h64.58c4.418 0 8 3.582 8 8Z"),
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
