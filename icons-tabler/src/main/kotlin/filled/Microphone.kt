package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = tablerFilledIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 9.000 C 19.552 9.000 20.000 9.448 20.000 10.000 C 20.000 14.032 17.001 17.434 13.001 17.938 L 13.000 20.000 L 16.000 20.000 C 16.552 20.000 17.000 20.448 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 L 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 C 7.000 20.448 7.448 20.000 8.000 20.000 L 11.000 20.000 L 11.000 17.938 C 7.000 17.434 4.000 14.032 4.000 10.000 C 4.000 9.448 4.448 9.000 5.000 9.000 C 5.552 9.000 6.000 9.448 6.000 10.000 C 6.000 13.314 8.686 16.000 12.000 16.000 C 15.314 16.000 18.000 13.314 18.000 10.000 C 18.000 9.448 18.448 9.000 19.000 9.000M 12.000 1.000 C 14.209 1.000 16.000 2.791 16.000 5.000 L 16.000 10.000 C 16.000 12.209 14.209 14.000 12.000 14.000 C 9.791 14.000 8.000 12.209 8.000 10.000 L 8.000 5.000 C 8.000 2.791 9.791 1.000 12.000 1.000"),
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
        return _microphone!!
    }

private var _microphone: ImageVector? = null
