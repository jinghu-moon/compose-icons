package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorBoldIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 80.000 C 176.000 73.373 181.373 68.000 188.000 68.000 L 216.000 68.000 C 222.627 68.000 228.000 73.373 228.000 80.000 C 228.000 86.627 222.627 92.000 216.000 92.000 L 188.000 92.000 C 181.373 92.000 176.000 86.627 176.000 80.000 ZM 40.000 92.000 L 136.000 92.000 L 136.000 104.000 C 136.000 110.627 141.373 116.000 148.000 116.000 C 154.627 116.000 160.000 110.627 160.000 104.000 L 160.000 56.000 C 160.000 49.373 154.627 44.000 148.000 44.000 C 141.373 44.000 136.000 49.373 136.000 56.000 L 136.000 68.000 L 40.000 68.000 C 33.373 68.000 28.000 73.373 28.000 80.000 C 28.000 86.627 33.373 92.000 40.000 92.000 ZM 216.000 164.000 L 124.000 164.000 C 117.373 164.000 112.000 169.373 112.000 176.000 C 112.000 182.627 117.373 188.000 124.000 188.000 L 216.000 188.000 C 222.627 188.000 228.000 182.627 228.000 176.000 C 228.000 169.373 222.627 164.000 216.000 164.000 ZM 84.000 140.000 C 77.373 140.000 72.000 145.373 72.000 152.000 L 72.000 164.000 L 40.000 164.000 C 33.373 164.000 28.000 169.373 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 L 72.000 188.000 L 72.000 200.000 C 72.000 206.627 77.373 212.000 84.000 212.000 C 90.627 212.000 96.000 206.627 96.000 200.000 L 96.000 152.000 C 96.000 145.373 90.627 140.000 84.000 140.000 Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
