package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorFillIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 120h-24.3C219.456 64.24 171.877 21.818 115.997 23.97 60.117 26.122 15.942 72.078 16 128v24c.044 39.746 32.254 71.956 72 72h40c39.746-.044 71.956-32.254 72-72v-16h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM88 180C74.745 180 64 169.255 64 156c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM184 152c-.031 28.77-21.834 52.846-50.46 55.72C150.287 194.068 160.004 173.606 160 152v-16h24Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
