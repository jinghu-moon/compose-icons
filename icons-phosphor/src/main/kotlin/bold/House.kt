package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorBoldIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.140 105.850 L 142.140 25.850 C 134.330 18.042 121.670 18.042 113.860 25.850 L 33.860 105.850 C 30.093 109.593 27.983 114.690 28.000 120.000 L 28.000 216.000 C 28.000 222.627 33.373 228.000 40.000 228.000 L 104.000 228.000 C 110.627 228.000 116.000 222.627 116.000 216.000 L 116.000 164.000 L 140.000 164.000 L 140.000 216.000 C 140.000 222.627 145.373 228.000 152.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 120.000 C 228.017 114.690 225.907 109.593 222.140 105.850 ZM 204.000 204.000 L 164.000 204.000 L 164.000 152.000 C 164.000 145.373 158.627 140.000 152.000 140.000 L 104.000 140.000 C 97.373 140.000 92.000 145.373 92.000 152.000 L 92.000 204.000 L 52.000 204.000 L 52.000 121.650 L 128.000 45.650 L 204.000 121.650 Z"),
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
        return _house!!
    }

private var _house: ImageVector? = null
