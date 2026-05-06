package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorRegularIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 97.37v-1.37C208 51.817 172.183 16 128 16 83.817 16 48 51.817 48 96v1.37c-11.024 3.894-17.639 15.165-15.662 26.688C34.315 135.582 44.308 144.004 56 144h3.29l54.82 95.94c2.849 4.983 8.15 8.058 13.89 8.058 5.74 0 11.041-3.075 13.89-8.058L196.71 144h3.29c11.692 .004 21.685-8.418 23.662-19.942C225.639 112.535 219.024 101.264 208 97.37ZM77.71 144h19.36l40.61 71.06L128 232ZM134.79 144l21.75 38.06-9.65 16.88L115.5 144ZM165.79 165.94 153.21 144h25.08ZM200 128h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8-3.582 8-8v-8C64 60.654 92.654 32 128 32c35.346 0 64 28.654 64 64v8c0 4.418 3.582 8 8 8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
