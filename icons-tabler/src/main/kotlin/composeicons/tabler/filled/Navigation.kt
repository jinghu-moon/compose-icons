package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Navigation: ImageVector
    get() {
        if (_navigation != null) return _navigation!!
        _navigation = tablerFilledIcon(
            name = "Navigation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.092 2.581c.153-.333 .477-.556 .842-.58 .366-.024 .716 .154 .912 .464l.062 .116 8.005 17.365c.198 .566 .05 1.196-.378 1.615-.383 .379-.937 .528-1.459 .393L11.999 19.556 5.1 21.894c-.511 .201-1.091 .112-1.52-.231l-.112-.1c-.398-.386-.556-.954-.393-1.556l.047-.15L11.092 2.581Z"),
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
        return _navigation!!
    }

private var _navigation: ImageVector? = null
