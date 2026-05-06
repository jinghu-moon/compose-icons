package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorFillIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 181c-.577 28.314-23.68 50.973-52 51h-47.28C40.87 232 24 215.77 24 195.92c.034-13.352 7.455-25.589 19.28-31.79 1.365-.711 3.017-.575 4.248 .349 1.231 .924 1.823 2.472 1.522 3.981-.661 3.68-.995 7.411-1 11.15-.106 4.338 3.177 8.011 7.5 8.39 2.199 .124 4.351-.664 5.95-2.178C63.099 184.308 64.003 182.202 64 180c-.013-6.905 1.478-13.73 4.37-20h0c9.477-20.691 32.18-31.884 54.363-26.8 22.183 5.084 37.747 25.047 37.267 47.8ZM216 88v128c0 8.837-7.163 16-16 16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-120h-48c-4.418 0-8-3.582-8-8v-48h-88v88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-88C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM188.69 80 160 51.31v28.69Z"),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
