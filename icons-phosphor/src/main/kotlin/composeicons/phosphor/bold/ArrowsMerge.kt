package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorBoldIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 40v64c.003 3.184-1.26 6.238-3.51 8.49L140 165v38l11.51-11.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 203v-38L63.51 112.49C61.26 110.238 59.997 107.184 60 104v-64C60 33.373 65.373 28 72 28c6.627 0 12 5.373 12 12v59l44 44L172 99v-59c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
