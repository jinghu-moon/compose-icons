package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorDuotoneIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 64v144c0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8v-144c0-4.418 3.582-8 8-8h128c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M104 88v96c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM128 80c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8ZM160 80c-4.418 0-8 3.582-8 8v96c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-96c0-4.418-3.582-8-8-8ZM208 64v144c0 8.837-7.163 16-16 16h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-64v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-8.837 0-16-7.163-16-16v-144C48 55.163 55.163 48 64 48h24v-24C88 10.745 98.745 0 112 0h32c13.255 0 24 10.745 24 24v24h24c8.837 0 16 7.163 16 16ZM104 48h48v-24c0-4.418-3.582-8-8-8h-32c-4.418 0-8 3.582-8 8ZM192 208v-144h-128v144h128Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
