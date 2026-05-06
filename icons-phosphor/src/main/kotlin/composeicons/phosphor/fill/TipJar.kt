package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorFillIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 48.81v-16.81c0-8.837-7.163-16-16-16h-80C79.163 16 72 23.163 72 32v16.81C53.388 52.629 40.02 69 40 88v112c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-112C215.98 69 202.612 52.629 184 48.81ZM120 32h16v16h-16ZM88 32h16v16h-16ZM136 184v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16C106.745 152 96 141.255 96 128c0-13.255 10.745-24 24-24v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM168 48h-16v-16h16Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
