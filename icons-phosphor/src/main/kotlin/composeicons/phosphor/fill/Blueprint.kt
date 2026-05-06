package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorFillIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 120h24v16h-24ZM240 64v136c0 4.418-3.582 8-8 8h-184C30.327 208 16 193.673 16 176v-112C16 46.327 30.327 32 48 32h16c4.418 0 8 3.582 8 8v16h160c4.418 0 8 3.582 8 8ZM56 48h-8C39.163 48 32 55.163 32 64v84.29c4.861-2.818 10.381-4.298 16-4.29h8ZM176 136v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
