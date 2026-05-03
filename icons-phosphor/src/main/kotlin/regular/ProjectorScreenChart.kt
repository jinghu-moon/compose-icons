package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorRegularIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 144.000 L 88.000 128.000 C 88.000 123.582 91.582 120.000 96.000 120.000 C 100.418 120.000 104.000 123.582 104.000 128.000 L 104.000 144.000 C 104.000 148.418 100.418 152.000 96.000 152.000 C 91.582 152.000 88.000 148.418 88.000 144.000 ZM 128.000 152.000 C 132.418 152.000 136.000 148.418 136.000 144.000 L 136.000 120.000 C 136.000 115.582 132.418 112.000 128.000 112.000 C 123.582 112.000 120.000 115.582 120.000 120.000 L 120.000 144.000 C 120.000 148.418 123.582 152.000 128.000 152.000 ZM 160.000 152.000 C 164.418 152.000 168.000 148.418 168.000 144.000 L 168.000 112.000 C 168.000 107.582 164.418 104.000 160.000 104.000 C 155.582 104.000 152.000 107.582 152.000 112.000 L 152.000 144.000 C 152.000 148.418 155.582 152.000 160.000 152.000 ZM 216.000 80.000 L 216.000 176.000 L 224.000 176.000 C 228.418 176.000 232.000 179.582 232.000 184.000 C 232.000 188.418 228.418 192.000 224.000 192.000 L 136.000 192.000 L 136.000 209.380 C 147.020 213.276 153.631 224.545 151.654 236.066 C 149.678 247.586 139.689 256.007 128.000 256.007 C 116.311 256.007 106.322 247.586 104.346 236.066 C 102.369 224.545 108.980 213.276 120.000 209.380 L 120.000 192.000 L 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 C 24.000 179.582 27.582 176.000 32.000 176.000 L 40.000 176.000 L 40.000 80.000 C 31.163 80.000 24.000 72.837 24.000 64.000 L 24.000 48.000 C 24.000 39.163 31.163 32.000 40.000 32.000 L 216.000 32.000 C 224.837 32.000 232.000 39.163 232.000 48.000 L 232.000 64.000 C 232.000 72.837 224.837 80.000 216.000 80.000 ZM 136.000 232.000 C 136.000 227.582 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 227.582 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 ZM 40.000 64.000 L 216.000 64.000 L 216.000 48.000 L 40.000 48.000 ZM 200.000 80.000 L 56.000 80.000 L 56.000 176.000 L 200.000 176.000 Z"),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
