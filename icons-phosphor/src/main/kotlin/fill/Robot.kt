package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorFillIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 48.000 L 136.000 48.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 48.000 L 56.000 48.000 C 38.327 48.000 24.000 62.327 24.000 80.000 L 24.000 192.000 C 24.000 209.673 38.327 224.000 56.000 224.000 L 200.000 224.000 C 217.673 224.000 232.000 209.673 232.000 192.000 L 232.000 80.000 C 232.000 62.327 217.673 48.000 200.000 48.000 ZM 172.000 96.000 C 178.627 96.000 184.000 101.373 184.000 108.000 C 184.000 114.627 178.627 120.000 172.000 120.000 C 165.373 120.000 160.000 114.627 160.000 108.000 C 160.000 101.373 165.373 96.000 172.000 96.000 ZM 96.000 184.000 L 80.000 184.000 C 71.163 184.000 64.000 176.837 64.000 168.000 C 64.000 159.163 71.163 152.000 80.000 152.000 L 96.000 152.000 ZM 84.000 120.000 C 77.373 120.000 72.000 114.627 72.000 108.000 C 72.000 101.373 77.373 96.000 84.000 96.000 C 90.627 96.000 96.000 101.373 96.000 108.000 C 96.000 114.627 90.627 120.000 84.000 120.000 ZM 144.000 184.000 L 112.000 184.000 L 112.000 152.000 L 144.000 152.000 ZM 176.000 184.000 L 160.000 184.000 L 160.000 152.000 L 176.000 152.000 C 184.837 152.000 192.000 159.163 192.000 168.000 C 192.000 176.837 184.837 184.000 176.000 184.000 Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
