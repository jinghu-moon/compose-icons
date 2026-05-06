package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorBoldIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 88h-56c-6.627 0-12 5.373-12 12v56c0 6.627 5.373 12 12 12h56c6.627 0 12-5.373 12-12v-56c0-6.627-5.373-12-12-12ZM144 144h-32v-32h32ZM232 140h-12v-24h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-36C220 44.954 211.046 36 200 36h-36v-12c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v12h-24v-12c0-6.627-5.373-12-12-12C97.373 12 92 17.373 92 24v12h-36C44.954 36 36 44.954 36 56v36h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v24h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v36c0 11.046 8.954 20 20 20h36v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h24v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h36c11.046 0 20-8.954 20-20v-36h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM196 196h-136v-136h136Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
