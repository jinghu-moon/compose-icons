package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorThinIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 72c0-2.209 1.791-4 4-4 55.203 .061 99.939 44.797 100 100 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C195.945 117.213 154.787 76.055 104 76c-2.209 0-4-1.791-4-4ZM240 196h-164v-164c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v124c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
