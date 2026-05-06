package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartBarHorizontal: ImageVector
    get() {
        if (_chartBarHorizontal != null) return _chartBarHorizontal!!
        _chartBarHorizontal = phosphorRegularIcon(
            name = "ChartBarHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96h-40v-40c0-4.418-3.582-8-8-8h-120v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h88c4.418 0 8-3.582 8-8v-40h72c4.418 0 8-3.582 8-8v-48c0-4.418-3.582-8-8-8ZM168 64v32h-112v-32ZM136 192h-80v-32h80ZM216 144h-160v-32h160Z"),
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
        return _chartBarHorizontal!!
    }

private var _chartBarHorizontal: ImageVector? = null
