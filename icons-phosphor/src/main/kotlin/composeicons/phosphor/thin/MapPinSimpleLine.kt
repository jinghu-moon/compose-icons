package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorThinIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 212h-84v-80.17c27.857-2.149 49.037-25.928 47.961-53.847C178.886 50.063 155.94 27.984 128 27.984c-27.94 0-50.886 22.079-51.961 49.999-1.075 27.919 20.104 51.698 47.961 53.847v80.17h-84c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM84 80C84 55.699 103.699 36 128 36c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C103.711 123.972 84.028 104.289 84 80Z"),
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
