package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorLightIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 26c-3.314 0-6 2.686-6 6v34h-116v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v192c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h116v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-192c0-3.314-2.686-6-6-6ZM186 78v44h-116v-44ZM70 178v-44h116v44Z"),
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
