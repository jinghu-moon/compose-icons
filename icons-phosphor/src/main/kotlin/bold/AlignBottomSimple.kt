package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorBoldIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 232.000 C 212.000 238.627 206.627 244.000 200.000 244.000 L 56.000 244.000 C 49.373 244.000 44.000 238.627 44.000 232.000 C 44.000 225.373 49.373 220.000 56.000 220.000 L 200.000 220.000 C 206.627 220.000 212.000 225.373 212.000 232.000 ZM 76.000 184.000 L 76.000 40.000 C 76.000 28.954 84.954 20.000 96.000 20.000 L 160.000 20.000 C 171.046 20.000 180.000 28.954 180.000 40.000 L 180.000 184.000 C 180.000 195.046 171.046 204.000 160.000 204.000 L 96.000 204.000 C 84.954 204.000 76.000 195.046 76.000 184.000 ZM 100.000 180.000 L 156.000 180.000 L 156.000 44.000 L 100.000 44.000 Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
