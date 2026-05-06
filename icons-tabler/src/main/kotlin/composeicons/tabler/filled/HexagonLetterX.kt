package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterX: ImageVector
    get() {
        if (_hexagonLetterX != null) return _hexagonLetterX!!
        _hexagonLetterX = tablerFilledIcon(
            name = "HexagonLetterX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M14.447 7.106c-.494-.247-1.094-.047-1.341 .447L12 9.763 10.894 7.553c-.227-.454-.757-.666-1.234-.494l-.107 .047c-.494 .247-.694 .847-.447 1.341L10.88 12 9.105 15.553c-.227 .453-.079 1.005 .345 1.283l.102 .058c.494 .247 1.094 .047 1.341-.447L12 14.237l1.106 2.21c.227 .454 .757 .666 1.234 .494l.107-.047c.494-.247 .694-.847 .447-1.341L13.118 12 14.894 8.447c.227-.453 .079-1.005-.345-1.283Z"),
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
        return _hexagonLetterX!!
    }

private var _hexagonLetterX: ImageVector? = null
