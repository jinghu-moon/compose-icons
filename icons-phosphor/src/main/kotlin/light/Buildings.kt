package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorLightIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 210.000 L 222.000 210.000 L 222.000 96.000 C 222.000 88.268 215.732 82.000 208.000 82.000 L 142.000 82.000 L 142.000 32.000 C 141.998 26.837 139.154 22.094 134.601 19.660 C 130.048 17.225 124.525 17.495 120.230 20.360 L 40.230 73.690 C 36.336 76.288 33.999 80.659 34.000 85.340 L 34.000 210.000 L 16.000 210.000 C 12.686 210.000 10.000 212.686 10.000 216.000 C 10.000 219.314 12.686 222.000 16.000 222.000 L 240.000 222.000 C 243.314 222.000 246.000 219.314 246.000 216.000 C 246.000 212.686 243.314 210.000 240.000 210.000 ZM 208.000 94.000 C 209.105 94.000 210.000 94.895 210.000 96.000 L 210.000 210.000 L 142.000 210.000 L 142.000 94.000 ZM 46.000 85.340 C 46.001 84.673 46.335 84.050 46.890 83.680 L 126.890 30.340 C 127.503 29.931 128.292 29.892 128.942 30.239 C 129.592 30.586 129.999 31.263 130.000 32.000 L 130.000 210.000 L 46.000 210.000 ZM 110.000 112.000 L 110.000 128.000 C 110.000 131.314 107.314 134.000 104.000 134.000 C 100.686 134.000 98.000 131.314 98.000 128.000 L 98.000 112.000 C 98.000 108.686 100.686 106.000 104.000 106.000 C 107.314 106.000 110.000 108.686 110.000 112.000 ZM 78.000 112.000 L 78.000 128.000 C 78.000 131.314 75.314 134.000 72.000 134.000 C 68.686 134.000 66.000 131.314 66.000 128.000 L 66.000 112.000 C 66.000 108.686 68.686 106.000 72.000 106.000 C 75.314 106.000 78.000 108.686 78.000 112.000 ZM 78.000 168.000 L 78.000 184.000 C 78.000 187.314 75.314 190.000 72.000 190.000 C 68.686 190.000 66.000 187.314 66.000 184.000 L 66.000 168.000 C 66.000 164.686 68.686 162.000 72.000 162.000 C 75.314 162.000 78.000 164.686 78.000 168.000 ZM 110.000 168.000 L 110.000 184.000 C 110.000 187.314 107.314 190.000 104.000 190.000 C 100.686 190.000 98.000 187.314 98.000 184.000 L 98.000 168.000 C 98.000 164.686 100.686 162.000 104.000 162.000 C 107.314 162.000 110.000 164.686 110.000 168.000 Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
