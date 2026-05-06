package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorThinIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 224c0 2.209-1.791 4-4 4C144.797 227.939 100.061 183.203 100 128v-86.34L58.83 82.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l48-48c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l48 48c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L108 41.66v86.34c.055 50.787 41.213 91.945 92 92 2.209 0 4 1.791 4 4Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
