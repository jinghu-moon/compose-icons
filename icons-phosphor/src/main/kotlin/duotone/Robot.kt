package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Robot: ImageVector
    get() {
        if (_robot != null) return _robot!!
        _robot = phosphorDuotoneIcon(
            name = "Robot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 56.000 L 56.000 56.000 C 42.745 56.000 32.000 66.745 32.000 80.000 L 32.000 192.000 C 32.000 205.255 42.745 216.000 56.000 216.000 L 200.000 216.000 C 213.255 216.000 224.000 205.255 224.000 192.000 L 224.000 80.000 C 224.000 66.745 213.255 56.000 200.000 56.000 ZM 164.000 184.000 L 92.000 184.000 C 80.954 184.000 72.000 175.046 72.000 164.000 C 72.000 152.954 80.954 144.000 92.000 144.000 L 164.000 144.000 C 175.046 144.000 184.000 152.954 184.000 164.000 C 184.000 175.046 175.046 184.000 164.000 184.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 200.000 48.000 L 136.000 48.000 L 136.000 16.000 C 136.000 11.582 132.418 8.000 128.000 8.000 C 123.582 8.000 120.000 11.582 120.000 16.000 L 120.000 48.000 L 56.000 48.000 C 38.327 48.000 24.000 62.327 24.000 80.000 L 24.000 192.000 C 24.000 209.673 38.327 224.000 56.000 224.000 L 200.000 224.000 C 217.673 224.000 232.000 209.673 232.000 192.000 L 232.000 80.000 C 232.000 62.327 217.673 48.000 200.000 48.000 ZM 216.000 192.000 C 216.000 200.837 208.837 208.000 200.000 208.000 L 56.000 208.000 C 47.163 208.000 40.000 200.837 40.000 192.000 L 40.000 80.000 C 40.000 71.163 47.163 64.000 56.000 64.000 L 200.000 64.000 C 208.837 64.000 216.000 71.163 216.000 80.000 ZM 72.000 108.000 C 72.000 101.373 77.373 96.000 84.000 96.000 C 90.627 96.000 96.000 101.373 96.000 108.000 C 96.000 114.627 90.627 120.000 84.000 120.000 C 77.373 120.000 72.000 114.627 72.000 108.000 ZM 160.000 108.000 C 160.000 101.373 165.373 96.000 172.000 96.000 C 178.627 96.000 184.000 101.373 184.000 108.000 C 184.000 114.627 178.627 120.000 172.000 120.000 C 165.373 120.000 160.000 114.627 160.000 108.000 ZM 164.000 136.000 L 92.000 136.000 C 76.536 136.000 64.000 148.536 64.000 164.000 C 64.000 179.464 76.536 192.000 92.000 192.000 L 164.000 192.000 C 179.464 192.000 192.000 179.464 192.000 164.000 C 192.000 148.536 179.464 136.000 164.000 136.000 ZM 140.000 152.000 L 140.000 176.000 L 116.000 176.000 L 116.000 152.000 ZM 80.000 164.000 C 80.000 157.373 85.373 152.000 92.000 152.000 L 100.000 152.000 L 100.000 176.000 L 92.000 176.000 C 85.373 176.000 80.000 170.627 80.000 164.000 ZM 164.000 176.000 L 156.000 176.000 L 156.000 152.000 L 164.000 152.000 C 170.627 152.000 176.000 157.373 176.000 164.000 C 176.000 170.627 170.627 176.000 164.000 176.000 Z"),
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
        return _robot!!
    }

private var _robot: ImageVector? = null
