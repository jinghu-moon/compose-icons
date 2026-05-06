package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorBoldIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 72h-12v-8C212 48.536 199.464 36 184 36h-144C24.536 36 12 48.536 12 64v88c0 15.464 12.536 28 28 28h96v12c0 15.464 12.536 28 28 28h60c15.464 0 28-12.536 28-28v-92C252 84.536 239.464 72 224 72ZM40 156c-2.209 0-4-1.791-4-4v-88c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4v8h-24c-15.464 0-28 12.536-28 28v56ZM228 192c0 2.209-1.791 4-4 4h-60c-2.209 0-4-1.791-4-4v-92c0-2.209 1.791-4 4-4h60c2.209 0 4 1.791 4 4ZM124 208c0 6.627-5.373 12-12 12h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h24c6.627 0 12 5.373 12 12ZM212 124c0 6.627-5.373 12-12 12h-12c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h12c6.627 0 12 5.373 12 12Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
