package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorLightIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 58h-96C41.34 58 10 89.34 10 128c0 38.66 31.34 70 70 70h96c38.66 0 70-31.34 70-70C246 89.34 214.66 58 176 58ZM176 186h-96C47.967 186 22 160.033 22 128 22 95.967 47.967 70 80 70h96c32.033 0 58 25.967 58 58 0 32.033-25.967 58-58 58ZM176 90c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C214 107.013 196.987 90 176 90ZM176 154c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
