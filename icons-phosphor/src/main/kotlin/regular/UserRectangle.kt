package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorRegularIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 96.000 120.000 C 96.000 102.327 110.327 88.000 128.000 88.000 C 145.673 88.000 160.000 102.327 160.000 120.000 C 160.000 137.673 145.673 152.000 128.000 152.000 C 110.327 152.000 96.000 137.673 96.000 120.000 ZM 72.570 200.000 C 84.001 180.194 105.132 167.992 128.000 167.992 C 150.868 167.992 171.999 180.194 183.430 200.000 ZM 216.000 200.000 L 201.330 200.000 C 192.885 180.715 177.191 165.528 157.640 157.720 C 173.738 145.082 180.052 123.628 173.367 104.284 C 166.681 84.941 148.466 71.965 128.000 71.965 C 107.534 71.965 89.319 84.941 82.633 104.284 C 75.948 123.628 82.262 145.082 98.360 157.720 C 78.809 165.528 63.115 180.715 54.670 200.000 L 40.000 200.000 L 40.000 56.000 L 216.000 56.000 L 216.000 200.000 Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
