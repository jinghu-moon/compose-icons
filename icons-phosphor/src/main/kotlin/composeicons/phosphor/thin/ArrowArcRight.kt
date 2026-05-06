package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorThinIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 88v64c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h54.3L193.06 119C166.756 92.691 127.195 84.813 92.819 99.04 58.443 113.267 36.019 146.797 36 184c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 .001-40.446 24.365-76.909 61.732-92.387 37.367-15.478 80.378-6.923 108.978 21.677L228 142.39v-54.39c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
