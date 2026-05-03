package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VisaFill: ImageVector
    get() {
        if (_visaFill != null) return _visaFill!!
        _visaFill = remixIcon(
            name = "VisaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.000 4.000 L 23.000 4.000 L 23.000 6.000 L 1.000 6.000 L 1.000 4.000 ZM 1.000 18.000 L 23.000 18.000 L 23.000 20.000 L 1.000 20.000 L 1.000 18.000 ZM 19.622 14.914 L 19.448 14.044 L 17.499 14.043 L 17.190 14.907 L 15.627 14.910 C 16.632 12.504 17.377 10.721 17.863 9.562 C 17.990 9.259 18.216 9.105 18.548 9.107 C 18.802 9.109 19.217 9.109 19.793 9.108 L 21.000 14.911 L 19.622 14.914 ZM 17.938 12.852 L 19.194 12.852 L 18.725 10.672 L 17.938 12.852 ZM 7.872 9.106 L 9.442 9.108 L 7.015 14.914 L 5.425 14.913 C 4.888 12.842 4.493 11.307 4.241 10.308 C 4.164 10.001 4.010 9.787 3.715 9.686 C 3.452 9.596 3.014 9.456 2.400 9.267 L 2.400 9.108 C 3.547 9.108 4.383 9.108 4.909 9.108 C 5.343 9.108 5.596 9.317 5.678 9.747 C 5.759 10.178 5.966 11.274 6.297 13.036 L 7.872 9.106 ZM 11.599 9.108 L 10.359 14.913 L 8.864 14.911 C 8.894 14.770 9.307 12.835 10.103 9.106 L 11.599 9.108 ZM 14.631 9.000 C 15.077 9.000 15.641 9.138 15.965 9.267 L 15.703 10.471 C 15.410 10.353 14.928 10.194 14.523 10.201 C 13.933 10.210 13.569 10.457 13.569 10.694 C 13.569 11.078 14.201 11.272 14.853 11.693 C 15.596 12.173 15.694 12.603 15.684 13.071 C 15.674 14.042 14.853 15.000 13.120 15.000 C 12.329 14.988 12.044 14.922 11.399 14.694 L 11.672 13.438 C 12.328 13.712 12.607 13.799 13.167 13.799 C 13.682 13.799 14.123 13.592 14.127 13.231 C 14.129 12.974 13.972 12.847 13.395 12.529 C 12.818 12.212 12.009 11.773 12.020 10.889 C 12.033 9.758 13.107 9.000 14.631 9.000 Z"),
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
        return _visaFill!!
    }

private var _visaFill: ImageVector? = null
