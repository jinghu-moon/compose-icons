package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorDuotoneIcon(
            name = "DiceFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 64.000 L 216.000 192.000 C 216.000 205.255 205.255 216.000 192.000 216.000 L 64.000 216.000 C 50.745 216.000 40.000 205.255 40.000 192.000 L 40.000 64.000 C 40.000 50.745 50.745 40.000 64.000 40.000 L 192.000 40.000 C 205.255 40.000 216.000 50.745 216.000 64.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 192.000 32.000 L 64.000 32.000 C 46.327 32.000 32.000 46.327 32.000 64.000 L 32.000 192.000 C 32.000 209.673 46.327 224.000 64.000 224.000 L 192.000 224.000 C 209.673 224.000 224.000 209.673 224.000 192.000 L 224.000 64.000 C 224.000 46.327 209.673 32.000 192.000 32.000 ZM 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 L 64.000 208.000 C 55.163 208.000 48.000 200.837 48.000 192.000 L 48.000 64.000 C 48.000 55.163 55.163 48.000 64.000 48.000 L 192.000 48.000 C 200.837 48.000 208.000 55.163 208.000 64.000 ZM 112.000 100.000 C 112.000 106.627 106.627 112.000 100.000 112.000 C 93.373 112.000 88.000 106.627 88.000 100.000 C 88.000 93.373 93.373 88.000 100.000 88.000 C 106.627 88.000 112.000 93.373 112.000 100.000 ZM 168.000 100.000 C 168.000 106.627 162.627 112.000 156.000 112.000 C 149.373 112.000 144.000 106.627 144.000 100.000 C 144.000 93.373 149.373 88.000 156.000 88.000 C 162.627 88.000 168.000 93.373 168.000 100.000 ZM 112.000 156.000 C 112.000 162.627 106.627 168.000 100.000 168.000 C 93.373 168.000 88.000 162.627 88.000 156.000 C 88.000 149.373 93.373 144.000 100.000 144.000 C 106.627 144.000 112.000 149.373 112.000 156.000 ZM 168.000 156.000 C 168.000 162.627 162.627 168.000 156.000 168.000 C 149.373 168.000 144.000 162.627 144.000 156.000 C 144.000 149.373 149.373 144.000 156.000 144.000 C 162.627 144.000 168.000 149.373 168.000 156.000 Z"),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
