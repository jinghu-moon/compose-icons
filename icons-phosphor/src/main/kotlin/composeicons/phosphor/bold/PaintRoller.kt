package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorBoldIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 84h-20v-20C212 52.954 203.046 44 192 44h-140C40.954 44 32 52.954 32 64v20h-16C9.373 84 4 89.373 4 96c0 6.627 5.373 12 12 12h16v20c0 11.046 8.954 20 20 20h140c11.046 0 20-8.954 20-20v-20h16v47l-97.5 27.8C121.945 185.278 116.043 193.093 116 202v30c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-26.95l97.5-27.85C246.055 174.722 251.957 166.907 252 158v-54C252 92.954 243.046 84 232 84ZM188 124h-132v-56h132Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
