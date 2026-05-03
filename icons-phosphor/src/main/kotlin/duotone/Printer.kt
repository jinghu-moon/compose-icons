package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorDuotoneIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 232.000 96.000 L 232.000 176.000 L 192.000 176.000 L 192.000 152.000 L 64.000 152.000 L 64.000 176.000 L 24.000 176.000 L 24.000 96.000 C 24.000 87.160 31.760 80.000 41.330 80.000 L 214.670 80.000 C 224.240 80.000 232.000 87.160 232.000 96.000 Z"),
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
        pathData = parseSvgPathData("M 214.670 72.000 L 200.000 72.000 L 200.000 40.000 C 200.000 35.582 196.418 32.000 192.000 32.000 L 64.000 32.000 C 59.582 32.000 56.000 35.582 56.000 40.000 L 56.000 72.000 L 41.330 72.000 C 27.360 72.000 16.000 82.770 16.000 96.000 L 16.000 176.000 C 16.000 180.418 19.582 184.000 24.000 184.000 L 56.000 184.000 L 56.000 216.000 C 56.000 220.418 59.582 224.000 64.000 224.000 L 192.000 224.000 C 196.418 224.000 200.000 220.418 200.000 216.000 L 200.000 184.000 L 232.000 184.000 C 236.418 184.000 240.000 180.418 240.000 176.000 L 240.000 96.000 C 240.000 82.770 228.640 72.000 214.670 72.000 ZM 72.000 48.000 L 184.000 48.000 L 184.000 72.000 L 72.000 72.000 ZM 184.000 208.000 L 72.000 208.000 L 72.000 160.000 L 184.000 160.000 ZM 224.000 168.000 L 200.000 168.000 L 200.000 152.000 C 200.000 147.582 196.418 144.000 192.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 147.582 56.000 152.000 L 56.000 168.000 L 32.000 168.000 L 32.000 96.000 C 32.000 91.590 36.190 88.000 41.330 88.000 L 214.670 88.000 C 219.810 88.000 224.000 91.590 224.000 96.000 ZM 200.000 116.000 C 200.000 122.627 194.627 128.000 188.000 128.000 C 181.373 128.000 176.000 122.627 176.000 116.000 C 176.000 109.373 181.373 104.000 188.000 104.000 C 194.627 104.000 200.000 109.373 200.000 116.000 Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
