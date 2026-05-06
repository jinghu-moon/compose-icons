package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorDuotoneIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 104v-40c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8h-96c-4.418 0-8-3.582-8-8ZM216 144h-136c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h136c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M216 136h-136c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16h136c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16ZM216 192h-136v-40h136v40ZM48 40v176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM80 120h96c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16h-96C71.163 48 64 55.163 64 64v40c0 8.837 7.163 16 16 16ZM80 64h96v40h-96Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
