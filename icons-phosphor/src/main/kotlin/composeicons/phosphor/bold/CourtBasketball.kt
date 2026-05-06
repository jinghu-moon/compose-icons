package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorBoldIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 156h-4c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28h4ZM36 100h4c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28h-4ZM36 180h4c28.719 0 52-23.281 52-52C92 99.281 68.719 76 40 76h-4v-8h80v120h-80ZM140 188v-120h80v8h-4c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52h4v8Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
