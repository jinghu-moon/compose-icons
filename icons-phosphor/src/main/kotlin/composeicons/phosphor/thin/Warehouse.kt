package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorThinIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 188h-12v-133.34l12.84-2.75c1.421-.276 2.583-1.299 3.036-2.674 .454-1.375 .129-2.888-.85-3.955-.978-1.068-2.457-1.523-3.867-1.191L15.16 92.09c-1.998 .431-3.35 2.3-3.134 4.332 .216 2.033 1.93 3.576 3.974 3.578 .282-.001 .564-.031 .84-.09L28 97.52v90.48h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM36 95.81 220 56.38v131.62h-32v-60c0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4v60h-32ZM180 156h-104v-24h104ZM76 164h104v24h-104Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
