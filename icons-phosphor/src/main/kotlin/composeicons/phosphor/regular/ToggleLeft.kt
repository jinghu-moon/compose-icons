package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorRegularIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 56h-96C40.235 56 8 88.235 8 128c0 39.764 32.235 72 72 72h96c39.764 0 72-32.236 72-72C248 88.235 215.764 56 176 56ZM176 184h-96C49.072 184 24 158.928 24 128 24 97.072 49.072 72 80 72h96c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56ZM80 88C57.909 88 40 105.909 40 128c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C120 105.909 102.091 88 80 88ZM80 152C66.745 152 56 141.255 56 128c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
