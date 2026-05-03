package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsHeart: ImageVector
    get() {
        if (_settingsHeart != null) return _settingsHeart!!
        _settingsHeart = tablerOutlineIcon(
            name = "SettingsHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.231 20.828 C 10.769 20.606 10.435 20.184 10.325 19.683 C 10.195 19.148 9.818 18.707 9.309 18.496 C 8.801 18.286 8.222 18.330 7.752 18.617 C 6.209 19.557 4.442 17.791 5.382 16.247 C 5.668 15.777 5.713 15.199 5.502 14.691 C 5.292 14.182 4.852 13.805 4.317 13.675 C 2.561 13.249 2.561 10.751 4.317 10.325 C 4.852 10.195 5.293 9.818 5.504 9.309 C 5.714 8.801 5.670 8.222 5.383 7.752 C 4.443 6.209 6.209 4.442 7.753 5.382 C 8.753 5.990 10.049 5.452 10.325 4.317 C 10.751 2.561 13.249 2.561 13.675 4.317 C 13.805 4.852 14.182 5.293 14.691 5.504 C 15.199 5.714 15.778 5.670 16.248 5.383 C 17.791 4.443 19.558 6.209 18.618 7.753 C 18.332 8.223 18.287 8.801 18.498 9.309 C 18.708 9.818 19.148 10.195 19.683 10.325 C 20.192 10.448 20.553 10.746 20.767 11.117"),
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
        pathData = parseSvgPathData("M 14.882 11.165 C 14.504 9.857 13.292 8.968 11.932 8.999 C 10.571 9.030 9.401 9.972 9.082 11.296 C 8.763 12.619 9.375 13.992 10.572 14.639"),
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
        pathData = parseSvgPathData("M 18.000 22.000 L 21.350 18.716 C 21.765 18.313 22.000 17.760 22.001 17.182 C 22.002 16.603 21.769 16.049 21.355 15.645 C 20.486 14.795 19.098 14.793 18.226 15.639 L 18.002 15.859 L 17.779 15.639 C 16.910 14.790 15.523 14.787 14.651 15.633 C 14.236 16.036 14.001 16.589 14.000 17.167 C 13.999 17.746 14.231 18.300 14.645 18.704 L 18.000 22.000"),
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
        return _settingsHeart!!
    }

private var _settingsHeart: ImageVector? = null
