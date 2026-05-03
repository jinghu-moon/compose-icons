package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SettingsPin: ImageVector
    get() {
        if (_settingsPin != null) return _settingsPin!!
        _settingsPin = tablerOutlineIcon(
            name = "SettingsPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.578 20.905 C 11.698 21.204 10.595 20.796 10.325 19.683 C 10.195 19.148 9.818 18.707 9.309 18.496 C 8.801 18.286 8.222 18.330 7.752 18.617 C 6.209 19.557 4.442 17.791 5.382 16.247 C 5.668 15.777 5.713 15.199 5.502 14.691 C 5.292 14.182 4.852 13.805 4.317 13.675 C 2.561 13.249 2.561 10.751 4.317 10.325 C 4.852 10.195 5.293 9.818 5.504 9.309 C 5.714 8.801 5.670 8.222 5.383 7.752 C 4.443 6.209 6.209 4.442 7.753 5.382 C 8.753 5.990 10.049 5.452 10.325 4.317 C 10.751 2.561 13.249 2.561 13.675 4.317 C 13.805 4.852 14.182 5.293 14.691 5.504 C 15.199 5.714 15.778 5.670 16.248 5.383 C 17.791 4.443 19.558 6.209 18.618 7.753 C 18.332 8.223 18.287 8.801 18.498 9.309 C 18.708 9.818 19.148 10.195 19.683 10.325 C 20.257 10.465 20.643 10.825 20.843 11.262"),
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
        pathData = parseSvgPathData("M 14.990 12.256 C 15.101 10.963 14.367 9.746 13.173 9.239 C 11.978 8.732 10.593 9.050 9.740 10.028 C 8.887 11.006 8.760 12.422 9.424 13.536 C 10.088 14.651 11.394 15.212 12.660 14.927"),
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
        pathData = parseSvgPathData("M 21.121 20.121 C 21.979 19.263 22.236 17.973 21.772 16.852 C 21.307 15.730 20.213 14.999 19.000 14.999 C 17.787 14.999 16.693 15.730 16.228 16.852 C 15.764 17.973 16.021 19.263 16.879 20.121 C 17.297 20.540 18.004 21.166 19.000 22.000 C 20.051 21.110 20.759 20.484 21.121 20.121"),
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
        pathData = parseSvgPathData("M 19.000 18.000 L 19.000 18.010"),
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
        return _settingsPin!!
    }

private var _settingsPin: ImageVector? = null
