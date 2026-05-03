package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorBoldIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 44.000 C 232.000 50.627 226.627 56.000 220.000 56.000 L 60.000 56.000 C 53.373 56.000 48.000 50.627 48.000 44.000 C 48.000 37.373 53.373 32.000 60.000 32.000 L 220.000 32.000 C 226.627 32.000 232.000 37.373 232.000 44.000 ZM 176.000 88.000 C 176.000 81.373 170.627 76.000 164.000 76.000 L 44.000 76.000 C 37.373 76.000 32.000 81.373 32.000 88.000 C 32.000 94.627 37.373 100.000 44.000 100.000 L 164.000 100.000 C 170.627 100.000 176.000 94.627 176.000 88.000 ZM 176.000 132.000 C 176.000 125.373 170.627 120.000 164.000 120.000 L 76.000 120.000 C 69.373 120.000 64.000 125.373 64.000 132.000 C 64.000 138.627 69.373 144.000 76.000 144.000 L 164.000 144.000 C 170.627 144.000 176.000 138.627 176.000 132.000 ZM 172.000 164.000 L 132.000 164.000 C 125.373 164.000 120.000 169.373 120.000 176.000 C 120.000 182.627 125.373 188.000 132.000 188.000 L 172.000 188.000 C 178.627 188.000 184.000 182.627 184.000 176.000 C 184.000 169.373 178.627 164.000 172.000 164.000 ZM 140.000 208.000 L 124.000 208.000 C 117.373 208.000 112.000 213.373 112.000 220.000 C 112.000 226.627 117.373 232.000 124.000 232.000 L 140.000 232.000 C 146.627 232.000 152.000 226.627 152.000 220.000 C 152.000 213.373 146.627 208.000 140.000 208.000 Z"),
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
        return _tornado!!
    }

private var _tornado: ImageVector? = null
