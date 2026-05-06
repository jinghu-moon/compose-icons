package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorBoldIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20h-144C44.954 20 36 28.954 36 40v176c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-176C220 28.954 211.046 20 200 20ZM196 212h-136v-168h136ZM76 80C76 71.163 83.163 64 92 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C83.163 96 76 88.837 76 80ZM76 176c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM76 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
