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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 12.000 L 72.000 12.000 C 60.954 12.000 52.000 20.954 52.000 32.000 L 52.000 77.330 C 52.009 81.656 53.411 85.864 56.000 89.330 L 76.000 116.000 L 76.000 224.000 C 76.000 235.046 84.954 244.000 96.000 244.000 L 160.000 244.000 C 171.046 244.000 180.000 235.046 180.000 224.000 L 180.000 116.000 L 200.000 89.330 C 202.589 85.864 203.991 81.656 204.000 77.330 L 204.000 32.000 C 204.000 20.954 195.046 12.000 184.000 12.000 ZM 180.000 36.000 L 180.000 52.000 L 76.000 52.000 L 76.000 36.000 ZM 160.000 102.670 C 157.411 106.136 156.009 110.344 156.000 114.670 L 156.000 220.000 L 100.000 220.000 L 100.000 114.670 C 99.991 110.344 98.589 106.136 96.000 102.670 L 76.000 76.000 L 180.000 76.000 ZM 140.000 120.000 L 140.000 152.000 C 140.000 158.627 134.627 164.000 128.000 164.000 C 121.373 164.000 116.000 158.627 116.000 152.000 L 116.000 120.000 C 116.000 113.373 121.373 108.000 128.000 108.000 C 134.627 108.000 140.000 113.373 140.000 120.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
