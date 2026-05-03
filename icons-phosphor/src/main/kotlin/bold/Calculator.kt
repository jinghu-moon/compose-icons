package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = phosphorBoldIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 20.000 L 56.000 20.000 C 44.954 20.000 36.000 28.954 36.000 40.000 L 36.000 216.000 C 36.000 227.046 44.954 236.000 56.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 196.000 212.000 L 60.000 212.000 L 60.000 44.000 L 196.000 44.000 ZM 80.000 76.000 C 80.000 69.373 85.373 64.000 92.000 64.000 L 164.000 64.000 C 170.627 64.000 176.000 69.373 176.000 76.000 C 176.000 82.627 170.627 88.000 164.000 88.000 L 92.000 88.000 C 85.373 88.000 80.000 82.627 80.000 76.000 ZM 120.000 128.000 C 120.000 136.837 112.837 144.000 104.000 144.000 C 95.163 144.000 88.000 136.837 88.000 128.000 C 88.000 119.163 95.163 112.000 104.000 112.000 C 112.837 112.000 120.000 119.163 120.000 128.000 ZM 168.000 128.000 C 168.000 136.837 160.837 144.000 152.000 144.000 C 143.163 144.000 136.000 136.837 136.000 128.000 C 136.000 119.163 143.163 112.000 152.000 112.000 C 160.837 112.000 168.000 119.163 168.000 128.000 ZM 120.000 176.000 C 120.000 184.837 112.837 192.000 104.000 192.000 C 95.163 192.000 88.000 184.837 88.000 176.000 C 88.000 167.163 95.163 160.000 104.000 160.000 C 112.837 160.000 120.000 167.163 120.000 176.000 ZM 168.000 176.000 C 168.000 184.837 160.837 192.000 152.000 192.000 C 143.163 192.000 136.000 184.837 136.000 176.000 C 136.000 167.163 143.163 160.000 152.000 160.000 C 160.837 160.000 168.000 167.163 168.000 176.000 Z"),
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
        return _calculator!!
    }

private var _calculator: ImageVector? = null
