package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorThinIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-144C49.373 28 44 33.373 44 40v176c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM152 140h52v32h-96v-32ZM156 132v-32h48v32ZM56 36h144c2.209 0 4 1.791 4 4v52h-52c-2.209 0-4 1.791-4 4v36h-44c-2.209 0-4 1.791-4 4v36h-48v-132c0-2.209 1.791-4 4-4ZM200 220h-144c-2.209 0-4-1.791-4-4v-36h152v36c0 2.209-1.791 4-4 4Z"),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
