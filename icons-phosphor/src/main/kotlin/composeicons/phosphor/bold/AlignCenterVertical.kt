package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorBoldIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 116h-8v-44C216 60.954 207.046 52 196 52h-40c-11.046 0-20 8.954-20 20v44h-16v-68C120 36.954 111.046 28 100 28h-40C48.954 28 40 36.954 40 48v68h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h8v68c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-68h16v44c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-44h8c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM96 204h-32v-152h32ZM192 180h-32v-104h32Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
