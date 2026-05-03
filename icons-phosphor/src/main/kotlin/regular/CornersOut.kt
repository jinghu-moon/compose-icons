package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorRegularIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 48.000 L 216.000 88.000 C 216.000 92.418 212.418 96.000 208.000 96.000 C 203.582 96.000 200.000 92.418 200.000 88.000 L 200.000 56.000 L 168.000 56.000 C 163.582 56.000 160.000 52.418 160.000 48.000 C 160.000 43.582 163.582 40.000 168.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 ZM 88.000 200.000 L 56.000 200.000 L 56.000 168.000 C 56.000 163.582 52.418 160.000 48.000 160.000 C 43.582 160.000 40.000 163.582 40.000 168.000 L 40.000 208.000 C 40.000 212.418 43.582 216.000 48.000 216.000 L 88.000 216.000 C 92.418 216.000 96.000 212.418 96.000 208.000 C 96.000 203.582 92.418 200.000 88.000 200.000 ZM 208.000 160.000 C 203.582 160.000 200.000 163.582 200.000 168.000 L 200.000 200.000 L 168.000 200.000 C 163.582 200.000 160.000 203.582 160.000 208.000 C 160.000 212.418 163.582 216.000 168.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 168.000 C 216.000 163.582 212.418 160.000 208.000 160.000 ZM 88.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 88.000 C 40.000 92.418 43.582 96.000 48.000 96.000 C 52.418 96.000 56.000 92.418 56.000 88.000 L 56.000 56.000 L 88.000 56.000 C 92.418 56.000 96.000 52.418 96.000 48.000 C 96.000 43.582 92.418 40.000 88.000 40.000 Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
