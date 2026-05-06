package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartBar: ImageVector
    get() {
        if (_chartBar != null) return _chartBar!!
        _chartBar = phosphorBoldIcon(
            name = "ChartBar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 196h-4v-156c0-6.627-5.373-12-12-12h-56c-6.627 0-12 5.373-12 12v36h-44C89.373 76 84 81.373 84 88v36h-36c-6.627 0-12 5.373-12 12v60h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM164 52h32v144h-32ZM108 100h32v96h-32ZM60 148h24v48h-24Z"),
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
