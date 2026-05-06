package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeWc: ImageVector
    get() {
        if (_badgeWc != null) return _badgeWc!!
        _badgeWc = tablerFilledIcon(
            name = "BadgeWc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM11.466 8c-.507 .017-.921 .411-.963 .917l-.204 2.445-.405-.81-.063-.11c-.198-.296-.539-.464-.894-.441-.355 .023-.672 .232-.831 .551l-.406 .81L7.497 8.917C7.455 8.411 7.041 8.017 6.534 8l-.117 .003c-.264 .022-.509 .148-.681 .351-.171 .203-.255 .465-.233 .729l.5 6 .016 .117c.175 .91 1.441 1.115 1.875 .247L9 13.236l1.106 2.211c.452 .904 1.807 .643 1.89-.364l.5-6c.046-.55-.363-1.034-.913-1.08ZM15.5 8C14.119 8 13 9.119 13 10.5v3C13 14.881 14.119 16 15.5 16 16.881 16 18 14.881 18 13.5c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .276-.224 .5-.5 .5C15.224 14 15 13.776 15 13.5v-3c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5 0 .552 .448 1 1 1 .552 0 1-.448 1-1C18 9.119 16.881 8 15.5 8"),
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
        return _badgeWc!!
    }

private var _badgeWc: ImageVector? = null
