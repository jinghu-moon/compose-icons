package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorThinIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-128c-2.209 0-4 1.791-4 4v44h-44c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4v-44h44c2.209 0 4-1.791 4-4v-128c0-2.209-1.791-4-4-4ZM164 212h-120v-120h120ZM212 164h-40v-76c0-2.209-1.791-4-4-4h-76v-40h120Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
