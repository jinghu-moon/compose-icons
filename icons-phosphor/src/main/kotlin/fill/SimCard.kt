package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorFillIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 184.000 192.000 C 184.000 196.418 180.418 200.000 176.000 200.000 L 160.000 200.000 C 157.791 200.000 156.000 198.209 156.000 196.000 L 156.000 160.270 C 156.058 155.987 152.798 152.387 148.530 152.020 C 146.318 151.873 144.144 152.651 142.527 154.167 C 140.910 155.684 139.995 157.803 140.000 160.020 L 140.000 196.020 C 140.000 198.229 138.209 200.020 136.000 200.020 L 120.000 200.020 C 117.791 200.020 116.000 198.229 116.000 196.020 L 116.000 160.270 C 116.058 155.987 112.798 152.387 108.530 152.020 C 106.318 151.873 104.144 152.651 102.527 154.167 C 100.910 155.684 99.995 157.803 100.000 160.020 L 100.000 196.020 C 100.000 198.229 98.209 200.020 96.000 200.020 L 80.000 200.020 C 75.582 200.020 72.000 196.438 72.000 192.020 L 72.000 136.000 C 72.000 131.582 75.582 128.000 80.000 128.000 L 176.000 128.000 C 180.418 128.000 184.000 131.582 184.000 136.000 Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
