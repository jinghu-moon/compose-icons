package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorLightIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162 80c0-3.314 2.686-6 6-6h72c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-72c-3.314 0-6-2.686-6-6ZM240 170h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM240 106h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM240 138h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM142 64v128c0 7.732-6.268 14-14 14h-40c-20.79 .001-40.719-8.298-55.364-23.054C17.991 168.19 9.843 148.199 10 127.41 10.32 84.73 45.71 50 88.9 50h39.1c7.732 0 14 6.268 14 14ZM130 64c0-1.105-.895-2-2-2h-39.1C52.28 62 22.27 91.38 22 127.5c-.133 17.591 6.761 34.507 19.153 46.993C53.545 186.978 70.409 194.001 88 194h40c1.105 0 2-.895 2-2Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
