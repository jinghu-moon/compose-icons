package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = phosphorBoldIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 20h-112C52.118 20 36 36.118 36 56v128c0 19.882 16.118 36 36 36h0l-9.6 12.8c-3.976 5.302-2.902 12.824 2.4 16.8 5.302 3.976 12.824 2.902 16.8-2.4L102 220h52l20.4 27.2c3.976 5.302 11.498 6.376 16.8 2.4 5.302-3.976 6.376-11.498 2.4-16.8L184 220h0c19.882 0 36-16.118 36-36v-128C220 36.118 203.882 20 184 20ZM60 116v-32h56v32ZM140 84h56v32h-56ZM72 44h112c6.627 0 12 5.373 12 12v4h-136v-4C60 49.373 65.373 44 72 44ZM184 196h-112c-6.627 0-12-5.373-12-12v-44h136v44c0 6.627-5.373 12-12 12ZM104 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM184 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _train!!
    }

private var _train: ImageVector? = null
