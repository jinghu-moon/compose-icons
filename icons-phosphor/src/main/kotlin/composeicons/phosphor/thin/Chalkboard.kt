package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chalkboard: ImageVector
    get() {
        if (_chalkboard != null) return _chalkboard!!
        _chalkboard = phosphorThinIcon(
            name = "Chalkboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 196h-12v-140c0-6.627-5.373-12-12-12h-176C33.373 44 28 49.373 28 56v140h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM36 56c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4v140h-24v-28c0-2.209-1.791-4-4-4h-72c-2.209 0-4 1.791-4 4v28h-48v-112h120v52c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-56c0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4v116h-24ZM188 196h-64v-24h64Z"),
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
        return _chalkboard!!
    }

private var _chalkboard: ImageVector? = null
