package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorBoldIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 60.000 L 32.000 60.000 C 20.954 60.000 12.000 68.954 12.000 80.000 L 12.000 152.000 C 12.000 163.046 20.954 172.000 32.000 172.000 L 52.000 172.000 L 52.000 200.000 C 52.000 206.627 57.373 212.000 64.000 212.000 C 70.627 212.000 76.000 206.627 76.000 200.000 L 76.000 172.000 L 180.000 172.000 L 180.000 200.000 C 180.000 206.627 185.373 212.000 192.000 212.000 C 198.627 212.000 204.000 206.627 204.000 200.000 L 204.000 172.000 L 224.000 172.000 C 235.046 172.000 244.000 163.046 244.000 152.000 L 244.000 80.000 C 244.000 68.954 235.046 60.000 224.000 60.000 ZM 220.000 119.000 L 185.000 84.000 L 220.000 84.000 ZM 177.000 148.000 L 113.000 84.000 L 151.000 84.000 L 215.000 148.000 ZM 105.000 148.000 L 41.000 84.000 L 79.000 84.000 L 143.000 148.000 ZM 36.000 113.000 L 71.000 148.000 L 36.000 148.000 Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
