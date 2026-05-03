package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorBoldIcon(
            name = "CaretCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 128.000 212.000 C 81.608 212.000 44.000 174.392 44.000 128.000 C 44.000 81.608 81.608 44.000 128.000 44.000 C 174.392 44.000 212.000 81.608 212.000 128.000 C 211.950 174.371 174.371 211.950 128.000 212.000 ZM 152.490 96.490 L 121.000 128.000 L 152.520 159.510 C 157.214 164.204 157.214 171.816 152.520 176.510 C 147.826 181.204 140.214 181.204 135.520 176.510 L 95.520 136.510 C 93.261 134.258 91.991 131.200 91.991 128.010 C 91.991 124.820 93.261 121.762 95.520 119.510 L 135.520 79.510 C 140.214 74.816 147.826 74.816 152.520 79.510 C 157.214 84.204 157.214 91.816 152.520 96.510 Z"),
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
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
