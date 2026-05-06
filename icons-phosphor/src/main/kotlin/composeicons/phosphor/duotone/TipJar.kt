package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorDuotoneIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88v112c0 17.673-14.327 32-32 32h-96C62.327 232 48 217.673 48 200v-112C48 70.327 62.327 56 80 56h96c17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M184 48.81v-16.81c0-8.837-7.163-16-16-16h-80C79.163 16 72 23.163 72 32v16.81C53.388 52.629 40.02 69 40 88v112c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-112C215.98 69 202.612 52.629 184 48.81ZM168 48h-16v-16h16ZM120 48v-16h16v16ZM104 32v16h-16v-16ZM200 200c0 13.255-10.745 24-24 24h-96C66.745 224 56 213.255 56 200v-112C56 74.745 66.745 64 80 64h96c13.255 0 24 10.745 24 24ZM160 160c0 13.255-10.745 24-24 24v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16C106.745 152 96 141.255 96 128c0-13.255 10.745-24 24-24v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16c13.255 0 24 10.745 24 24Z"),
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
