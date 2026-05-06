package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorThinIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 92h-12.77l-10-46.51C216.025 39.982 211.168 36.043 205.53 36h-155.06c-5.653 .024-10.532 3.968-11.74 9.49L28.77 92h-12.77c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v100c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-28h104v28c0 6.627 5.373 12 12 12h24c6.627 0 12-5.373 12-12v-100h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM46.56 47.16c.396-1.843 2.025-3.16 3.91-3.16h155.06c1.885 0 3.514 1.317 3.91 3.16L219.05 92h-182.05ZM68 200c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4v-28h32ZM216 204h-24c-2.209 0-4-1.791-4-4v-28h32v28c0 2.209-1.791 4-4 4ZM220 164h-72v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-24v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-72v-64h184ZM60 132c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM180 132c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
