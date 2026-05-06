package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = tablerFilledIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.243 7.34 1.863 8.265l-.113 .023c-.348 .092-.62 .365-.711 .714-.091 .349 .012 .719 .271 .97l4.622 4.499L4.842 20.826l-.013 .11c-.021 .36 .153 .704 .456 .9 .303 .196 .688 .213 1.008 .044l5.706-3 5.693 3 .1 .046c.336 .132 .717 .073 .998-.155 .28-.228 .416-.589 .354-.945L18.053 14.471 22.677 9.971l.078-.085c.227-.279 .286-.659 .155-.994-.131-.335-.432-.574-.788-.626L15.742 7.34 12.89 1.56c-.168-.342-.516-.558-.897-.558-.381 0-.729 .216-.897 .558L8.243 7.34Z"),
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
        return _star!!
    }

private var _star: ImageVector? = null
