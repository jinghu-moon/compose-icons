package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Help: ImageVector
    get() {
        if (_help != null) return _help!!
        _help = tablerFilledIcon(
            name = "Help",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c3.12 1.774 5.05 5.083 5.057 8.671 .008 3.588-1.908 6.906-5.019 8.693C13.926 22.492 10.096 22.475 7 20.66 2.258 17.88 .649 11.794 3.397 7.033 6.146 2.273 12.221 .623 17 3.34M12 16c-.507 0-.934 .38-.993 .883L11 17.01c.001 .529 .413 .966 .941 .997 .528 .031 .989-.355 1.052-.88L13 17c0-.552-.448-1-1-1M13.173 6.144C11.718 5.676 10.126 6.178 9.203 7.396c-.322 .421-.26 1.019 .141 1.365 .401 .346 1.003 .319 1.371-.061l.082-.096c.411-.541 1.118-.763 1.764-.556 .646 .208 1.091 .801 1.11 1.48 .018 .679-.394 1.295-1.028 1.538-1.038 .374-1.706 1.388-1.641 2.49 .032 .527 .468 .938 .996 .939 .528 .001 .965-.408 1-.935v-.117c-.011-.192 .09-.373 .259-.466l.075-.034c1.439-.541 2.377-1.934 2.338-3.47C15.628 7.946 14.627 6.611 13.173 6.144"),
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
        return _help!!
    }

private var _help: ImageVector? = null
