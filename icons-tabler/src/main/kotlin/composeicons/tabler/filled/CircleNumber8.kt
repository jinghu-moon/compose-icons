package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber8: ImageVector
    get() {
        if (_circleNumber8 != null) return _circleNumber8!!
        _circleNumber8 = tablerFilledIcon(
            name = "CircleNumber8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM13 7h-2l-.15 .005C9.866 7.079 9.083 7.859 9.006 8.843L9 9v2l.005 .15c.018 .236 .077 .46 .17 .667l.075 .152 .018 .03-.018 .032c-.133 .24-.218 .509-.243 .795L9 13v2l.005 .15c.074 .984 .854 1.767 1.838 1.844L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-2l-.005-.15c-.017-.231-.075-.456-.17-.667l-.075-.152-.019-.032 .02-.03c.135-.245 .218-.516 .242-.795L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7ZM13 13v2h-2v-2h2ZM13 9v2h-2v-2h2Z"),
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
        return _circleNumber8!!
    }

private var _circleNumber8: ImageVector? = null
