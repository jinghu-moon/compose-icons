package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorDuotoneIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 120.000 L 176.000 192.000 L 80.000 192.000 L 80.000 120.000 Z"),
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
        pathData = parseSvgPathData("M 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 200.000 216.000 L 56.000 216.000 L 56.000 40.000 L 148.690 40.000 L 200.000 91.310 L 200.000 216.000 ZM 176.000 112.000 L 80.000 112.000 C 75.582 112.000 72.000 115.582 72.000 120.000 L 72.000 192.000 C 72.000 196.418 75.582 200.000 80.000 200.000 L 176.000 200.000 C 180.418 200.000 184.000 196.418 184.000 192.000 L 184.000 120.000 C 184.000 115.582 180.418 112.000 176.000 112.000 ZM 168.000 184.000 L 152.000 184.000 L 152.000 152.000 C 152.000 147.582 148.418 144.000 144.000 144.000 C 139.582 144.000 136.000 147.582 136.000 152.000 L 136.000 184.000 L 120.000 184.000 L 120.000 152.000 C 120.000 147.582 116.418 144.000 112.000 144.000 C 107.582 144.000 104.000 147.582 104.000 152.000 L 104.000 184.000 L 88.000 184.000 L 88.000 128.000 L 168.000 128.000 Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
