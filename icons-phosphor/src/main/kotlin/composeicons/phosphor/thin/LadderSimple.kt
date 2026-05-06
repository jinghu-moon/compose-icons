package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) return _ladderSimple!!
        _ladderSimple = phosphorThinIcon(
            name = "LadderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 28c-2.209 0-4 1.791-4 4v36h-120v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v192c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36h120v36c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-192c0-2.209-1.791-4-4-4ZM188 76v48h-120v-48ZM68 180v-48h120v48Z"),
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
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
