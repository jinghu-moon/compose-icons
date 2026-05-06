package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Suitcase: ImageVector
    get() {
        if (_suitcase != null) return _suitcase!!
        _suitcase = phosphorDuotoneIcon(
            name = "Suitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40 64h48v144h-48c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8ZM216 64h-48v144h48c4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8Z"),
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
                pathData = parseSvgPathData("M216 56h-40v-8C176 34.745 165.255 24 152 24h-48C90.745 24 80 34.745 80 48v8h-40C31.163 56 24 63.163 24 72v128c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM96 48c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8v8h-64ZM160 72v128h-64v-128ZM40 72h40v128h-40ZM216 200h-40v-128h40v128Z"),
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
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
