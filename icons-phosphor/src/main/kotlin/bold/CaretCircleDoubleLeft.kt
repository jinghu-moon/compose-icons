package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorBoldIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.400 51.600 C 162.214 9.450 93.849 9.469 51.687 51.643 C 9.524 93.817 9.524 162.183 51.687 204.357 C 93.849 246.531 162.214 246.550 204.400 204.400 C 246.532 162.179 246.532 93.821 204.400 51.600 ZM 187.400 187.420 C 154.589 220.205 101.415 220.192 68.621 187.389 C 35.828 154.587 35.828 101.413 68.621 68.611 C 101.415 35.808 154.589 35.795 187.400 68.580 C 220.174 101.411 220.183 154.578 187.420 187.420 ZM 176.490 104.470 L 153.000 128.000 L 176.530 151.530 C 181.224 156.224 181.224 163.836 176.530 168.530 C 171.836 173.224 164.224 173.224 159.530 168.530 L 127.530 136.530 C 125.271 134.278 124.001 131.220 124.001 128.030 C 124.001 124.840 125.271 121.782 127.530 119.530 L 159.530 87.530 C 164.224 82.836 171.836 82.836 176.530 87.530 C 181.224 92.224 181.224 99.836 176.530 104.530 ZM 120.490 104.470 L 97.000 128.000 L 120.520 151.530 C 125.214 156.224 125.214 163.836 120.520 168.530 C 115.826 173.224 108.214 173.224 103.520 168.530 L 71.520 136.530 C 69.261 134.278 67.991 131.220 67.991 128.030 C 67.991 124.840 69.261 121.782 71.520 119.530 L 103.520 87.530 C 108.214 82.836 115.826 82.836 120.520 87.530 C 125.214 92.224 125.214 99.836 120.520 104.530 Z"),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
