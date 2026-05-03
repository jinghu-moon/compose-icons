package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppWindow: ImageVector
    get() {
        if (_appWindow != null) return _appWindow!!
        _appWindow = phosphorBoldIcon(
            name = "AppWindow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 36.000 L 40.000 36.000 C 28.954 36.000 20.000 44.954 20.000 56.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 216.000 220.000 C 227.046 220.000 236.000 211.046 236.000 200.000 L 236.000 56.000 C 236.000 44.954 227.046 36.000 216.000 36.000 ZM 212.000 196.000 L 44.000 196.000 L 44.000 60.000 L 212.000 60.000 ZM 60.000 92.000 C 60.000 83.163 67.163 76.000 76.000 76.000 C 84.837 76.000 92.000 83.163 92.000 92.000 C 92.000 100.837 84.837 108.000 76.000 108.000 C 67.163 108.000 60.000 100.837 60.000 92.000 ZM 108.000 92.000 C 108.000 83.163 115.163 76.000 124.000 76.000 C 132.837 76.000 140.000 83.163 140.000 92.000 C 140.000 100.837 132.837 108.000 124.000 108.000 C 115.163 108.000 108.000 100.837 108.000 92.000 Z"),
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
        return _appWindow!!
    }

private var _appWindow: ImageVector? = null
