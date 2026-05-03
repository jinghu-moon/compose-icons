package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorBoldIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 48.000 L 116.000 208.000 C 116.000 214.627 110.627 220.000 104.000 220.000 C 97.373 220.000 92.000 214.627 92.000 208.000 L 92.000 140.000 L 53.000 140.000 L 64.520 151.510 C 69.214 156.204 69.214 163.816 64.520 168.510 C 59.826 173.204 52.214 173.204 47.520 168.510 L 15.520 136.510 C 13.261 134.258 11.991 131.200 11.991 128.010 C 11.991 124.820 13.261 121.762 15.520 119.510 L 47.520 87.510 C 52.214 82.816 59.826 82.816 64.520 87.510 C 69.214 92.204 69.214 99.816 64.520 104.510 L 53.000 116.000 L 92.000 116.000 L 92.000 48.000 C 92.000 41.373 97.373 36.000 104.000 36.000 C 110.627 36.000 116.000 41.373 116.000 48.000 ZM 240.490 119.510 L 208.490 87.510 C 203.796 82.816 196.184 82.816 191.490 87.510 C 186.796 92.204 186.796 99.816 191.490 104.510 L 203.000 116.000 L 164.000 116.000 L 164.000 48.000 C 164.000 41.373 158.627 36.000 152.000 36.000 C 145.373 36.000 140.000 41.373 140.000 48.000 L 140.000 208.000 C 140.000 214.627 145.373 220.000 152.000 220.000 C 158.627 220.000 164.000 214.627 164.000 208.000 L 164.000 140.000 L 203.000 140.000 L 191.480 151.510 C 186.786 156.204 186.786 163.816 191.480 168.510 C 196.174 173.204 203.786 173.204 208.480 168.510 L 240.480 136.510 C 242.741 134.260 244.013 131.202 244.014 128.012 C 244.016 124.822 242.748 121.763 240.490 119.510 Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
