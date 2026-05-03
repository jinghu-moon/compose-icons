package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorThinIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 116.000 80.000 C 116.000 73.373 121.373 68.000 128.000 68.000 C 134.627 68.000 140.000 73.373 140.000 80.000 C 140.000 86.627 134.627 92.000 128.000 92.000 C 121.373 92.000 116.000 86.627 116.000 80.000 ZM 180.000 112.000 C 180.000 114.209 178.209 116.000 176.000 116.000 L 132.000 116.000 L 132.000 134.790 L 163.330 181.790 C 164.556 183.629 164.059 186.114 162.220 187.340 C 160.381 188.566 157.896 188.069 156.670 186.230 L 128.000 143.230 L 99.330 186.230 C 98.104 188.069 95.619 188.566 93.780 187.340 C 91.941 186.114 91.444 183.629 92.670 181.790 L 124.000 134.790 L 124.000 116.000 L 80.000 116.000 C 77.791 116.000 76.000 114.209 76.000 112.000 C 76.000 109.791 77.791 108.000 80.000 108.000 L 176.000 108.000 C 178.209 108.000 180.000 109.791 180.000 112.000 Z"),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
