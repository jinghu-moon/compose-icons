package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorBoldIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 156h-28v-44.51c6.844 6.398 14.806 11.483 23.49 15 6.144 2.485 13.14-.481 15.625-6.625 2.485-6.144-.481-13.14-6.625-15.625C216.805 96.329 203.932 77.215 204 56c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 28.719-23.281 52-52 52C99.281 108 76 84.719 76 56 76 49.373 70.627 44 64 44 57.373 44 52 49.373 52 56c.059 21.211-12.818 40.315-32.5 48.22-6.144 2.485-9.11 9.481-6.625 15.625 2.485 6.144 9.481 9.11 15.625 6.625 8.684-3.517 16.646-8.602 23.49-15v44.53h-27.99c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h104v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-20h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM140 131.05v24.95h-24v-24.95c7.95 1.267 16.05 1.267 24 0ZM76 111.38c4.813 4.518 10.191 8.394 16 11.53v33.09h-16ZM164 156v-33.09c5.809-3.136 11.187-7.012 16-11.53v44.62Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
