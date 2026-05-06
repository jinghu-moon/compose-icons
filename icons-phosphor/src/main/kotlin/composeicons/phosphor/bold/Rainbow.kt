package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorBoldIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 172v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8C232 114.562 185.438 68 128 68 70.562 68 24 114.562 24 172v8c0 6.627-5.373 12-12 12C5.373 192 0 186.627 0 180v-8C0 101.308 57.308 44 128 44c70.692 0 128 57.308 128 128ZM128 140c-19.882 0-36 16.118-36 36v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-19.882-16.118-36-36-36ZM128 92c-46.371 .05-83.95 37.629-84 84v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-33.137 26.863-60 60-60 33.137 0 60 26.863 60 60v4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4C211.95 129.629 174.371 92.05 128 92Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
