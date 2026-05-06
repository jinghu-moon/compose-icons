package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorThinIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 60h-96C42.445 60 12 90.445 12 128c0 37.555 30.445 68 68 68h96c37.555 0 68-30.445 68-68C244 90.445 213.555 60 176 60ZM176 188h-96C46.863 188 20 161.137 20 128 20 94.863 46.863 68 80 68h96c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60ZM176 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C212 108.118 195.882 92 176 92ZM176 156c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
