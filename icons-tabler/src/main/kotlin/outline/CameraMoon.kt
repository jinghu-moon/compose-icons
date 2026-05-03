package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraMoon: ImageVector
    get() {
        if (_cameraMoon != null) return _cameraMoon!!
        _cameraMoon = tablerOutlineIcon(
            name = "CameraMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.500 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 9.000 C 3.000 7.895 3.895 7.000 5.000 7.000 L 6.000 7.000 C 7.105 7.000 8.000 6.105 8.000 5.000 C 8.000 4.448 8.448 4.000 9.000 4.000 L 15.000 4.000 C 15.552 4.000 16.000 4.448 16.000 5.000 C 16.000 6.105 16.895 7.000 18.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 12.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 14.815 11.960 C 14.314 10.603 12.916 9.796 11.490 10.042 C 10.064 10.287 9.017 11.515 8.999 12.962 C 8.981 14.409 9.998 15.662 11.417 15.943"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.620 22.000 C 16.620 22.000 15.000 20.420 15.000 18.470 C 15.000 16.743 16.273 15.305 17.954 15.000 C 17.794 15.402 17.713 15.831 17.714 16.264 C 17.714 18.214 19.335 19.794 21.334 19.794 Q 21.676 19.794 22.000 19.734 C 21.479 21.060 20.162 22.000 18.620 22.000"),
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
        return _cameraMoon!!
    }

private var _cameraMoon: ImageVector? = null
