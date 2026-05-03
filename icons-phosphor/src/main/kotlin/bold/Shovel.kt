package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorBoldIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.490 55.510 L 200.490 7.510 C 195.796 2.816 188.184 2.816 183.490 7.510 C 178.796 12.204 178.796 19.816 183.490 24.510 L 199.000 40.000 L 133.630 105.370 L 102.140 73.860 C 94.330 66.052 81.670 66.052 73.860 73.860 L 17.860 129.860 C 14.100 133.604 11.990 138.694 12.000 144.000 L 12.000 224.000 C 12.000 235.046 20.954 244.000 32.000 244.000 L 112.000 244.000 C 117.307 244.014 122.399 241.904 126.140 238.140 L 182.140 182.140 C 189.948 174.330 189.948 161.670 182.140 153.860 L 150.630 122.340 L 216.000 57.000 L 231.510 72.520 C 236.204 77.214 243.816 77.214 248.510 72.520 C 253.204 67.826 253.204 60.214 248.510 55.520 ZM 162.340 168.000 L 110.340 220.000 L 36.000 220.000 L 36.000 145.660 L 88.000 93.660 L 116.690 122.340 L 79.510 159.510 C 74.816 164.204 74.816 171.816 79.510 176.510 C 84.204 181.204 91.816 181.204 96.510 176.510 L 133.680 139.330 Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
