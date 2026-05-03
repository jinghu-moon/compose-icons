package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LampPendant: ImageVector
    get() {
        if (_lampPendant != null) return _lampPendant!!
        _lampPendant = phosphorLightIcon(
            name = "LampPendant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.000 76.050 L 174.000 72.000 C 174.000 64.268 167.732 58.000 160.000 58.000 L 134.000 58.000 L 134.000 16.000 C 134.000 12.686 131.314 10.000 128.000 10.000 C 124.686 10.000 122.000 12.686 122.000 16.000 L 122.000 58.000 L 96.000 58.000 C 88.268 58.000 82.000 64.268 82.000 72.000 L 82.000 76.000 C 42.924 93.923 17.908 133.009 18.000 176.000 C 18.000 179.314 20.686 182.000 24.000 182.000 L 90.000 182.000 L 90.000 184.000 C 90.000 204.987 107.013 222.000 128.000 222.000 C 148.987 222.000 166.000 204.987 166.000 184.000 L 166.000 182.000 L 232.000 182.000 C 235.314 182.000 238.000 179.314 238.000 176.000 C 238.072 133.028 213.060 93.966 174.000 76.050 ZM 154.000 184.000 C 154.000 198.359 142.359 210.000 128.000 210.000 C 113.641 210.000 102.000 198.359 102.000 184.000 L 102.000 182.000 L 154.000 182.000 ZM 30.180 170.000 C 32.403 132.650 55.750 99.846 90.310 85.510 C 92.535 84.582 93.989 82.411 94.000 80.000 L 94.000 72.000 C 94.000 70.895 94.895 70.000 96.000 70.000 L 160.000 70.000 C 161.105 70.000 162.000 70.895 162.000 72.000 L 162.000 80.000 C 161.999 82.422 163.455 84.607 165.690 85.540 C 200.241 99.871 223.585 132.662 225.820 170.000 Z"),
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
        return _lampPendant!!
    }

private var _lampPendant: ImageVector? = null
