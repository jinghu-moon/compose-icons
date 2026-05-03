package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorFillIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 64.000 L 232.000 48.000 C 232.000 39.163 224.837 32.000 216.000 32.000 L 40.000 32.000 C 31.163 32.000 24.000 39.163 24.000 48.000 L 24.000 64.000 C 24.000 72.837 31.163 80.000 40.000 80.000 L 40.000 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 120.000 192.000 L 120.000 209.380 C 108.980 213.276 102.369 224.545 104.346 236.066 C 106.322 247.586 116.311 256.007 128.000 256.007 C 139.689 256.007 149.678 247.586 151.654 236.066 C 153.631 224.545 147.020 213.276 136.000 209.380 L 136.000 192.000 L 224.000 192.000 C 228.418 192.000 232.000 188.418 232.000 184.000 C 232.000 179.582 228.418 176.000 224.000 176.000 L 216.000 176.000 L 216.000 80.000 C 224.837 80.000 232.000 72.837 232.000 64.000 ZM 128.000 240.000 C 123.582 240.000 120.000 236.418 120.000 232.000 C 120.000 227.582 123.582 224.000 128.000 224.000 C 132.418 224.000 136.000 227.582 136.000 232.000 C 136.000 236.418 132.418 240.000 128.000 240.000 ZM 40.000 48.000 L 216.000 48.000 L 216.000 64.000 L 40.000 64.000 Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
