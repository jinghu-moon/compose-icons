package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorThinIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 92h-52v-52c0-2.209-1.791-4-4-4h-120c-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4h52v52c0 2.209 1.791 4 4 4h120c2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4ZM161.66 212l-48-48h44.68l48 48ZM164 158.34v-44.68l48 48v44.68ZM212 100v50.34l-48-48v-2.34ZM44 44h112v112h-112ZM100 164h2.34l48 48h-50.34Z"),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
