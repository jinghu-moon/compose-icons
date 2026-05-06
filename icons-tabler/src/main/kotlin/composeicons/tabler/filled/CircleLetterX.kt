package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterX: ImageVector
    get() {
        if (_circleLetterX != null) return _circleLetterX!!
        _circleLetterX = tablerFilledIcon(
            name = "CircleLetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14.447 7.106c-.494-.247-1.094-.047-1.341 .447L12 9.763 10.894 7.553c-.227-.454-.757-.666-1.234-.494l-.107 .047c-.494 .247-.694 .847-.447 1.341L10.88 12 9.105 15.553c-.227 .453-.079 1.005 .345 1.283l.102 .058c.494 .247 1.094 .047 1.341-.447L12 14.236l1.106 2.211c.227 .454 .757 .666 1.234 .494l.107-.047c.494-.247 .694-.847 .447-1.341L13.118 12 14.894 8.447c.227-.453 .079-1.005-.345-1.283Z"),
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
        return _circleLetterX!!
    }

private var _circleLetterX: ImageVector? = null
