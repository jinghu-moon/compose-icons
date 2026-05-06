package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorRegularIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.69 199.77 160 96.92v-56.92h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v56.92L34.31 199.77c-2.962 4.938-3.042 11.087-.209 16.101 2.833 5.014 8.141 8.118 13.899 8.129h160c5.764-0 11.082-3.101 13.922-8.116 2.84-5.016 2.763-11.171-.202-16.114ZM110.86 103.25c.748-1.24 1.142-2.662 1.14-4.11v-59.14h32v59.14c-.002 1.448 .392 2.87 1.14 4.11L183.36 167c-12 2.37-29.07 1.37-51.75-10.11C115.7 148.84 100.56 144.57 86.39 144.08ZM48 208 76.54 160.42c14.25-1.74 30.31 1.85 47.82 10.72 19 9.61 35 12.88 48 12.88 6.612 .029 13.194-.88 19.55-2.7L208 208Z"),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
