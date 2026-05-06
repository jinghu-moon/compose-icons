package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorBoldIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.33 106.79 212 103.35v-47.35C212 44.954 203.046 36 192 36h-52v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-52C52.954 36 44 44.954 44 56v47.35l-10.33 3.44c-8.174 2.727-13.682 10.383-13.67 19v26.21c0 64.63 100.8 90.57 105.09 91.64 1.91 .48 3.91 .48 5.82 0C135.2 242.57 236 216.63 236 152v-26.23c.004-8.609-5.503-16.255-13.67-18.98ZM68 60h120v35.35L131.79 76.62c-2.459-.83-5.121-.83-7.58 0L68 95.35ZM212 152c0 36.69-58.08 60.43-84 67.59C102.06 212.42 44 188.69 44 152v-23.35l72-24v63.35c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-63.35l72 24Z"),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
