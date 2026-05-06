package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorThinIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.84 186.83c-3.497 3.491-5.461 8.229-5.461 13.17 0 4.941 1.965 9.679 5.461 13.17 1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0-10.399-10.4-10.399-27.26 0-37.66l9.38-9.37c4.797-4.688 6.704-11.593 4.992-18.079-1.712-6.486-6.778-11.55-13.265-13.26-6.486-1.71-13.391 .2-18.077 4.999l-66.76 66.74c-10.415 10.308-27.201 10.264-37.563-.097C65.526 201.741 65.482 184.955 75.79 174.54L174.55 75.8c4.797-4.688 6.704-11.593 4.992-18.079C177.83 51.235 172.763 46.171 166.277 44.461c-6.486-1.71-13.391 .2-18.077 4.999L81.45 116.2c-10.415 10.308-27.201 10.264-37.563-.097C33.526 105.741 33.482 88.955 43.79 78.54L85.17 37.17c1.002-1.053 2.496-1.479 3.903-1.114 1.407 .365 2.505 1.465 2.868 2.873 .363 1.407-.066 2.901-1.121 3.901L49.44 84.2c-4.797 4.688-6.704 11.593-4.992 18.079 1.712 6.486 6.778 11.55 13.265 13.26 6.486 1.71 13.391-.2 18.077-4.999L142.55 43.8c10.415-10.308 27.201-10.264 37.563 .097 10.362 10.362 10.405 27.147 .097 37.563L81.45 180.2c-4.797 4.688-6.704 11.593-4.992 18.079 1.712 6.486 6.778 11.55 13.265 13.26 6.486 1.71 13.391-.2 18.077-4.999l66.75-66.74c10.415-10.308 27.201-10.264 37.563 .097 10.362 10.362 10.405 27.147 .097 37.563Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
