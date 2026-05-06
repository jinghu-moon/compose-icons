package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorRegularIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 48.81v-16.81c0-8.837-7.163-16-16-16h-80C79.163 16 72 23.163 72 32v16.81C53.388 52.629 40.02 69 40 88v112c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-112C215.98 69 202.612 52.629 184 48.81ZM168 48h-16v-16h16ZM120 48v-16h16v16ZM104 32v16h-16v-16ZM200 200c0 13.255-10.745 24-24 24h-96C66.745 224 56 213.255 56 200v-112C56 74.745 66.745 64 80 64h96c13.255 0 24 10.745 24 24Z"),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
