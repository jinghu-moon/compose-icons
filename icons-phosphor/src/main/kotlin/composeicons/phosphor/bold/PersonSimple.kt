package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimple: ImageVector
    get() {
        if (_personSimple != null) return _personSimple!!
        _personSimple = phosphorBoldIcon(
            name = "PersonSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c19.882 0 36-16.118 36-36C164 28.118 147.882 12 128 12 108.118 12 92 28.118 92 48c0 19.882 16.118 36 36 36ZM128 36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM234.29 138.17c-1.637 2.731-4.292 4.7-7.381 5.473-3.089 .773-6.359 .286-9.089-1.353-.32-.19-32.37-18.92-77.82-21.88v27L201 216c4.418 4.971 3.971 12.582-1 17-4.971 4.418-12.582 3.971-17-1L128 170.09 73 232c-4.418 4.971-12.029 5.418-17 1-4.971-4.418-5.418-12.029-1-17l61-68.59v-27c-45.72 2.95-77.48 21.68-77.82 21.89-5.683 3.41-13.055 1.568-16.465-4.115-3.41-5.683-1.568-13.055 4.115-16.465C27.58 120.66 69.35 96 128 96c58.65 0 100.42 24.66 102.17 25.71 5.682 3.408 7.526 10.777 4.12 16.46Z"),
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
        return _personSimple!!
    }

private var _personSimple: ImageVector? = null
