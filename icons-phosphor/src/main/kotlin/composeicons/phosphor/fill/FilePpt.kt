package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePpt: ImageVector
    get() {
        if (_filePpt != null) return _filePpt!!
        _filePpt = phosphorFillIcon(
            name = "FilePpt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 152.53c-.367 4.268-3.967 7.528-8.25 7.47h-11.75v47.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-47.98h-11.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.212 .631-4.386 2.147-6.003 1.517-1.617 3.636-2.532 5.853-2.527h40c2.213 .001 4.328 .918 5.84 2.535 1.512 1.616 2.287 3.787 2.14 5.995ZM92 172.85C91.54 188.08 78.64 200 63.4 200h-7.4v7.73c.068 4.291-3.195 7.903-7.47 8.27-2.212 .147-4.386-.631-6.003-2.147C40.91 212.336 39.995 210.217 40 208v-56c0-4.418 3.582-8 8-8h16c7.576-.003 14.83 3.063 20.106 8.499 5.276 5.436 8.124 12.779 7.894 20.351ZM76 170.85C75.281 164.598 69.943 159.907 63.65 160h-7.65v24h8c3.394 .016 6.636-1.406 8.923-3.914 2.287-2.508 3.405-5.867 3.077-9.246ZM160 172.85C159.54 188.08 146.64 200 131.4 200h-7.4v7.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-55.98c0-4.418 3.582-8 8-8h16c7.576-.003 14.83 3.063 20.106 8.499 5.276 5.436 8.124 12.779 7.894 20.351ZM144 170.85c-.719-6.252-6.057-10.943-12.35-10.85h-7.65v24h8c3.394 .016 6.636-1.406 8.923-3.914 2.287-2.508 3.405-5.867 3.077-9.246ZM40 116v-76C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66v28c0 2.209-1.791 4-4 4h-168c-2.209 0-4-1.791-4-4ZM152 88h44L152 44Z"),
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
        return _filePpt!!
    }

private var _filePpt: ImageVector? = null
