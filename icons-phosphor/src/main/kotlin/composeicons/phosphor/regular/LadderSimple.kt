package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorRegularIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 24c-4.418 0-8 3.582-8 8v32h-112v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v192c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h112v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-192c0-4.418-3.582-8-8-8ZM184 80v40h-112v-40ZM72 176v-40h112v40Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
