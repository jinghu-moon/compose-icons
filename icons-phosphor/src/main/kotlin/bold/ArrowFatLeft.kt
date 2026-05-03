package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorBoldIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 68.000 L 132.000 68.000 L 132.000 32.000 C 132.000 27.145 129.075 22.769 124.589 20.913 C 120.103 19.056 114.941 20.085 111.510 23.520 L 15.510 119.520 C 13.251 121.772 11.981 124.830 11.981 128.020 C 11.981 131.210 13.251 134.268 15.510 136.520 L 111.510 232.520 C 114.946 235.960 120.118 236.987 124.607 235.120 C 129.097 233.253 132.016 228.862 132.000 224.000 L 132.000 188.000 L 208.000 188.000 C 219.046 188.000 228.000 179.046 228.000 168.000 L 228.000 88.000 C 228.000 76.954 219.046 68.000 208.000 68.000 ZM 204.000 164.000 L 120.000 164.000 C 113.373 164.000 108.000 169.373 108.000 176.000 L 108.000 195.000 L 41.000 128.000 L 108.000 61.000 L 108.000 80.000 C 108.000 86.627 113.373 92.000 120.000 92.000 L 204.000 92.000 Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
