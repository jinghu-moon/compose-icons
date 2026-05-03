package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorBoldIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 152.000 C 220.000 158.627 214.627 164.000 208.000 164.000 L 140.000 164.000 L 140.000 203.000 L 151.510 191.480 C 156.204 186.786 163.816 186.786 168.510 191.480 C 173.204 196.174 173.204 203.786 168.510 208.480 L 136.510 240.480 C 134.258 242.739 131.200 244.009 128.010 244.009 C 124.820 244.009 121.762 242.739 119.510 240.480 L 87.510 208.480 C 82.816 203.786 82.816 196.174 87.510 191.480 C 92.204 186.786 99.816 186.786 104.510 191.480 L 116.000 203.000 L 116.000 164.000 L 48.000 164.000 C 41.373 164.000 36.000 158.627 36.000 152.000 C 36.000 145.373 41.373 140.000 48.000 140.000 L 208.000 140.000 C 214.627 140.000 220.000 145.373 220.000 152.000 ZM 48.000 116.000 L 208.000 116.000 C 214.627 116.000 220.000 110.627 220.000 104.000 C 220.000 97.373 214.627 92.000 208.000 92.000 L 140.000 92.000 L 140.000 53.000 L 151.510 64.520 C 156.204 69.214 163.816 69.214 168.510 64.520 C 173.204 59.826 173.204 52.214 168.510 47.520 L 136.510 15.520 C 134.258 13.261 131.200 11.991 128.010 11.991 C 124.820 11.991 121.762 13.261 119.510 15.520 L 87.510 47.520 C 82.816 52.214 82.816 59.826 87.510 64.520 C 92.204 69.214 99.816 69.214 104.510 64.520 L 116.000 53.000 L 116.000 92.000 L 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 C 36.000 110.627 41.373 116.000 48.000 116.000 Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
