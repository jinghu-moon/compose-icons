package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorBoldIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 36.000 C 193.373 36.000 188.000 41.373 188.000 48.000 C 188.000 54.627 193.373 60.000 200.000 60.000 C 206.627 60.000 212.000 65.373 212.000 72.000 L 212.000 122.460 C 199.654 115.305 184.762 114.022 171.374 118.960 C 157.987 123.898 147.494 134.542 142.750 148.000 L 113.250 148.000 C 108.506 134.542 98.013 123.898 84.626 118.960 C 71.238 114.022 56.346 115.305 44.000 122.460 L 44.000 72.000 C 44.000 65.373 49.373 60.000 56.000 60.000 C 62.627 60.000 68.000 54.627 68.000 48.000 C 68.000 41.373 62.627 36.000 56.000 36.000 C 36.118 36.000 20.000 52.118 20.000 72.000 L 20.000 164.000 C 20.026 188.934 39.139 209.696 63.986 211.781 C 88.832 213.866 111.138 196.581 115.320 172.000 L 140.680 172.000 C 144.862 196.581 167.168 213.866 192.014 211.781 C 216.861 209.696 235.974 188.934 236.000 164.000 L 236.000 72.000 C 236.000 52.118 219.882 36.000 200.000 36.000 ZM 68.000 188.000 C 54.745 188.000 44.000 177.255 44.000 164.000 C 44.000 150.745 54.745 140.000 68.000 140.000 C 81.255 140.000 92.000 150.745 92.000 164.000 C 92.000 177.255 81.255 188.000 68.000 188.000 ZM 188.000 188.000 C 174.745 188.000 164.000 177.255 164.000 164.000 C 164.000 150.745 174.745 140.000 188.000 140.000 C 201.255 140.000 212.000 150.745 212.000 164.000 C 212.000 177.255 201.255 188.000 188.000 188.000 Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
