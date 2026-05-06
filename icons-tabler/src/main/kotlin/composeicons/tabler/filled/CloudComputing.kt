package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudComputing: ImageVector
    get() {
        if (_cloudComputing != null) return _cloudComputing!!
        _cloudComputing = tablerFilledIcon(
            name = "CloudComputing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 20c0 1.105-.895 2-2 2h-4C2.448 22 2 21.552 2 21c0-.552 .448-1 1-1h4v-2.997l-.343 .001c-.039-0-.078-.002-.117-.007l-.105-.001C3.495 16.886 1.118 14.597 1.005 11.733L1 11.517C1 8.77 3.08 6.507 5.784 6.1l.114-.016 .07-.181C6.631 4.283 8.024 2.997 9.797 2.385l.244-.08c2.194-.667 4.614-.224 6.36 1.176 1.385 1.108 2.187 2.686 2.25 4.34l.004 .212 .091 .003c2.3 .107 4.143 1.961 4.25 4.27l.004 .211c0 2.478-1.997 4.487-4.465 4.487h-1.535v2.996h4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-4c-1.105 0-2-.895-2-2v-2.997h-2v3.997c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3.997h-2Z"),
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
        return _cloudComputing!!
    }

private var _cloudComputing: ImageVector? = null
