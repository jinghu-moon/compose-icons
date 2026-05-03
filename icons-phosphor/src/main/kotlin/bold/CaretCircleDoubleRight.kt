package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorBoldIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.400 51.600 C 162.214 9.450 93.849 9.469 51.687 51.643 C 9.524 93.817 9.524 162.183 51.687 204.357 C 93.849 246.531 162.214 246.550 204.400 204.400 C 246.532 162.179 246.532 93.821 204.400 51.600 ZM 187.400 187.420 C 154.589 220.205 101.415 220.192 68.621 187.389 C 35.828 154.587 35.828 101.413 68.621 68.611 C 101.415 35.808 154.589 35.795 187.400 68.580 C 220.174 101.411 220.183 154.578 187.420 187.420 ZM 128.470 119.510 C 130.729 121.762 131.999 124.820 131.999 128.010 C 131.999 131.200 130.729 134.258 128.470 136.510 L 96.470 168.510 C 91.776 173.204 84.164 173.204 79.470 168.510 C 74.776 163.816 74.776 156.204 79.470 151.510 L 103.000 128.000 L 79.490 104.470 C 74.796 99.776 74.796 92.164 79.490 87.470 C 84.184 82.776 91.796 82.776 96.490 87.470 ZM 184.470 136.510 L 152.470 168.510 C 147.776 173.204 140.164 173.204 135.470 168.510 C 130.776 163.816 130.776 156.204 135.470 151.510 L 159.000 128.000 L 135.480 104.470 C 130.786 99.776 130.786 92.164 135.480 87.470 C 140.174 82.776 147.786 82.776 152.480 87.470 L 184.480 119.470 C 186.750 121.718 188.029 124.779 188.035 127.974 C 188.040 131.168 186.772 134.234 184.510 136.490 Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
