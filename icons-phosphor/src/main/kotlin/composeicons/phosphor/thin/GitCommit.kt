package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorThinIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 124h-68.17C177.641 96.999 155.09 76.201 128 76.201 100.91 76.201 78.359 96.999 76.17 124h-68.17c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h68.17c2.189 27.001 24.74 47.799 51.83 47.799 27.09 0 49.641-20.798 51.83-47.799h68.17c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM128 172C103.699 172 84 152.301 84 128c0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
