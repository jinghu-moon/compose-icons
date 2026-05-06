package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorBoldIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 96C188 62.863 161.137 36 128 36 94.863 36 68 62.863 68 96c0 33.137 26.863 60 60 60 2.612-.004 5.221-.181 7.81-.53l-26.27 46.64c-3.253 5.777-1.207 13.097 4.57 16.35 5.777 3.253 13.097 1.207 16.35-4.57l49.54-88c5.253-9.085 8.013-19.396 8-29.89ZM92 96C92 76.118 108.118 60 128 60c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 132 92 115.882 92 96Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
