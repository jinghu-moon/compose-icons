package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorBoldIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 68h-36v-36C164 20.954 155.046 12 144 12h-32C100.954 12 92 20.954 92 32v36h-36C44.954 68 36 76.954 36 88v32c0 11.046 8.954 20 20 20h36v84c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-84h36c11.046 0 20-8.954 20-20v-32C220 76.954 211.046 68 200 68ZM196 116h-44c-6.627 0-12 5.373-12 12v92h-24v-92c0-6.627-5.373-12-12-12h-44v-24h44c6.627 0 12-5.373 12-12v-44h24v44c0 6.627 5.373 12 12 12h44Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
