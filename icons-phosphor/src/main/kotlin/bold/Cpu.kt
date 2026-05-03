package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorBoldIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 88.000 L 100.000 88.000 C 93.373 88.000 88.000 93.373 88.000 100.000 L 88.000 156.000 C 88.000 162.627 93.373 168.000 100.000 168.000 L 156.000 168.000 C 162.627 168.000 168.000 162.627 168.000 156.000 L 168.000 100.000 C 168.000 93.373 162.627 88.000 156.000 88.000 ZM 144.000 144.000 L 112.000 144.000 L 112.000 112.000 L 144.000 112.000 ZM 232.000 140.000 L 220.000 140.000 L 220.000 116.000 L 232.000 116.000 C 238.627 116.000 244.000 110.627 244.000 104.000 C 244.000 97.373 238.627 92.000 232.000 92.000 L 220.000 92.000 L 220.000 56.000 C 220.000 44.954 211.046 36.000 200.000 36.000 L 164.000 36.000 L 164.000 24.000 C 164.000 17.373 158.627 12.000 152.000 12.000 C 145.373 12.000 140.000 17.373 140.000 24.000 L 140.000 36.000 L 116.000 36.000 L 116.000 24.000 C 116.000 17.373 110.627 12.000 104.000 12.000 C 97.373 12.000 92.000 17.373 92.000 24.000 L 92.000 36.000 L 56.000 36.000 C 44.954 36.000 36.000 44.954 36.000 56.000 L 36.000 92.000 L 24.000 92.000 C 17.373 92.000 12.000 97.373 12.000 104.000 C 12.000 110.627 17.373 116.000 24.000 116.000 L 36.000 116.000 L 36.000 140.000 L 24.000 140.000 C 17.373 140.000 12.000 145.373 12.000 152.000 C 12.000 158.627 17.373 164.000 24.000 164.000 L 36.000 164.000 L 36.000 200.000 C 36.000 211.046 44.954 220.000 56.000 220.000 L 92.000 220.000 L 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 C 110.627 244.000 116.000 238.627 116.000 232.000 L 116.000 220.000 L 140.000 220.000 L 140.000 232.000 C 140.000 238.627 145.373 244.000 152.000 244.000 C 158.627 244.000 164.000 238.627 164.000 232.000 L 164.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 164.000 L 232.000 164.000 C 238.627 164.000 244.000 158.627 244.000 152.000 C 244.000 145.373 238.627 140.000 232.000 140.000 ZM 196.000 196.000 L 60.000 196.000 L 60.000 60.000 L 196.000 60.000 Z"),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
