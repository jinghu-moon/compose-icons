package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsStar: ImageVector
    get() {
        if (_settingsStar != null) return _settingsStar!!
        _settingsStar = tablerOutlineIcon(
            name = "SettingsStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.325 19.683 C 10.196 19.148 9.818 18.706 9.310 18.496 C 8.801 18.285 8.222 18.330 7.752 18.617 C 6.209 19.557 4.442 17.791 5.382 16.247 C 5.668 15.777 5.713 15.199 5.502 14.691 C 5.292 14.182 4.852 13.805 4.317 13.675 C 2.561 13.249 2.561 10.751 4.317 10.325 C 4.852 10.195 5.293 9.818 5.504 9.309 C 5.714 8.801 5.670 8.222 5.383 7.752 C 4.443 6.209 6.209 4.442 7.753 5.382 C 8.753 5.990 10.049 5.452 10.325 4.317 C 10.751 2.561 13.249 2.561 13.675 4.317 C 13.805 4.852 14.182 5.293 14.691 5.504 C 15.199 5.714 15.778 5.670 16.248 5.383 C 17.791 4.443 19.558 6.209 18.618 7.753 C 18.332 8.223 18.287 8.801 18.498 9.309 C 18.708 9.818 19.148 10.195 19.683 10.325 C 20.154 10.429 20.558 10.732 20.789 11.156"),
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
                pathData = parseSvgPathData("M 14.890 11.195 C 14.530 9.899 13.351 9.001 12.005 8.998 C 10.660 8.995 9.477 9.888 9.111 11.182 C 8.745 12.477 9.285 13.857 10.433 14.559"),
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
                pathData = parseSvgPathData("M 17.800 20.817 L 15.628 21.955 C 15.497 22.023 15.338 22.012 15.218 21.925 C 15.097 21.838 15.036 21.691 15.060 21.545 L 15.475 19.134 L 13.718 17.427 C 13.611 17.324 13.572 17.168 13.619 17.027 C 13.665 16.885 13.788 16.782 13.935 16.762 L 16.363 16.410 L 17.449 14.217 C 17.515 14.084 17.651 14.000 17.800 14.000 C 17.949 14.000 18.085 14.084 18.151 14.217 L 19.237 16.410 L 21.665 16.762 C 21.812 16.783 21.934 16.886 21.980 17.027 C 22.026 17.168 21.988 17.323 21.882 17.427 L 20.125 19.134 L 20.539 21.544 C 20.564 21.691 20.504 21.839 20.384 21.926 C 20.263 22.014 20.103 22.025 19.972 21.955 L 17.800 20.817"),
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
        return _settingsStar!!
    }

private var _settingsStar: ImageVector? = null
