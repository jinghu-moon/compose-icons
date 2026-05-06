package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorBoldIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.29 182.17c-1.637 2.731-4.292 4.7-7.381 5.473-3.089 .773-6.359 .286-9.089-1.353L140 149.19v66.81c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-66.81L54.18 186.29c-5.683 3.41-13.055 1.568-16.465-4.115-3.41-5.683-1.568-13.055 4.115-16.465L104.68 128 41.83 90.29C36.147 86.88 34.305 79.508 37.715 73.825c3.41-5.683 10.782-7.525 16.465-4.115L116 106.81v-66.81c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v66.81L201.82 69.71c5.683-3.41 13.055-1.568 16.465 4.115 3.41 5.683 1.568 13.055-4.115 16.465L151.32 128l62.85 37.71c5.682 3.408 7.526 10.777 4.12 16.46Z"),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
