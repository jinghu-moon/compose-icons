package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsAi: ImageVector
    get() {
        if (_settingsAi != null) return _settingsAi!!
        _settingsAi = tablerOutlineIcon(
            name = "SettingsAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.325 4.317 C 10.751 2.561 13.249 2.561 13.675 4.317 C 13.805 4.852 14.182 5.293 14.691 5.504 C 15.199 5.714 15.778 5.670 16.248 5.383 C 17.791 4.443 19.558 6.209 18.618 7.753 C 18.332 8.223 18.287 8.801 18.498 9.309 C 18.708 9.818 19.148 10.195 19.683 10.325 C 21.439 10.751 21.439 13.249 19.683 13.675 C 19.148 13.805 18.707 14.182 18.496 14.691 C 18.286 15.199 18.330 15.778 18.617 16.248 C 19.557 17.791 17.791 19.558 16.247 18.618 C 15.777 18.332 15.199 18.287 14.691 18.498 C 14.182 18.708 13.805 19.148 13.675 19.683 C 13.249 21.439 10.751 21.439 10.325 19.683 C 10.195 19.148 9.818 18.707 9.309 18.496 C 8.801 18.286 8.222 18.330 7.752 18.617 C 6.209 19.557 4.442 17.791 5.382 16.247 C 5.668 15.777 5.713 15.199 5.502 14.691 C 5.292 14.182 4.852 13.805 4.317 13.675 C 2.561 13.249 2.561 10.751 4.317 10.325 C 4.852 10.195 5.293 9.818 5.504 9.309 C 5.714 8.801 5.670 8.222 5.383 7.752 C 4.443 6.209 6.209 4.442 7.753 5.382 C 8.753 5.990 10.049 5.452 10.325 4.317"),
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
                pathData = parseSvgPathData("M 9.000 14.000 L 9.000 11.500 C 9.000 10.672 9.672 10.000 10.500 10.000 C 11.328 10.000 12.000 10.672 12.000 11.500 L 12.000 14.000"),
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
                pathData = parseSvgPathData("M 9.000 13.000 L 12.000 13.000"),
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
                pathData = parseSvgPathData("M 15.000 10.000 L 15.000 14.000"),
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
        return _settingsAi!!
    }

private var _settingsAi: ImageVector? = null
