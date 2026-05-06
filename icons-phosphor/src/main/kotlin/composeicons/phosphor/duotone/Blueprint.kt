package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorDuotoneIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 64v136h-184C34.745 200 24 189.255 24 176c0-13.255 10.745-24 24-24h16v-88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 56h-160v-16c0-4.418-3.582-8-8-8h-16C30.327 32 16 46.327 16 64v112c0 17.673 14.327 32 32 32h184c4.418 0 8-3.582 8-8v-136c0-4.418-3.582-8-8-8ZM32 64C32 55.163 39.163 48 48 48h8v96h-8c-5.619-.008-11.139 1.472-16 4.29ZM224 192h-176c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16h16c4.418 0 8-3.582 8-8v-80h152ZM104 136c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h24v8c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-8h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-24v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v8h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16ZM136 120h24v16h-24Z"),
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
