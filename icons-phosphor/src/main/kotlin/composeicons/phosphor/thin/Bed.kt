package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorThinIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 76h-188v-28c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h216v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-96C252 92.118 235.882 76 216 76ZM28 84h80v80h-80ZM116 164v-80h100c15.464 0 28 12.536 28 28v52Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
