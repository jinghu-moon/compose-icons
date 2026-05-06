package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorBoldIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 116v-28C244 76.954 235.046 68 224 68h-16v-4C208 52.954 199.046 44 188 44h-24c-11.046 0-20 8.954-20 20v52h-32v-52C112 52.954 103.046 44 92 44h-24C56.954 44 48 52.954 48 64v4h-16C20.954 68 12 76.954 12 88v28C5.373 116 0 121.373 0 128c0 6.627 5.373 12 12 12v28c0 11.046 8.954 20 20 20h16v4c0 11.046 8.954 20 20 20h24c11.046 0 20-8.954 20-20v-52h32v52c0 11.046 8.954 20 20 20h24c11.046 0 20-8.954 20-20v-4h16c11.046 0 20-8.954 20-20v-28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM36 164v-72h12v72ZM88 188h-16v-120h16ZM184 188h-16v-120h16ZM220 164h-12v-72h12Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
