package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ironing2: ImageVector
    get() {
        if (_ironing2 != null) return _ironing2!!
        _ironing2 = tablerFilledIcon(
            name = "Ironing2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.459 5c1.955 0 3.624 1.414 3.945 3.343l1.387 8.329c.096 .579-.067 1.172-.447 1.62-.38 .448-.937 .707-1.524 .708h-16.82C2.448 19 2 18.552 2 18c0-4.418 3.582-8 8-8h8.652L18.432 8.671C18.281 7.766 17.535 7.08 16.621 7.006L16.459 7h-7.459C8.448 7 8 6.552 8 6 8 5.448 8.448 5 9 5ZM10.01 14h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.01 14h-.01c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052l.127 .007c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _ironing2!!
    }

private var _ironing2: ImageVector? = null
