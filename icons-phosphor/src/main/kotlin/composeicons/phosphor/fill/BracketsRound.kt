package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorFillIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM99.61 176.86c3.949 1.985 5.54 6.796 3.555 10.745-1.985 3.949-6.796 5.54-10.745 3.555C69.609 178.386 55.629 154.142 56 128 55.629 101.858 69.609 77.614 92.42 64.84c3.949-1.983 8.757-.389 10.74 3.56 1.983 3.949 .389 8.757-3.56 10.74C98.37 79.78 72 93.76 72 128c0 34.24 26.48 48.28 27.61 48.86ZM163.61 191.16c-3.954 1.977-8.763 .374-10.74-3.58-1.977-3.954-.374-8.763 3.58-10.74 1.1-.56 27.58-14.52 27.58-48.84 0-34.32-26.48-48.28-27.61-48.86-3.949-1.985-5.54-6.796-3.555-10.745 1.985-3.949 6.796-5.54 10.745-3.555C186.41 77.622 200.377 101.865 200 128c.371 26.142-13.609 50.386-36.42 63.16Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
