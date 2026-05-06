package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) return _transitionTop!!
        _transitionTop = tablerFilledIcon(
            name = "TransitionTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 6l.081 .003 .12 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 9.415v4.585h5c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-12C3.791 22 2 20.209 2 18 2 15.791 3.791 14 6 14h5v-4.585L9.707 10.707c-.356 .356-.922 .392-1.32 .083l-.094-.083c-.39-.391-.39-1.023 0-1.414l3-3 .112-.097 .11-.071 .062-.031 .081-.034 .076-.024 .118-.025 .058-.007ZM18 2c2.209 0 4 1.791 4 4-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L20 6C20 4.895 19.105 4 18 4h-12C4.895 4 4 4.895 4 6 4 6.552 3.552 7 3 7 2.448 7 2 6.552 2 6 2 3.791 3.791 2 6 2Z"),
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
        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null
