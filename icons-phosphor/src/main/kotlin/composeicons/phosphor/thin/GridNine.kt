package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorThinIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-176C33.373 52 28 57.373 28 64v128c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM100 148v-40h56v40ZM156 156v40h-56v-40ZM36 108h56v40h-56ZM100 100v-40h56v40ZM164 108h56v40h-56ZM220 64v36h-56v-40h52c2.209 0 4 1.791 4 4ZM40 60h52v40h-56v-36c0-2.209 1.791-4 4-4ZM36 192v-36h56v40h-52c-2.209 0-4-1.791-4-4ZM216 196h-52v-40h56v36c0 2.209-1.791 4-4 4Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
