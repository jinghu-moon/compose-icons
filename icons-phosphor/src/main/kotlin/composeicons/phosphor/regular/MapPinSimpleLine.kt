package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorRegularIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 208h-80v-72.58c29.071-4.196 49.96-30.139 47.856-59.436C181.753 46.688 157.372 23.994 128 23.994c-29.372 0-53.753 22.693-55.856 51.99-2.103 29.296 18.786 55.24 47.856 59.436v72.58h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM88 80C88 57.909 105.909 40 128 40c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40C105.909 120 88 102.091 88 80Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
