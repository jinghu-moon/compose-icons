package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUp: ImageVector
    get() {
        if (_arrowBigUp != null) return _arrowBigUp!!
        _arrowBigUp = tablerFilledIcon(
            name = "ArrowBigUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.586 3 4 9.586c-.572 .572-.744 1.432-.434 2.18l.068 .145c.342 .668 1.029 1.089 1.78 1.089h2.586v7c0 1.105 .895 2 2 2h4l.15-.005C15.194 21.917 16 21.047 16 20l-.001-7h2.587c.809-0 1.538-.487 1.847-1.235 .309-.747 .138-1.607-.433-2.179L13.414 3c-.781-.781-2.047-.781-2.828 0Z"),
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
        return _arrowBigUp!!
    }

private var _arrowBigUp: ImageVector? = null
