package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorDuotoneIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 128c0 26.51-21.49 48-48 48C101.49 176 80 154.51 80 128c0-26.51 21.49-48 48-48 26.51 0 48 21.49 48 48Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M248 120h-64.58C179.426 92.465 155.823 72.039 128 72.039 100.177 72.039 76.574 92.465 72.58 120h-64.58c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64.58c3.994 27.535 27.597 47.961 55.42 47.961 27.823 0 51.426-20.427 55.42-47.961h64.58c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
