package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pause: ImageVector
    get() {
        if (_pause != null) return _pause!!
        _pause = phosphorBoldIcon(
            name = "Pause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-40c-11.046 0-20 8.954-20 20v160c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-160C220 36.954 211.046 28 200 28ZM196 204h-32v-152h32ZM96 28h-40C44.954 28 36 36.954 36 48v160c0 11.046 8.954 20 20 20h40c11.046 0 20-8.954 20-20v-160C116 36.954 107.046 28 96 28ZM92 204h-32v-152h32Z"),
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
        return _pause!!
    }

private var _pause: ImageVector? = null
