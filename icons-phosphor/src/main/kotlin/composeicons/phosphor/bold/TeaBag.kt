package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorBoldIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 156c-6.627 0-12-5.373-12-12v-80C212 30.863 185.137 4 152 4 118.863 4 92 30.863 92 64v4h-15.47c-7.02 .02-13.521 3.701-17.15 9.71L38.85 111.92c-1.863 3.113-2.848 6.672-2.85 10.3v93.78c0 11.046 8.954 20 20 20h96c11.046 0 20-8.954 20-20v-93.78c0-3.625-.985-7.182-2.85-10.29L148.62 77.71C144.991 71.701 138.49 68.02 131.47 68h-15.47v-4c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36v80c0 19.882 16.118 36 36 36 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM129.21 92 148 123.32v88.68h-88v-88.68L78.79 92h13.21v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
