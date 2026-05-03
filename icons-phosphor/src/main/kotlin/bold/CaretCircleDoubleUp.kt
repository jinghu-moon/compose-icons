package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorBoldIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.400 51.600 C 162.214 9.450 93.849 9.469 51.687 51.643 C 9.524 93.817 9.524 162.183 51.687 204.357 C 93.849 246.531 162.214 246.550 204.400 204.400 C 246.532 162.179 246.532 93.821 204.400 51.600 ZM 187.400 187.420 C 154.589 220.205 101.415 220.192 68.621 187.389 C 35.828 154.587 35.828 101.413 68.621 68.611 C 101.415 35.808 154.589 35.795 187.400 68.580 C 220.174 101.411 220.183 154.578 187.420 187.420 ZM 168.500 159.530 C 173.194 164.224 173.194 171.836 168.500 176.530 C 163.806 181.224 156.194 181.224 151.500 176.530 L 128.000 153.000 L 104.470 176.530 C 99.776 181.224 92.164 181.224 87.470 176.530 C 82.776 171.836 82.776 164.224 87.470 159.530 L 119.470 127.530 C 121.722 125.271 124.780 124.001 127.970 124.001 C 131.160 124.001 134.218 125.271 136.470 127.530 ZM 168.500 103.530 C 173.194 108.224 173.194 115.836 168.500 120.530 C 163.806 125.224 156.194 125.224 151.500 120.530 L 128.000 97.000 L 104.470 120.520 C 99.776 125.214 92.164 125.214 87.470 120.520 C 82.776 115.826 82.776 108.214 87.470 103.520 L 119.470 71.520 C 121.722 69.261 124.780 67.991 127.970 67.991 C 131.160 67.991 134.218 69.261 136.470 71.520 Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
