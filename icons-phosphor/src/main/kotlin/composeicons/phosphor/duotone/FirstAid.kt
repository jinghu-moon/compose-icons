package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorDuotoneIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 104v48c0 4.418-3.582 8-8 8h-56v56c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8v-56h-56c-4.418 0-8-3.582-8-8v-48c0-4.418 3.582-8 8-8h56v-56c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8v56h56c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M216 88h-48v-48c0-8.837-7.163-16-16-16h-48C95.163 24 88 31.163 88 40v48h-48c-8.837 0-16 7.163-16 16v48c0 8.837 7.163 16 16 16h48v48c0 8.837 7.163 16 16 16h48c8.837 0 16-7.163 16-16v-48h48c8.837 0 16-7.163 16-16v-48c0-8.837-7.163-16-16-16ZM216 152h-56c-4.418 0-8 3.582-8 8v56h-48v-56c0-4.418-3.582-8-8-8h-56v-48h56c4.418 0 8-3.582 8-8v-56h48v56c0 4.418 3.582 8 8 8h56Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
