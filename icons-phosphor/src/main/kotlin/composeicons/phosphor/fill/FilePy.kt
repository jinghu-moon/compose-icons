package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePy: ImageVector
    get() {
        if (_filePy != null) return _filePy!!
        _filePy = phosphorFillIcon(
            name = "FilePy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h128c2.209 0 4 1.791 4 4v104c0 2.209 1.791 4 4 4h20c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM64 144h-16c-4.418 0-8 3.582-8 8v55.73c-.068 4.291 3.195 7.903 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C55.09 212.336 56.005 210.217 56 208v-8h7.4c15.24 0 28.14-11.92 28.59-27.15 .23-7.57-2.617-14.911-7.891-20.347C78.825 147.067 71.574 143.999 64 144ZM63.65 184h-7.65v-24h8c3.394-.016 6.636 1.406 8.923 3.914 2.287 2.508 3.405 5.867 3.077 9.246-.723 6.248-6.061 10.933-12.35 10.84ZM154.65 156.52 136 186.29v21.44c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-21.69L101.39 156.52c-2.389-3.701-1.437-8.627 2.16-11.17 1.799-1.203 4.009-1.625 6.125-1.171 2.116 .454 3.958 1.746 5.105 3.581L128 168.91l13.22-21.15c1.147-1.835 2.989-3.127 5.105-3.581 2.116-.454 4.326-.032 6.125 1.171 3.597 2.543 4.549 7.469 2.16 11.17Z"),
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
        return _filePy!!
    }

private var _filePy: ImageVector? = null
