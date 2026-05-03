package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorLightIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 162.000 C 165.192 161.996 154.896 166.606 147.700 174.670 L 98.800 143.240 C 103.067 133.528 103.067 122.472 98.800 112.760 L 147.700 81.330 C 160.930 96.087 183.280 98.198 199.039 86.179 C 214.798 74.159 218.673 52.046 207.940 35.385 C 197.206 18.723 175.470 13.109 158.010 22.489 C 140.551 31.869 133.233 53.092 141.200 71.240 L 92.300 102.670 C 81.797 90.925 65.136 86.879 50.416 92.501 C 35.697 98.122 25.973 112.244 25.973 128.000 C 25.973 143.756 35.697 157.878 50.416 163.499 C 65.136 169.121 81.797 165.075 92.300 153.330 L 141.200 184.760 C 134.459 200.158 138.635 218.156 151.468 229.012 C 164.301 239.868 182.742 241.003 196.810 231.802 C 210.877 222.602 217.229 205.252 212.426 189.144 C 207.624 173.035 192.809 161.996 176.000 162.000 ZM 176.000 30.000 C 190.359 30.000 202.000 41.641 202.000 56.000 C 202.000 70.359 190.359 82.000 176.000 82.000 C 161.641 82.000 150.000 70.359 150.000 56.000 C 150.000 41.641 161.641 30.000 176.000 30.000 ZM 64.000 154.000 C 49.641 154.000 38.000 142.359 38.000 128.000 C 38.000 113.641 49.641 102.000 64.000 102.000 C 78.359 102.000 90.000 113.641 90.000 128.000 C 90.000 142.359 78.359 154.000 64.000 154.000 ZM 176.000 226.000 C 161.641 226.000 150.000 214.359 150.000 200.000 C 150.000 185.641 161.641 174.000 176.000 174.000 C 190.359 174.000 202.000 185.641 202.000 200.000 C 202.000 214.359 190.359 226.000 176.000 226.000 Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
