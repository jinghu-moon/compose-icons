package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigRight: ImageVector
    get() {
        if (_arrowBigRight != null) return _arrowBigRight!!
        _arrowBigRight = tablerFilledIcon(
            name = "ArrowBigRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.089 3.634C11.421 3.976 11 4.663 11 5.414L10.999 8h-6.999C2.895 8 2 8.895 2 10v4l.005 .15C2.083 15.194 2.953 16 4 16l6.999-.001L11 18.586c0 .809 .487 1.538 1.235 1.847 .747 .309 1.607 .138 2.179-.433L21 13.414c.781-.781 .781-2.047 0-2.828L14.414 4c-.572-.572-1.432-.744-2.18-.434l-.145 .068Z"),
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
        return _arrowBigRight!!
    }

private var _arrowBigRight: ImageVector? = null
