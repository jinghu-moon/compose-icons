package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CraneTower: ImageVector
    get() {
        if (_craneTower != null) return _craneTower!!
        _craneTower = phosphorBoldIcon(
            name = "CraneTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 76h-128.58L90.73 34.63C88.697 30.567 84.543 28.001 80 28h-32C41.373 28 36 33.373 36 40v36h-12C17.373 76 12 81.373 12 88c0 6.627 5.373 12 12 12h12v104h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h104c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-104h88v80h-12v-4c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v8c0 11.046 8.954 20 20 20h20c11.046 0 20-8.954 20-20v-84h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM60 52h12.58l12 24h-24.58ZM60 204v-40h32v40ZM92 140h-32v-40h32Z"),
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
        return _craneTower!!
    }

private var _craneTower: ImageVector? = null
