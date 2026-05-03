package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrainFill: ImageVector
    get() {
        if (_brainFill != null) return _brainFill!!
        _brainFill = remixIcon(
            name = "BrainFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.535 C 10.412 2.195 9.729 2.000 9.000 2.000 C 6.791 2.000 5.000 3.791 5.000 6.000 L 5.000 7.774 C 4.149 8.116 3.451 8.648 2.941 9.349 C 2.292 10.241 2.000 11.335 2.000 12.500 C 2.000 14.061 2.795 15.436 4.000 16.242 L 4.000 17.500 C 4.000 19.985 6.015 22.000 8.500 22.000 C 9.425 22.000 10.285 21.721 11.000 21.242 L 11.000 17.500 C 11.000 16.167 10.670 15.315 10.140 14.741 C 9.597 14.153 8.716 13.717 7.336 13.486 L 7.664 11.514 C 8.966 11.731 10.106 12.137 11.000 12.827 L 11.000 2.535 ZM 13.000 2.535 L 13.000 12.827 C 13.894 12.137 15.034 11.731 16.336 11.514 L 16.664 13.486 C 15.284 13.717 14.403 14.153 13.860 14.741 C 13.330 15.315 13.000 16.167 13.000 17.500 L 13.000 21.242 C 13.715 21.721 14.575 22.000 15.500 22.000 C 17.985 22.000 20.000 19.985 20.000 17.500 L 20.000 16.242 C 21.205 15.436 22.000 14.061 22.000 12.500 C 22.000 11.335 21.708 10.241 21.059 9.349 C 20.549 8.648 19.851 8.116 19.000 7.774 L 19.000 6.000 C 19.000 3.791 17.209 2.000 15.000 2.000 C 14.271 2.000 13.588 2.195 13.000 2.535 Z"),
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
        return _brainFill!!
    }

private var _brainFill: ImageVector? = null
