package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionRight: ImageVector
    get() {
        if (_transitionRight != null) return _transitionRight!!
        _transitionRight = tablerFilledIcon(
            name = "TransitionRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 2c2.209 0 4 1.791 4 4v12c0 2.209-1.791 4-4 4-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L18 20c1.105 0 2-.895 2-2v-12C20 4.895 19.105 4 18 4 17.448 4 17 3.552 17 3c0-.552 .448-1 1-1M10 18c0 2.209-1.791 4-4 4C3.791 22 2 20.209 2 18v-12C2 3.791 3.791 2 6 2c2.209 0 4 1.791 4 4v5h4.585L13.293 9.707c-.356-.356-.392-.922-.083-1.32l.083-.094c.391-.39 1.023-.39 1.414 0l3 3 .097 .112 .071 .11 .031 .062 .034 .081 .024 .076 .03 .148L18 12l-.004 .085-.016 .116-.03 .111-.044 .111-.052 .098-.074 .104-.073 .082-3 3c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L14.585 13h-4.585Z"),
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
        return _transitionRight!!
    }

private var _transitionRight: ImageVector? = null
