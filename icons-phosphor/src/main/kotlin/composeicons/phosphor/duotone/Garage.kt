package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorDuotoneIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 136v64h-112v-64Z"),
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
                pathData = parseSvgPathData("M240 192h-8v-93.33c0-5.348-2.671-10.342-7.12-13.31l-88-58.67c-5.374-3.583-12.376-3.583-17.75 0L31.13 85.36C26.678 88.326 24.002 93.32 24 98.67v93.33h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM40 98.67 128 40l88 58.66v93.34h-24v-56c0-4.418-3.582-8-8-8h-112c-4.418 0-8 3.582-8 8v56h-24ZM176 144v16h-40v-16ZM120 160h-40v-16h40ZM80 176h40v16h-40ZM136 176h40v16h-40Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
