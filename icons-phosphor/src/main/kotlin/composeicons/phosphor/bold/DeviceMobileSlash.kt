package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DeviceMobileSlash: ImageVector
    get() {
        if (_deviceMobileSlash != null) return _deviceMobileSlash!!
        _deviceMobileSlash = phosphorBoldIcon(
            name = "DeviceMobileSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93 56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L52 62.24v153.76c0 15.464 12.536 28 28 28h96c11.452-0 21.75-6.975 26-17.61 5.12 2.952 11.627 1.736 15.336-2.865 3.709-4.601 3.515-11.218-.456-15.595ZM176 220h-96c-2.209 0-4-1.791-4-4v-127.36L180 203v13c0 2.209-1.791 4-4 4ZM75.51 24c0-6.627 5.373-12 12-12h88.49c15.464 0 28 12.536 28 28v98.94c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-98.94c0-2.209-1.791-4-4-4h-88.49c-6.627 0-12-5.373-12-12Z"),
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
        return _deviceMobileSlash!!
    }

private var _deviceMobileSlash: ImageVector? = null
