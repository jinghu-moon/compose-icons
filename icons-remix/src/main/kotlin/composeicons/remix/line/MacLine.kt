package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MacLine: ImageVector
    get() {
        if (_macLine != null) return _macLine!!
        _macLine = remixIcon(
            name = "MacLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 18v2l2 1v1h-8l-.004-.996L10 20v-2h-7.008C2.444 18 2 17.551 2 16.993v-12.985C2 3.451 2.455 3 2.992 3h18.016c.548 0 .992 .449 .992 1.007v12.985c0 .556-.455 1.007-.992 1.007h-7.008ZM4 5v9h16v-9h-16Z"),
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
        return _macLine!!
    }

private var _macLine: ImageVector? = null
