package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorBoldIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 96c0 29.47-24.21 54.05-56 59.06v.94c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-12c0-6.627 5.373-12 12-12 24.26 0 44-16.15 44-36C172 76.15 152.26 60 128 60 103.74 60 84 76.15 84 96c0 6.627-5.373 12-12 12C65.373 108 60 102.627 60 96 60 62.92 90.5 36 128 36c37.5 0 68 26.92 68 60ZM128 188c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
