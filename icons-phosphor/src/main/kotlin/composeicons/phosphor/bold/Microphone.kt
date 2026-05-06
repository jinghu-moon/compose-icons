package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorBoldIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 180c28.705-.033 51.967-23.295 52-52v-64C180 35.281 156.719 12 128 12 99.281 12 76 35.281 76 64v64c.033 28.705 23.295 51.967 52 52ZM100 64c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v64c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM140 219.22v20.78c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20.78C70.251 213.139 36.058 174.151 36 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 37.555 30.445 68 68 68 37.555 0 68-30.445 68-68 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12-.058 46.151-34.251 85.139-80 91.22Z"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
