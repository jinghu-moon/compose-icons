package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorFillIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 56h-96C40.235 56 8 88.235 8 128c0 39.764 32.235 72 72 72h96c39.764 0 72-32.236 72-72C248 88.235 215.764 56 176 56ZM80 168C57.909 168 40 150.091 40 128 40 105.909 57.909 88 80 88c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
