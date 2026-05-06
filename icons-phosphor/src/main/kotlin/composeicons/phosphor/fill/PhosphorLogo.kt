package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorFillIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 32h-80c-4.418 0-8 3.582-8 8v128c.05 44.162 35.838 79.95 80 80 4.418 0 8-3.582 8-8v-64c39.764 0 72-32.236 72-72C224 64.235 191.764 32 152 32ZM136 231.5C107.023 227.795 84.209 204.978 80.51 176h55.49ZM136 137.5 85.68 48h50.32ZM152 160v-112c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
