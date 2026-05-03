package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorBoldIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 36.000 C 72.772 36.000 28.000 80.772 28.000 136.000 C 28.000 191.228 72.772 236.000 128.000 236.000 C 183.228 236.000 228.000 191.228 228.000 136.000 C 227.939 80.797 183.203 36.061 128.000 36.000 ZM 128.000 212.000 C 86.026 212.000 52.000 177.974 52.000 136.000 C 52.000 94.026 86.026 60.000 128.000 60.000 C 169.974 60.000 204.000 94.026 204.000 136.000 C 203.956 177.955 169.955 211.956 128.000 212.000 ZM 32.490 72.490 C 27.796 77.184 20.184 77.184 15.490 72.490 C 10.796 67.796 10.796 60.184 15.490 55.490 L 47.490 23.490 C 52.184 18.796 59.796 18.796 64.490 23.490 C 69.184 28.184 69.184 35.796 64.490 40.490 ZM 240.490 72.490 C 238.238 74.749 235.180 76.019 231.990 76.019 C 228.800 76.019 225.742 74.749 223.490 72.490 L 191.490 40.490 C 186.796 35.796 186.796 28.184 191.490 23.490 C 196.184 18.796 203.796 18.796 208.490 23.490 L 240.490 55.490 C 242.749 57.742 244.019 60.800 244.019 63.990 C 244.019 67.180 242.749 70.238 240.490 72.490 ZM 176.000 124.000 C 182.627 124.000 188.000 129.373 188.000 136.000 C 188.000 142.627 182.627 148.000 176.000 148.000 L 128.000 148.000 C 121.373 148.000 116.000 142.627 116.000 136.000 L 116.000 88.000 C 116.000 81.373 121.373 76.000 128.000 76.000 C 134.627 76.000 140.000 81.373 140.000 88.000 L 140.000 124.000 Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
