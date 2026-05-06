package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceImac: ImageVector
    get() {
        if (_deviceImac != null) return _deviceImac!!
        _deviceImac = tablerFilledIcon(
            name = "DeviceImac",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 22C7.448 22 7 21.552 7 21c0-.552 .448-1 1-1h.616l.25-2h-4.866C2.895 18 2 17.105 2 16v-12C2 2.895 2.895 2 4 2h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-4.867l.25 2h.617c.552 0 1 .448 1 1 0 .552-.448 1-1 1ZM13.116 18h-2.233l-.25 2h2.733Z"),
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
        return _deviceImac!!
    }

private var _deviceImac: ImageVector? = null
