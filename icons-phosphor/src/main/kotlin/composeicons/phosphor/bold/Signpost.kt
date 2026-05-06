package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorBoldIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.92 104 215.3 66.62C211.508 62.408 206.108 60.001 200.44 60h-60.44v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v28h-76C28.954 60 20 68.954 20 80v64c0 11.046 8.954 20 20 20h76v60c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-60h60.44c5.668-.001 11.068-2.408 14.86-6.62L248.92 120c4.074-4.555 4.074-11.445 0-16ZM198.66 140h-154.66v-56h154.66l25.2 28Z"),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
