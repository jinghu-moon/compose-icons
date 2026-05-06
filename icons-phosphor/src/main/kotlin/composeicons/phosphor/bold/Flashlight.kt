package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorBoldIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 12h-112C60.954 12 52 20.954 52 32v45.33c.009 4.326 1.411 8.534 4 12L76 116v108c0 11.046 8.954 20 20 20h64c11.046 0 20-8.954 20-20v-108L200 89.33c2.589-3.466 3.991-7.674 4-12v-45.33C204 20.954 195.046 12 184 12ZM180 36v16h-104v-16ZM160 102.67c-2.589 3.466-3.991 7.674-4 12v105.33h-56v-105.33c-.009-4.326-1.411-8.534-4-12L76 76h104ZM140 120v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-32c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
