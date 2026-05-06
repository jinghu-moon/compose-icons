package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorRegularIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 80c-4.418 0-8 3.582-8 8v16h-11.15L184 55.2c-.205-2.01-1.162-3.867-2.68-5.2L138.44 11.88l-.2-.17c-5.932-4.941-14.548-4.941-20.48 0l-.2 .17L74.68 50C73.162 51.333 72.205 53.19 72 55.2L67.15 104h-11.15v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 4.418 3.582 8 8 8h17.54l-9.47 94.48c-.428 4.488 1.057 8.948 4.09 12.284 3.033 3.336 7.332 5.237 11.84 5.236h112c4.514-.001 8.818-1.909 11.85-5.253 3.032-3.344 4.51-7.814 4.07-12.307L190.46 120h17.54c4.418 0 8-3.582 8-8v-24c0-4.418-3.582-8-8-8ZM128 24l27 24h-54ZM87.24 64h81.52l4 40h-36.76v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-36.77ZM72 216l4-40h104l4 40ZM178.39 160h-100.78l4-40h92.76Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
