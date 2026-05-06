package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorLightIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C87.933 26.04 51.601 49.535 35.125 86.058 18.65 122.581 25.083 165.367 51.57 195.43c26.487 30.063 68.122 41.834 106.43 30.09 .936-.287 1.787-.798 2.48-1.49L224 160.46c.693-.696 1.205-1.551 1.49-2.49 9.482-30.933 3.735-64.529-15.489-90.552C190.777 41.395 160.353 26.028 128 26ZM214.47 153l-61.42 61.43C113.644 225.817 71.526 209.09 50.67 173.77 29.813 138.449 35.507 93.49 64.509 64.483 93.511 35.476 138.469 29.776 173.793 50.626c35.324 20.851 52.058 62.965 40.677 102.374ZM82 108c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM174 108c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM173.19 155c-9.92 17.16-26.39 27-45.19 27-18.8 0-35.27-9.84-45.19-27-1.49-2.849-.47-6.367 2.314-7.976 2.784-1.609 6.341-.738 8.066 1.976 7.84 13.54 20.2 21 34.81 21 14.61 0 27-7.46 34.81-21 1.022-1.953 3.032-3.188 5.235-3.218 2.204-.03 4.246 1.151 5.32 3.075 1.074 1.925 1.007 4.283-.176 6.143Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
