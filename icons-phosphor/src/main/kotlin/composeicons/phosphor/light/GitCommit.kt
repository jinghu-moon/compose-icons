package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorLightIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 122h-66.34C178.581 94.691 155.482 74.05 128 74.05 100.518 74.05 77.419 94.691 74.34 122h-66.34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h66.34c3.079 27.309 26.178 47.95 53.66 47.95 27.482 0 50.581-20.641 53.66-47.95h66.34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM128 170C104.804 170 86 151.196 86 128c0-23.196 18.804-42 42-42 23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
