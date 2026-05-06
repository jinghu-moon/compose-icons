package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GlassFull: ImageVector
    get() {
        if (_glassFull != null) return _glassFull!!
        _glassFull = tablerFilledIcon(
            name = "GlassFull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.004 10.229l-.003-.186 .001-.113 .008-.071 1-7c.064-.451 .425-.802 .877-.853L7 2h10c.455-0 .853 .307 .968 .747l.022 .112 1.006 7.05L19 10c0 3.226-2.56 5.564-6 5.945v4.055h3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 22h-8c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L8 20h3v-4.055C7.642 15.574 5.122 13.336 5.004 10.229ZM16.133 4h-8.267L7.259 8.258c1.739-.527 3.624-.238 5.125 .787l.216 .155c1.255 .941 2.944 1.063 4.32 .31L16.133 4Z"),
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
        return _glassFull!!
    }

private var _glassFull: ImageVector? = null
