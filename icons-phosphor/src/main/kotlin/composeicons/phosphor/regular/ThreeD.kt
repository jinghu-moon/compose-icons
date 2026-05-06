package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorRegularIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 148C96 136.954 87.046 128 76 128c-2.983-.001-5.718-1.661-7.095-4.308-1.377-2.646-1.167-5.839 .545-8.282L88.63 88h-32.63c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c2.983 .001 5.718 1.661 7.095 4.308 1.377 2.646 1.167 5.839-.545 8.282l-21 30c16.034 6.434 25.236 23.351 21.926 40.308C108.166 171.854 93.276 184.069 76 184c-9.681 .031-18.96-3.871-25.71-10.81-2.129-2.014-2.986-5.031-2.235-7.863 .751-2.832 2.992-5.027 5.839-5.721 2.847-.694 5.846 .225 7.816 2.394 5.687 5.808 14.324 7.596 21.85 4.523C91.086 163.451 96.003 156.129 96 148ZM160 72c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56h-24c-4.418 0-8-3.582-8-8v-96c0-4.418 3.582-8 8-8ZM160 88h-16v80h16c22.091 0 40-17.909 40-40C200 105.909 182.091 88 160 88ZM32 56h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-192c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM224 200h-192c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
