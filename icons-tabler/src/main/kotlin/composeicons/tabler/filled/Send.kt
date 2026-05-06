package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = tablerFilledIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.864 3.549 15.41 21.417c-.253 .551-.804 .904-1.41 .903-.594 .002-1.137-.338-1.394-.874L9.726 15.687ZM20.45 2.135 8.311 14.273 2.583 11.409C2.033 11.156 1.68 10.606 1.68 10c0-.606 .353-1.157 .981-1.44Z"),
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
        return _send!!
    }

private var _send: ImageVector? = null
