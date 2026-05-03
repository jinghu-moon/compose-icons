package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsQuestion: ImageVector
    get() {
        if (_settingsQuestion != null) return _settingsQuestion!!
        _settingsQuestion = tablerOutlineIcon(
            name = "SettingsQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.690 18.498 C 14.182 18.708 13.805 19.148 13.675 19.683 C 13.249 21.439 10.751 21.439 10.325 19.683 C 10.195 19.148 9.818 18.707 9.309 18.496 C 8.801 18.286 8.222 18.330 7.752 18.617 C 6.209 19.557 4.442 17.791 5.382 16.247 C 5.668 15.777 5.713 15.199 5.502 14.691 C 5.292 14.182 4.852 13.805 4.317 13.675 C 2.561 13.249 2.561 10.751 4.317 10.325 C 4.852 10.195 5.293 9.818 5.504 9.309 C 5.714 8.801 5.670 8.222 5.383 7.752 C 4.443 6.209 6.209 4.442 7.753 5.382 C 8.753 5.990 10.049 5.452 10.325 4.317 C 10.751 2.561 13.249 2.561 13.675 4.317 C 13.805 4.852 14.182 5.293 14.691 5.504 C 15.199 5.714 15.778 5.670 16.248 5.383 C 17.791 4.443 19.558 6.209 18.618 7.753 C 18.332 8.223 18.287 8.801 18.498 9.309 C 18.708 9.818 19.148 10.195 19.683 10.325 C 20.212 10.442 20.652 10.808 20.862 11.307"),
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
        pathData = parseSvgPathData("M 14.950 12.553 C 15.215 11.141 14.442 9.740 13.107 9.211 C 11.772 8.681 10.249 9.172 9.475 10.382 C 8.701 11.592 8.892 13.181 9.932 14.171 C 10.972 15.162 12.568 15.277 13.739 14.445"),
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
        pathData = parseSvgPathData("M 19.000 22.000 L 19.000 22.010"),
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
        pathData = parseSvgPathData("M 19.000 19.000 C 19.923 18.997 20.724 18.364 20.941 17.468 C 21.157 16.571 20.733 15.642 19.914 15.218 C 19.095 14.798 18.095 14.999 17.500 15.701"),
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
        return _settingsQuestion!!
    }

private var _settingsQuestion: ImageVector? = null
