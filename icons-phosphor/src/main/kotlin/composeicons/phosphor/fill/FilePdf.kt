package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorFillIcon(
            name = "FilePdf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM224 152.53c-.371 4.265-3.969 7.523-8.25 7.47h-23.75v16h15.73c4.283-.058 7.883 3.202 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-15.98v15.73c.058 4.283-3.202 7.883-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-55.98c0-4.418 3.582-8 8-8h32c2.217-.005 4.336 .91 5.853 2.527 1.516 1.617 2.294 3.791 2.147 6.003ZM64 144h-16c-4.418 0-8 3.582-8 8v55.73c-.068 4.291 3.195 7.903 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C55.09 212.336 56.005 210.217 56 208v-8h7.4c15.24 0 28.14-11.92 28.59-27.15 .23-7.57-2.617-14.911-7.891-20.347C78.825 147.067 71.574 143.999 64 144ZM63.65 184h-7.65v-24h8c3.394-.016 6.636 1.406 8.923 3.914 2.287 2.508 3.405 5.867 3.077 9.246-.723 6.248-6.061 10.933-12.35 10.84ZM128 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h15.32c19.66 0 36.21-15.48 36.67-35.13 .234-9.696-3.453-19.076-10.228-26.017C146.987 147.913 137.699 144 128 144ZM127.51 200h-7.51v-40h8c5.44-.004 10.648 2.208 14.421 6.127 3.774 3.919 5.788 9.206 5.579 14.643C147.58 191.59 138.34 200 127.51 200Z"),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
