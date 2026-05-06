package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterX: ImageVector
    get() {
        if (_squareLetterX != null) return _squareLetterX!!
        _squareLetterX = tablerFilledIcon(
            name = "SquareLetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14.447 7.106c-.494-.247-1.094-.047-1.341 .447L12 9.763 10.894 7.553c-.227-.454-.757-.666-1.234-.494l-.107 .047c-.494 .247-.694 .847-.447 1.341L10.88 12 9.105 15.553c-.227 .453-.079 1.005 .345 1.283l.102 .058c.494 .247 1.094 .047 1.341-.447L12 14.236l1.106 2.211c.227 .454 .757 .666 1.234 .494l.107-.047c.494-.247 .694-.847 .447-1.341L13.118 12 14.894 8.447c.227-.453 .079-1.005-.345-1.283Z"),
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
        return _squareLetterX!!
    }

private var _squareLetterX: ImageVector? = null
