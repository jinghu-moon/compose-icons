package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorFillIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM193.66 169.66l-8 8c-3.483 3.509-3.483 9.171 0 12.68l4 4c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0l-4-4c-9.74-9.759-9.74-25.561 0-35.32l8-8c3.483-3.509 3.483-9.171 0-12.68-3.509-3.483-9.171-3.483-12.68 0l-48 48c-9.869 9.024-25.092 8.683-34.547-.773-9.456-9.456-9.796-24.678-.773-34.547l72-72c3.483-3.509 3.483-9.171 0-12.68-3.509-3.483-9.171-3.483-12.68 0l-48 48c-9.869 9.024-25.092 8.683-34.547-.773C53.657 111.432 53.316 96.209 62.34 86.34L90.34 58.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-28 28c-3.483 3.509-3.483 9.171 0 12.68 3.509 3.483 9.171 3.483 12.68 0l48-48c9.869-9.024 25.092-8.683 34.547 .773 9.456 9.456 9.796 24.678 .773 34.547l-72 72c-3.483 3.509-3.483 9.171 0 12.68 3.509 3.483 9.171 3.483 12.68 0l48-48c9.869-9.024 25.092-8.683 34.547 .773 9.456 9.456 9.796 24.678 .773 34.547Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
