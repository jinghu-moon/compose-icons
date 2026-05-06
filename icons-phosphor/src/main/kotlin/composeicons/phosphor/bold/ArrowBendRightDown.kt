package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorBoldIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 184.49l-48 48c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-48-48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L140 195v-67C139.95 81.629 102.371 44.05 56 44 49.373 44 44 38.627 44 32 44 25.373 49.373 20 56 20c59.619 .066 107.934 48.381 108 108v67l27.51-27.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
