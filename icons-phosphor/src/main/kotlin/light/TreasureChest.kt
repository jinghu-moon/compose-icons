package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) return _treasureChest!!
        _treasureChest = phosphorLightIcon(
            name = "TreasureChest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 42.000 L 72.000 42.000 C 42.190 42.033 18.033 66.190 18.000 96.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 96.000 C 237.967 66.190 213.810 42.033 184.000 42.000 ZM 226.000 96.000 L 226.000 106.000 L 190.000 106.000 L 190.000 54.440 C 210.650 57.442 225.974 75.133 226.000 96.000 ZM 138.000 138.000 L 118.000 138.000 L 118.000 102.000 L 138.000 102.000 ZM 112.000 150.000 L 144.000 150.000 C 147.314 150.000 150.000 147.314 150.000 144.000 L 150.000 118.000 L 178.000 118.000 L 178.000 194.000 L 78.000 194.000 L 78.000 118.000 L 106.000 118.000 L 106.000 144.000 C 106.000 147.314 108.686 150.000 112.000 150.000 ZM 150.000 106.000 L 150.000 96.000 C 150.000 92.686 147.314 90.000 144.000 90.000 L 112.000 90.000 C 108.686 90.000 106.000 92.686 106.000 96.000 L 106.000 106.000 L 78.000 106.000 L 78.000 54.000 L 178.000 54.000 L 178.000 106.000 ZM 66.000 54.440 L 66.000 106.000 L 30.000 106.000 L 30.000 96.000 C 30.026 75.133 45.350 57.442 66.000 54.440 ZM 30.000 192.000 L 30.000 118.000 L 66.000 118.000 L 66.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 ZM 224.000 194.000 L 190.000 194.000 L 190.000 118.000 L 226.000 118.000 L 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 Z"),
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
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
