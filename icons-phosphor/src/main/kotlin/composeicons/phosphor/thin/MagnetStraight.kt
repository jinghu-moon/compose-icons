package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorThinIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44h-40c-6.627 0-12 5.373-12 12v88c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-88C108 49.373 102.627 44 96 44h-40C49.373 44 44 49.373 44 56v88c0 46.392 37.608 84 84 84h.64c46-.34 83.36-38.47 83.36-85v-87c0-6.627-5.373-12-12-12ZM160 52h40c2.209 0 4 1.791 4 4v36h-48v-36c0-2.209 1.791-4 4-4ZM56 52h40c2.209 0 4 1.791 4 4v36h-48v-36c0-2.209 1.791-4 4-4ZM128.58 220h-.58C86.026 220 52 185.974 52 144v-44h48v44c0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28v-44h48v43c0 42.15-33.83 76.69-75.42 77Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
