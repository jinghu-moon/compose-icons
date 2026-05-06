package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorDuotoneIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 80v96c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM104 72h-40c-4.418 0-8 3.582-8 8v136c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-136c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M224 40c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM208 80v96c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16v-96c0-8.837 7.163-16 16-16h40c8.837 0 16 7.163 16 16ZM192 80h-40v96h40ZM120 80v136c0 8.837-7.163 16-16 16h-40c-8.837 0-16-7.163-16-16v-136C48 71.163 55.163 64 64 64h40c8.837 0 16 7.163 16 16ZM104 80h-40v136h40Z"),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
