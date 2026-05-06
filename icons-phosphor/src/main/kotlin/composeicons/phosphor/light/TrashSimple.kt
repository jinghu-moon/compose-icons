package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrashSimple: ImageVector
    get() {
        if (_trashSimple != null) return _trashSimple!!
        _trashSimple = phosphorLightIcon(
            name = "TrashSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 50h-176c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10v146c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-146h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM194 208c0 1.105-.895 2-2 2h-128c-1.105 0-2-.895-2-2v-146h132ZM82 24c0-3.314 2.686-6 6-6h80c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6Z"),
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
        return _trashSimple!!
    }

private var _trashSimple: ImageVector? = null
