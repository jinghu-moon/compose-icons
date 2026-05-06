package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GridFour: ImageVector
    get() {
        if (_gridFour != null) return _gridFour!!
        _gridFour = phosphorBoldIcon(
            name = "GridFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36h-144C44.954 36 36 44.954 36 56v144c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-144C220 44.954 211.046 36 200 36ZM196 116h-56v-56h56ZM116 60v56h-56v-56ZM60 140h56v56h-56ZM140 196v-56h56v56Z"),
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
        return _gridFour!!
    }

private var _gridFour: ImageVector? = null
