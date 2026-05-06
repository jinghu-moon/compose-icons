package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorRegularIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 56v144c0 8.837-7.163 16-16 16h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h72v-144h-176v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM32 184c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8 3.582 8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C56 194.745 45.255 184 32 184ZM32 152c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 22.091 0 40 17.909 40 40 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C87.967 177.086 62.914 152.033 32 152ZM32 120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 39.746 .044 71.956 32.254 72 72 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C119.945 159.422 80.578 120.055 32 120Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
