package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorBoldIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-160c-11.046 0-20 8.954-20 20v36c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-36c0-11.046-8.954-20-20-20ZM204 188h-152v-28h152ZM208 44h-160C36.954 44 28 52.954 28 64v36c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-36C228 52.954 219.046 44 208 44ZM204 96h-152v-28h152Z"),
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
        return _rows!!
    }

private var _rows: ImageVector? = null
