package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Equals: ImageVector
    get() {
        if (_equals != null) return _equals!!
        _equals = phosphorBoldIcon(
            name = "Equals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 160.000 C 228.000 166.627 222.627 172.000 216.000 172.000 L 40.000 172.000 C 33.373 172.000 28.000 166.627 28.000 160.000 C 28.000 153.373 33.373 148.000 40.000 148.000 L 216.000 148.000 C 222.627 148.000 228.000 153.373 228.000 160.000 ZM 40.000 108.000 L 216.000 108.000 C 222.627 108.000 228.000 102.627 228.000 96.000 C 228.000 89.373 222.627 84.000 216.000 84.000 L 40.000 84.000 C 33.373 84.000 28.000 89.373 28.000 96.000 C 28.000 102.627 33.373 108.000 40.000 108.000 Z"),
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
        return _equals!!
    }

private var _equals: ImageVector? = null
