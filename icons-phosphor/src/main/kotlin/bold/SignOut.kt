package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorBoldIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 216.000 C 124.000 222.627 118.627 228.000 112.000 228.000 L 48.000 228.000 C 41.373 228.000 36.000 222.627 36.000 216.000 L 36.000 40.000 C 36.000 33.373 41.373 28.000 48.000 28.000 L 112.000 28.000 C 118.627 28.000 124.000 33.373 124.000 40.000 C 124.000 46.627 118.627 52.000 112.000 52.000 L 60.000 52.000 L 60.000 204.000 L 112.000 204.000 C 118.627 204.000 124.000 209.373 124.000 216.000 ZM 232.490 119.510 L 192.490 79.510 C 187.796 74.816 180.184 74.816 175.490 79.510 C 170.796 84.204 170.796 91.816 175.490 96.510 L 195.000 116.000 L 112.000 116.000 C 105.373 116.000 100.000 121.373 100.000 128.000 C 100.000 134.627 105.373 140.000 112.000 140.000 L 195.000 140.000 L 175.480 159.510 C 170.786 164.204 170.786 171.816 175.480 176.510 C 180.174 181.204 187.786 181.204 192.480 176.510 L 232.480 136.510 C 234.741 134.260 236.013 131.202 236.014 128.012 C 236.016 124.822 234.748 121.763 232.490 119.510 Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
