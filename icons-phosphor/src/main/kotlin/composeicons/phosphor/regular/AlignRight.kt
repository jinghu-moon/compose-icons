package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorRegularIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 40v176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM192 64v40c0 8.837-7.163 16-16 16h-96c-8.837 0-16-7.163-16-16v-40C64 55.163 71.163 48 80 48h96c8.837 0 16 7.163 16 16ZM176 64h-96v40h96ZM192 152v40c0 8.837-7.163 16-16 16h-136c-8.837 0-16-7.163-16-16v-40c0-8.837 7.163-16 16-16h136c8.837 0 16 7.163 16 16ZM176 152h-136v40h136Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
