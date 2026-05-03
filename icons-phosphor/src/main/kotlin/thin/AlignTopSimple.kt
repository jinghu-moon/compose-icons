package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorThinIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 32.000 C 204.000 34.209 202.209 36.000 200.000 36.000 L 56.000 36.000 C 53.791 36.000 52.000 34.209 52.000 32.000 C 52.000 29.791 53.791 28.000 56.000 28.000 L 200.000 28.000 C 202.209 28.000 204.000 29.791 204.000 32.000 ZM 172.000 72.000 L 172.000 224.000 C 172.000 230.627 166.627 236.000 160.000 236.000 L 96.000 236.000 C 89.373 236.000 84.000 230.627 84.000 224.000 L 84.000 72.000 C 84.000 65.373 89.373 60.000 96.000 60.000 L 160.000 60.000 C 166.627 60.000 172.000 65.373 172.000 72.000 ZM 164.000 72.000 C 164.000 69.791 162.209 68.000 160.000 68.000 L 96.000 68.000 C 93.791 68.000 92.000 69.791 92.000 72.000 L 92.000 224.000 C 92.000 226.209 93.791 228.000 96.000 228.000 L 160.000 228.000 C 162.209 228.000 164.000 226.209 164.000 224.000 Z"),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
