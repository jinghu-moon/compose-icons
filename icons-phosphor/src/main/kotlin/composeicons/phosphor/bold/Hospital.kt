package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorBoldIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 204h-4v-76c0-11.046-8.954-20-20-20h-48v-60C172 36.954 163.046 28 152 28h-96C44.954 28 36 36.954 36 48v156h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h212c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 132v72h-44v-72ZM60 52h88v152h-12v-44c0-6.627-5.373-12-12-12h-40c-6.627 0-12 5.373-12 12v44h-12ZM112 204h-16v-32h16ZM72 96C72 89.373 77.373 84 84 84h8v-8c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8C77.373 108 72 102.627 72 96Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
