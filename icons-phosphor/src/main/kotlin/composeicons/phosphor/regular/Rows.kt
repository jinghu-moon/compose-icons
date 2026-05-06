package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Rows: ImageVector
    get() {
        if (_rows != null) return _rows!!
        _rows = phosphorRegularIcon(
            name = "Rows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 136h-160c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16ZM208 192h-160v-40h160v40ZM208 48h-160C39.163 48 32 55.163 32 64v40c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16ZM208 104h-160v-40h160v40Z"),
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
