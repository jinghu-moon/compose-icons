package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorBoldIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.400 51.600 C 162.214 9.450 93.849 9.469 51.687 51.643 C 9.524 93.817 9.524 162.183 51.687 204.357 C 93.849 246.531 162.214 246.550 204.400 204.400 C 246.532 162.179 246.532 93.821 204.400 51.600 ZM 187.400 187.420 C 154.589 220.205 101.415 220.192 68.621 187.389 C 35.828 154.587 35.828 101.413 68.621 68.611 C 101.415 35.808 154.589 35.795 187.400 68.580 C 220.174 101.411 220.183 154.578 187.420 187.420 ZM 168.500 79.490 C 170.759 81.742 172.029 84.800 172.029 87.990 C 172.029 91.180 170.759 94.238 168.500 96.490 L 136.500 128.490 C 134.248 130.749 131.190 132.019 128.000 132.019 C 124.810 132.019 121.752 130.749 119.500 128.490 L 87.500 96.490 C 82.806 91.796 82.806 84.184 87.500 79.490 C 92.194 74.796 99.806 74.796 104.500 79.490 L 128.000 103.000 L 151.530 79.470 C 156.222 74.790 163.819 74.799 168.500 79.490 ZM 168.500 135.490 C 170.759 137.742 172.029 140.800 172.029 143.990 C 172.029 147.180 170.759 150.238 168.500 152.490 L 136.500 184.490 C 134.248 186.749 131.190 188.019 128.000 188.019 C 124.810 188.019 121.752 186.749 119.500 184.490 L 87.500 152.490 C 82.806 147.796 82.806 140.184 87.500 135.490 C 92.194 130.796 99.806 130.796 104.500 135.490 L 128.000 159.000 L 151.530 135.480 C 156.227 130.805 163.825 130.823 168.500 135.520 Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
