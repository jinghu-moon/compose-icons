package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) return _bagSimple!!
        _bagSimple = phosphorThinIcon(
            name = "BagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 68.000 L 172.000 68.000 L 172.000 64.000 C 172.000 39.699 152.301 20.000 128.000 20.000 C 103.699 20.000 84.000 39.699 84.000 64.000 L 84.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 80.000 C 228.000 73.373 222.627 68.000 216.000 68.000 ZM 92.000 64.000 C 92.000 44.118 108.118 28.000 128.000 28.000 C 147.882 28.000 164.000 44.118 164.000 64.000 L 164.000 68.000 L 92.000 68.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 Z"),
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
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null
