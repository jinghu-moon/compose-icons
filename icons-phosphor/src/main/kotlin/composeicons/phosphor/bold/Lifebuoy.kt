package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorBoldIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM172.25 155.28c10.333-16.719 10.333-37.841 0-54.56l23-23c22.333 29.8 22.333 70.76 0 100.56ZM100 128c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM178.28 60.75l-23 23c-16.719-10.333-37.841-10.333-54.56 0l-23-23c29.8-22.333 70.76-22.333 100.56 0ZM60.75 77.75l23 23c-10.333 16.719-10.333 37.841 0 54.56l-23 23C38.417 148.51 38.417 107.55 60.75 77.75ZM77.75 195.28l23-23c16.719 10.333 37.841 10.333 54.56 0l23 23c-29.8 22.333-70.76 22.333-100.56 0Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
