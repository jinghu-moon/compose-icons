package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MessageCircle: ImageVector
    get() {
        if (_messageCircle != null) return _messageCircle!!
        _messageCircle = tablerFilledIcon(
            name = "MessageCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.821 4.910 C 9.720 2.145 15.289 2.371 18.894 5.445 C 22.561 8.574 23.062 13.683 20.046 17.343 C 17.205 20.790 12.081 21.926 7.815 20.148 L 7.582 20.047 L 3.208 20.978 L 3.168 20.984 L 3.133 20.991 L 3.115 20.991 L 3.093 20.996 L 3.055 20.996 L 3.022 21.000 L 3.001 20.999 L 2.978 21.000 L 2.945 20.997 L 2.910 20.997 L 2.888 20.993 L 2.866 20.991 L 2.831 20.984 L 2.797 20.979 L 2.781 20.975 L 2.757 20.970 L 2.708 20.954 L 2.684 20.949 L 2.673 20.944 L 2.651 20.937 L 2.606 20.917 L 2.576 20.905 L 2.565 20.899 L 2.551 20.893 L 2.520 20.875 L 2.475 20.851 L 2.459 20.840 L 2.422 20.814 L 2.382 20.787 L 2.380 20.783 L 2.367 20.774 L 2.324 20.734 L 2.299 20.714 L 2.293 20.707 L 2.237 20.645 L 2.224 20.631 L 2.213 20.617 L 2.174 20.561 L 2.160 20.542 L 2.155 20.532 L 2.113 20.459 L 2.106 20.447 L 2.102 20.439 L 2.095 20.427 L 2.081 20.389 L 2.061 20.347 L 2.057 20.331 L 2.053 20.321 L 2.036 20.260 L 2.029 20.242 L 2.027 20.227 L 2.022 20.208 L 2.017 20.175 L 2.009 20.133 L 2.007 20.102 L 2.004 20.092 L 2.004 20.076 L 2.000 20.022 L 2.001 19.986 L 2.002 19.963 L 2.004 19.910 L 2.008 19.885 L 2.008 19.866 L 2.016 19.831 L 2.021 19.797 L 2.026 19.777 L 2.030 19.757 L 2.048 19.697 L 2.051 19.684 L 3.201 16.234 L 3.179 16.197 C 0.969 12.450 1.970 7.806 5.592 5.078 Z"),
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
        return _messageCircle!!
    }

private var _messageCircle: ImageVector? = null
