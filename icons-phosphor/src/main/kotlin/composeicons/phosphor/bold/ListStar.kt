package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorBoldIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 64C28 57.373 33.373 52 40 52h176c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-176C33.373 76 28 70.627 28 64ZM40 140h48c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM104 180h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM239.64 146.87l-20.58 17 6.25 25.26c1.156 4.686-.608 9.609-4.478 12.494-3.869 2.885-9.091 3.171-13.252 .726L184 188.46l-23.58 13.88c-4.161 2.445-9.383 2.159-13.252-.726-3.869-2.885-5.634-7.808-4.478-12.494l6.25-25.26-20.58-17c-3.775-3.116-5.28-8.212-3.802-12.878 1.478-4.666 5.642-7.967 10.522-8.342l27.42-2.12L173 99.25c1.908-4.375 6.227-7.204 11-7.204 4.773 0 9.092 2.829 11 7.204l10.48 24.28 27.42 2.12c4.88 .375 9.044 3.676 10.522 8.342 1.478 4.666-.027 9.762-3.802 12.878ZM201.43 147.29l-5-.39c-4.441-.344-8.325-3.12-10.09-7.21l-2.33-5.4-2.33 5.4c-1.766 4.093-5.656 6.869-10.1 7.21l-5 .39 3.48 2.87c3.553 2.939 5.108 7.654 4 12.13l-1.21 4.89 5.07-3c3.762-2.201 8.418-2.201 12.18 0l5.07 3L194 162.29c-1.108-4.476 .447-9.191 4-12.13Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
