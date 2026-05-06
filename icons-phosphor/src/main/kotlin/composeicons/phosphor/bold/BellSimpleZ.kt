package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BellSimpleZ: ImageVector
    get() {
        if (_bellSimpleZ != null) return _bellSimpleZ!!
        _bellSimpleZ = phosphorBoldIcon(
            name = "BellSimpleZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 140c0 6.627-5.373 12-12 12h-32c-4.43 .007-8.502-2.428-10.595-6.332-2.092-3.904-1.864-8.644 .595-12.328L121.58 104h-9.58c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h32c4.43-.007 8.502 2.428 10.595 6.332 2.092 3.904 1.864 8.644-.595 12.328L134.42 128h9.58c6.627 0 12 5.373 12 12ZM225.33 186c-3.539 6.226-10.168 10.052-17.33 10h-160c-7.154 .044-13.774-3.78-17.31-10-3.564-6.217-3.545-13.861 .05-20.06C39.39 151 44 129.58 44 104 44 57.608 81.608 20 128 20c46.392 0 84 37.608 84 84 0 25.57 4.59 47 13.27 61.93 3.605 6.198 3.631 13.847 .07 20.07ZM201.33 172C192.49 154 188 131.13 188 104 188 70.863 161.137 44 128 44 94.863 44 68 70.863 68 104c0 27.14-4.48 50-13.33 68ZM160 212h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _bellSimpleZ!!
    }

private var _bellSimpleZ: ImageVector? = null
