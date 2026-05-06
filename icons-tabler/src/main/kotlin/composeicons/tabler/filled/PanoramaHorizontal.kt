package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) return _panoramaHorizontal!!
        _panoramaHorizontal = tablerFilledIcon(
            name = "PanoramaHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.31 4.591c.613-.225 1.297-.137 1.833 .236 .536 .373 .856 .984 .857 1.637v11c0 1.382-1.38 2.38-2.694 1.897-4.879-1.845-9.734-1.845-14.612 0C3.39 19.856 2 18.88 2 17.49v-11.032c.004-.649 .322-1.255 .854-1.627 .532-.372 1.211-.462 1.822-.243l.025 .012 .448 .162c4.572 1.623 9.123 1.622 13.703-.003Z"),
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
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
