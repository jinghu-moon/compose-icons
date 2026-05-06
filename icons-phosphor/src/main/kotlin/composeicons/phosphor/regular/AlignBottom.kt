package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) return _alignBottom!!
        _alignBottom = phosphorRegularIcon(
            name = "AlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 216c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM136 176v-96c0-8.837 7.163-16 16-16h40c8.837 0 16 7.163 16 16v96c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16ZM152 176h40v-96h-40ZM48 176v-136C48 31.163 55.163 24 64 24h40c8.837 0 16 7.163 16 16v136c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16ZM64 176h40v-136h-40Z"),
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
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
