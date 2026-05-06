package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorBoldIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 128h-28v-20h12c11.046 0 20-8.954 20-20v-48C212 28.954 203.046 20 192 20h-128C52.954 20 44 28.954 44 40v48c0 11.046 8.954 20 20 20h12v20h-28c-11.046 0-20 8.954-20 20v24c0 11.046 8.954 20 20 20h8v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32h96v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32h8c11.046 0 20-8.954 20-20v-24c0-11.046-8.954-20-20-20ZM68 44h120v40h-120ZM100 108h56v20h-56ZM204 168h-152v-16h152Z"),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
