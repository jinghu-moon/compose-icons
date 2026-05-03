package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorBoldIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 108.000 C 238.627 108.000 244.000 102.627 244.000 96.000 L 244.000 64.000 C 244.000 52.954 235.046 44.000 224.000 44.000 L 32.000 44.000 C 20.954 44.000 12.000 52.954 12.000 64.000 L 12.000 96.000 C 12.000 102.627 17.373 108.000 24.000 108.000 C 35.046 108.000 44.000 116.954 44.000 128.000 C 44.000 139.046 35.046 148.000 24.000 148.000 C 17.373 148.000 12.000 153.373 12.000 160.000 L 12.000 192.000 C 12.000 203.046 20.954 212.000 32.000 212.000 L 224.000 212.000 C 235.046 212.000 244.000 203.046 244.000 192.000 L 244.000 160.000 C 244.000 153.373 238.627 148.000 232.000 148.000 C 220.954 148.000 212.000 139.046 212.000 128.000 C 212.000 116.954 220.954 108.000 232.000 108.000 ZM 36.000 170.340 C 54.947 164.983 68.028 147.690 68.028 128.000 C 68.028 108.310 54.947 91.017 36.000 85.660 L 36.000 68.000 L 88.000 68.000 L 88.000 188.000 L 36.000 188.000 ZM 220.000 170.340 L 220.000 188.000 L 112.000 188.000 L 112.000 68.000 L 220.000 68.000 L 220.000 85.660 C 201.053 91.017 187.972 108.310 187.972 128.000 C 187.972 147.690 201.053 164.983 220.000 170.340 Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
