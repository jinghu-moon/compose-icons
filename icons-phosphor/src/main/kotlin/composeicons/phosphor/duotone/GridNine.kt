package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorDuotoneIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 64v128c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M216 48h-176C31.163 48 24 55.163 24 64v128c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM104 144v-32h48v32ZM152 160v32h-48v-32ZM40 112h48v32h-48ZM104 96v-32h48v32ZM168 112h48v32h-48ZM216 96h-48v-32h48ZM88 64v32h-48v-32ZM40 160h48v32h-48ZM216 192h-48v-32h48v32Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
