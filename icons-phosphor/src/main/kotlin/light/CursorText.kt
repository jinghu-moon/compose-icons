package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CursorText: ImageVector
    get() {
        if (_cursorText != null) return _cursorText!!
        _cursorText = phosphorLightIcon(
            name = "CursorText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 208.000 C 182.000 211.314 179.314 214.000 176.000 214.000 L 160.000 214.000 C 147.038 213.990 134.975 207.375 128.000 196.450 C 121.025 207.375 108.962 213.990 96.000 214.000 L 80.000 214.000 C 76.686 214.000 74.000 211.314 74.000 208.000 C 74.000 204.686 76.686 202.000 80.000 202.000 L 96.000 202.000 C 110.359 202.000 122.000 190.359 122.000 176.000 L 122.000 134.000 L 104.000 134.000 C 100.686 134.000 98.000 131.314 98.000 128.000 C 98.000 124.686 100.686 122.000 104.000 122.000 L 122.000 122.000 L 122.000 80.000 C 122.000 65.641 110.359 54.000 96.000 54.000 L 80.000 54.000 C 76.686 54.000 74.000 51.314 74.000 48.000 C 74.000 44.686 76.686 42.000 80.000 42.000 L 96.000 42.000 C 108.962 42.010 121.025 48.625 128.000 59.550 C 134.975 48.625 147.038 42.010 160.000 42.000 L 176.000 42.000 C 179.314 42.000 182.000 44.686 182.000 48.000 C 182.000 51.314 179.314 54.000 176.000 54.000 L 160.000 54.000 C 145.641 54.000 134.000 65.641 134.000 80.000 L 134.000 122.000 L 152.000 122.000 C 155.314 122.000 158.000 124.686 158.000 128.000 C 158.000 131.314 155.314 134.000 152.000 134.000 L 134.000 134.000 L 134.000 176.000 C 134.000 190.359 145.641 202.000 160.000 202.000 L 176.000 202.000 C 179.314 202.000 182.000 204.686 182.000 208.000 Z"),
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
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
