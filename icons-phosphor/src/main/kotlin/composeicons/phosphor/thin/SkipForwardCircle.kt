package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorThinIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM160 84c-2.209 0-4 1.791-4 4v32.78L98.12 84.61c-1.233-.77-2.787-.811-4.058-.107C92.79 85.207 92.001 86.546 92 88v80c-.001 1.454 .788 2.795 2.06 3.5 .595 .326 1.262 .498 1.94 .5 .75-.001 1.484-.212 2.12-.61L156 135.22v32.78c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-80c0-2.209-1.791-4-4-4ZM100 160.78v-65.56L152.45 128Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
