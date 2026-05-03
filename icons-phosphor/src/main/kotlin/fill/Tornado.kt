package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tornado: ImageVector
    get() {
        if (_tornado != null) return _tornado!!
        _tornado = phosphorFillIcon(
            name = "Tornado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 228.000 C 144.000 234.627 138.627 240.000 132.000 240.000 L 116.000 240.000 C 109.373 240.000 104.000 234.627 104.000 228.000 C 104.000 221.373 109.373 216.000 116.000 216.000 L 132.000 216.000 C 138.627 216.000 144.000 221.373 144.000 228.000 ZM 220.000 32.000 L 60.000 32.000 C 53.373 32.000 48.000 37.373 48.000 44.000 C 48.000 50.627 53.373 56.000 60.000 56.000 C 66.627 56.000 72.000 61.373 72.000 68.000 C 72.000 74.627 66.627 80.000 60.000 80.000 L 44.000 80.000 C 37.373 80.000 32.000 85.373 32.000 92.000 C 32.000 98.627 37.373 104.000 44.000 104.000 L 76.000 104.000 C 82.627 104.000 88.000 109.373 88.000 116.000 C 88.000 122.627 82.627 128.000 76.000 128.000 C 69.373 128.000 64.000 133.373 64.000 140.000 C 64.000 146.627 69.373 152.000 76.000 152.000 L 124.000 152.000 C 130.627 152.000 136.000 157.373 136.000 164.000 C 136.000 170.627 130.627 176.000 124.000 176.000 C 117.373 176.000 112.000 181.373 112.000 188.000 C 112.000 194.627 117.373 200.000 124.000 200.000 L 172.000 200.000 C 178.627 200.000 184.000 194.627 184.000 188.000 C 184.000 181.373 178.627 176.000 172.000 176.000 C 165.373 176.000 160.000 170.627 160.000 164.000 C 160.000 157.373 165.373 152.000 172.000 152.000 L 188.000 152.000 C 194.627 152.000 200.000 146.627 200.000 140.000 C 200.000 133.373 194.627 128.000 188.000 128.000 L 164.000 128.000 C 157.373 128.000 152.000 122.627 152.000 116.000 C 152.000 109.373 157.373 104.000 164.000 104.000 C 170.627 104.000 176.000 98.627 176.000 92.000 C 176.000 85.373 170.627 80.000 164.000 80.000 C 157.373 80.000 152.000 74.627 152.000 68.000 C 152.000 61.373 157.373 56.000 164.000 56.000 L 220.000 56.000 C 226.627 56.000 232.000 50.627 232.000 44.000 C 232.000 37.373 226.627 32.000 220.000 32.000 Z"),
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
