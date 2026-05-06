package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowRight: ImageVector
    get() {
        if (_circleArrowRight != null) return _circleArrowRight!!
        _circleArrowRight = tablerFilledIcon(
            name = "CircleArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.324 .005c5.457 .177 9.763 4.698 9.675 10.157-.088 5.459-4.539 9.838-9.999 9.838-5.46 0-9.91-4.379-9.999-9.838C1.913 6.703 6.219 2.182 11.676 2.005L12 2ZM12.613 7.21c-.417-.323-1.013-.266-1.362 .13-.349 .395-.33 .994 .042 1.367L13.584 11h-5.584l-.117 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941h5.584l-2.291 2.293-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042l4-4 .073-.082 .064-.089 .062-.113 .044-.11 .03-.112 .017-.126L17 12l-.007-.118-.029-.148-.035-.105-.054-.113-.071-.111c-.03-.04-.062-.077-.097-.112l-4-4Z"),
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
        return _circleArrowRight!!
    }

private var _circleArrowRight: ImageVector? = null
