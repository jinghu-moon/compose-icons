package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorDuotoneIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 112v56h-136v-88h104c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M216 72h-184v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h208v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96C256 89.909 238.091 72 216 72ZM32 88h72v72h-72ZM120 160v-72h96c13.255 0 24 10.745 24 24v48Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
