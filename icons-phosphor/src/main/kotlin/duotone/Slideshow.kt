package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Slideshow: ImageVector
    get() {
        if (_slideshow != null) return _slideshow!!
        _slideshow = phosphorDuotoneIcon(
            name = "Slideshow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 64.000 L 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 64.000 C 56.000 59.582 59.582 56.000 64.000 56.000 L 192.000 56.000 C 196.418 56.000 200.000 59.582 200.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 192.000 48.000 L 64.000 48.000 C 55.163 48.000 48.000 55.163 48.000 64.000 L 48.000 192.000 C 48.000 200.837 55.163 208.000 64.000 208.000 L 192.000 208.000 C 200.837 208.000 208.000 200.837 208.000 192.000 L 208.000 64.000 C 208.000 55.163 200.837 48.000 192.000 48.000 ZM 192.000 192.000 L 64.000 192.000 L 64.000 64.000 L 192.000 64.000 L 192.000 192.000 ZM 240.000 56.000 L 240.000 200.000 C 240.000 204.418 236.418 208.000 232.000 208.000 C 227.582 208.000 224.000 204.418 224.000 200.000 L 224.000 56.000 C 224.000 51.582 227.582 48.000 232.000 48.000 C 236.418 48.000 240.000 51.582 240.000 56.000 ZM 32.000 56.000 L 32.000 200.000 C 32.000 204.418 28.418 208.000 24.000 208.000 C 19.582 208.000 16.000 204.418 16.000 200.000 L 16.000 56.000 C 16.000 51.582 19.582 48.000 24.000 48.000 C 28.418 48.000 32.000 51.582 32.000 56.000 Z"),
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
        return _slideshow!!
    }

private var _slideshow: ImageVector? = null
