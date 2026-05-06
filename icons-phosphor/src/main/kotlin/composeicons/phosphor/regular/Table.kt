package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Table: ImageVector
    get() {
        if (_table != null) return _table!!
        _table = phosphorRegularIcon(
            name = "Table",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48h-192c-4.418 0-8 3.582-8 8v136c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-136c0-4.418-3.582-8-8-8ZM40 112h40v32h-40ZM96 112h120v32h-120ZM216 64v32h-176v-32ZM40 160h40v32h-40ZM216 192h-120v-32h120v32Z"),
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
        return _table!!
    }

private var _table: ImageVector? = null
