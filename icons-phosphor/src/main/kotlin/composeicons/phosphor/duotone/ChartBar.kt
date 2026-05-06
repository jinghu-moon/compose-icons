package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorDuotoneIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40v168h-56v-168Z"),
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
                pathData = parseSvgPathData("M224 200h-8v-160c0-4.418-3.582-8-8-8h-56c-4.418 0-8 3.582-8 8v40h-48c-4.418 0-8 3.582-8 8v40h-40c-4.418 0-8 3.582-8 8v64h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 48h40v152h-40ZM104 96h40v104h-40ZM56 144h32v56h-32Z"),
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
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
