package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.072 20.300 C 5.187 21.236 6.813 21.236 7.928 20.300 C 9.043 19.364 9.325 17.763 8.598 16.502 L 6.503 13.275 C 6.392 13.105 6.203 13.003 6.001 13.003 C 5.798 13.003 5.609 13.105 5.498 13.275 L 3.400 16.502 C 2.674 17.763 2.956 19.364 4.071 20.300"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.072 20.300 C 17.187 21.236 18.813 21.236 19.928 20.300 C 21.043 19.364 21.325 17.763 20.598 16.502 L 18.503 13.275 C 18.392 13.105 18.203 13.003 18.000 13.003 C 17.798 13.003 17.609 13.105 17.498 13.275 L 15.400 16.502 C 14.674 17.763 14.956 19.364 16.071 20.300"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 10.072 10.300 C 11.187 11.236 12.813 11.236 13.928 10.300 C 15.043 9.364 15.325 7.763 14.598 6.502 L 12.503 3.275 C 12.392 3.105 12.203 3.003 12.000 3.003 C 11.798 3.003 11.609 3.105 11.498 3.275 L 9.400 6.502 C 8.674 7.763 8.956 9.364 10.071 10.300 L 10.072 10.300"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _droplets!!
    }

private var _droplets: ImageVector? = null
