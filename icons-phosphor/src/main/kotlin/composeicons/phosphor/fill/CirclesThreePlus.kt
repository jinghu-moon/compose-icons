package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorFillIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 80c0 22.091-17.909 40-40 40C57.909 120 40 102.091 40 80 40 57.909 57.909 40 80 40c22.091 0 40 17.909 40 40ZM176 120c22.091 0 40-17.909 40-40C216 57.909 198.091 40 176 40c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40ZM80 136c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40 0-22.091-17.909-40-40-40ZM208 168h-24v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
