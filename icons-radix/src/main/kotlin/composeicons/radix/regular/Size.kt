package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Size: ImageVector
    get() {
        if (_size != null) return _size!!
        _size = radixIcon(
            name = "Size",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.591 3.059c.205 .042 .359 .224 .359 .441v3.999l-.01 .092c-.042 .205-.223 .358-.44 .358-.217-0-.399-.154-.441-.359l-.009-.09v-2.914L4.587 11.049l2.913 .001 .091 .009c.205 .042 .358 .223 .358 .44 0 .249-.202 .45-.45 .45h-3.999c-.119 0-.234-.047-.318-.132-.084-.084-.132-.199-.132-.318v-3.999l.01-.091c.042-.205 .223-.359 .44-.359 .217 0 .4 .154 .441 .359l.009 .091v2.914L10.414 3.95h-2.914C7.252 3.95 7.05 3.749 7.05 3.5c0-.248 .202-.45 .45-.45h4l.091 .009Z"),
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
        return _size!!
    }

private var _size: ImageVector? = null
