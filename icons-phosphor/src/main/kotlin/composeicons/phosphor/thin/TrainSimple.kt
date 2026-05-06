package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorThinIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 28h-112C56.536 28 44 40.536 44 56v128c0 15.464 12.536 28 28 28h16L68.8 237.6c-1.325 1.767-.967 4.275 .8 5.6 1.767 1.325 4.275 .967 5.6-.8L98 212h60l22.8 30.4c1.325 1.767 3.833 2.125 5.6 .8 1.767-1.325 2.125-3.833 .8-5.6L168 212h16c15.464 0 28-12.536 28-28v-128C212 40.536 199.464 28 184 28ZM72 36h112c11.046 0 20 8.954 20 20v68h-152v-68C52 44.954 60.954 36 72 36ZM184 204h-112C60.954 204 52 195.046 52 184v-52h152v52c0 11.046-8.954 20-20 20ZM92 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM180 172c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
