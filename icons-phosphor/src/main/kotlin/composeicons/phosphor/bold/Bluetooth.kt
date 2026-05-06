package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) return _bluetooth!!
        _bluetooth = phosphorBoldIcon(
            name = "Bluetooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M199.2 166.4 148 128 199.2 89.6C202.222 87.334 204 83.777 204 80c0-3.777-1.778-7.334-4.8-9.6l-64-48c-3.636-2.727-8.501-3.166-12.567-1.133C118.568 23.3 116 27.455 116 32v72L71.2 70.4C65.898 66.424 58.376 67.498 54.4 72.8c-3.976 5.302-2.902 12.824 2.4 16.8L108 128 56.8 166.4c-5.302 3.976-6.376 11.498-2.4 16.8 3.976 5.302 11.498 6.376 16.8 2.4L116 152v72c0 4.545 2.568 8.7 6.633 10.733 4.065 2.033 8.93 1.594 12.567-1.133l64-48C202.222 183.334 204 179.777 204 176c0-3.777-1.778-7.334-4.8-9.6ZM140 56l32 24-32 24ZM140 200v-48l32 24Z"),
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
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
