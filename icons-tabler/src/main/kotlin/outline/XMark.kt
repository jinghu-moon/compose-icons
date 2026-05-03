package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.XMark: ImageVector
    get() {
        if (_xMark != null) return _xMark!!
        _xMark = tablerOutlineIcon(
            name = "XMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 16.000 L 15.644 19.644 C 15.871 19.871 16.179 19.999 16.500 19.999 C 16.821 19.999 17.129 19.871 17.356 19.644 L 19.644 17.356 C 19.871 17.129 19.999 16.821 19.999 16.500 C 19.999 16.179 19.871 15.871 19.644 15.644 L 16.000 12.000 L 19.644 8.356 C 19.871 8.129 19.999 7.821 19.999 7.500 C 19.999 7.179 19.871 6.871 19.644 6.644 L 17.356 4.356 C 17.129 4.129 16.821 4.001 16.500 4.001 C 16.179 4.001 15.871 4.129 15.644 4.356 L 12.000 8.000 L 8.356 4.356 C 8.129 4.129 7.821 4.001 7.500 4.001 C 7.179 4.001 6.871 4.129 6.644 4.356 L 4.356 6.644 C 4.129 6.871 4.001 7.179 4.001 7.500 C 4.001 7.821 4.129 8.129 4.356 8.356 L 8.000 12.000 L 4.356 15.644 C 4.129 15.871 4.001 16.179 4.001 16.500 C 4.001 16.821 4.129 17.129 4.356 17.356 L 6.644 19.644 C 6.871 19.871 7.179 19.999 7.500 19.999 C 7.821 19.999 8.129 19.871 8.356 19.644 L 12.000 16.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _xMark!!
    }

private var _xMark: ImageVector? = null
