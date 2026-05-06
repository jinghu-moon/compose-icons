package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) return _toggleLeft!!
        _toggleLeft = phosphorBoldIcon(
            name = "ToggleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 52h-96C38.026 52 4 86.026 4 128c0 41.974 34.026 76 76 76h96c41.974 0 76-34.026 76-76C252 86.026 217.974 52 176 52ZM176 180h-96C51.281 180 28 156.719 28 128 28 99.281 51.281 76 80 76h96c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52ZM80 88C57.909 88 40 105.909 40 128c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C120 105.909 102.091 88 80 88ZM80 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
