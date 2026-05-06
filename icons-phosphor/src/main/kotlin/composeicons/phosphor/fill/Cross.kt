package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorFillIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92v24c0 8.837-7.163 16-16 16h-44v92c0 8.837-7.163 16-16 16h-24c-8.837 0-16-7.163-16-16v-92h-44c-8.837 0-16-7.163-16-16v-24C40 83.163 47.163 76 56 76h44v-44c0-8.837 7.163-16 16-16h24c8.837 0 16 7.163 16 16v44h44c8.837 0 16 7.163 16 16Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
