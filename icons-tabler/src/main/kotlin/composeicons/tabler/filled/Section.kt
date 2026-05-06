package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = tablerFilledIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.01 19c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L20 21c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM4.01 19c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.531 .005-.973-.406-1.007-.936-.034-.53 .353-.994 .88-1.057M7.883 19.007c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.531 .005-.973-.406-1.007-.936-.034-.53 .353-.994 .88-1.057M11.756 19.014c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM15.756 19.014c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM19.756 3.014c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM3.756 3.014c.552 0 1 .448 1 1 0 .552-.448 1-1 1C3.225 5.019 2.783 4.608 2.749 4.078c-.034-.53 .353-.994 .88-1.057M7.629 3.021c.552 0 1 .448 1 1 0 .552-.448 1-1 1C7.098 5.026 6.656 4.615 6.622 4.085c-.034-.53 .353-.994 .88-1.057M11.502 3.028c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052l-.127 .007c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052ZM15.492 3.028c.552 0 1 .448 1 1 .003 .552-.443 1.002-.995 1.005-.552 .003-1.002-.443-1.005-.995 0-.562 .448-1.01 1-1.01M18.492 7.028c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-14c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z"),
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
        return _section!!
    }

private var _section: ImageVector? = null
