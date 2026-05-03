package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicrosoftCopilotLine: ImageVector
    get() {
        if (_microsoftCopilotLine != null) return _microsoftCopilotLine!!
        _microsoftCopilotLine = remixIcon(
            name = "MicrosoftCopilotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.630 2.863 C 15.745 2.952 16.713 3.694 17.080 4.766 L 17.628 6.368 L 17.630 6.373 C 17.734 6.681 18.015 6.894 18.393 6.898 L 19.049 6.898 C 20.125 6.899 21.028 7.220 21.637 7.938 C 22.218 8.621 22.388 9.500 22.399 10.308 C 22.421 11.898 21.825 13.843 21.376 15.314 C 20.976 16.619 20.453 18.013 19.735 19.097 C 19.026 20.168 17.979 21.145 16.503 21.146 L 16.502 21.146 L 9.590 21.138 L 9.590 21.137 C 8.382 21.136 7.308 20.369 6.917 19.227 L 6.915 19.222 L 6.382 17.637 C 6.290 17.364 6.054 17.162 5.746 17.113 L 5.622 17.103 L 5.621 17.103 L 5.621 17.102 L 4.955 17.102 C 3.879 17.101 2.976 16.781 2.366 16.063 C 1.785 15.380 1.615 14.502 1.603 13.693 C 1.580 12.103 2.175 10.159 2.625 8.688 C 3.024 7.382 3.547 5.988 4.264 4.904 C 4.974 3.833 6.020 2.855 7.497 2.854 L 14.405 2.854 L 14.630 2.863 ZM 18.837 8.899 L 16.159 8.899 L 16.062 8.909 C 15.834 8.953 15.594 9.141 15.502 9.486 C 15.131 10.881 14.521 13.154 13.953 15.241 L 13.939 15.293 L 13.920 15.342 C 13.523 16.360 12.567 17.102 11.426 17.103 L 8.311 17.103 L 8.808 18.578 C 8.923 18.913 9.238 19.138 9.591 19.138 L 9.592 19.138 L 16.503 19.145 C 16.984 19.144 17.505 18.843 18.068 17.992 C 18.623 17.154 19.079 15.984 19.463 14.729 C 19.941 13.164 20.416 11.548 20.399 10.336 C 20.391 9.743 20.263 9.410 20.113 9.232 C 19.991 9.089 19.728 8.899 19.049 8.898 L 18.837 8.898 L 18.837 8.899 ZM 7.497 4.854 C 7.015 4.855 6.495 5.158 5.932 6.008 C 5.377 6.846 4.921 8.015 4.537 9.271 C 4.059 10.836 3.585 12.452 3.602 13.664 C 3.611 14.257 3.739 14.590 3.890 14.768 C 4.012 14.911 4.275 15.101 4.955 15.102 L 5.632 15.102 C 5.638 15.102 5.645 15.102 5.651 15.102 L 7.842 15.102 C 8.096 15.099 8.395 14.909 8.500 14.515 C 8.871 13.120 9.481 10.847 10.049 8.760 L 10.062 8.709 L 10.082 8.659 C 10.479 7.641 11.434 6.900 12.575 6.899 L 15.695 6.899 L 15.187 5.414 C 15.073 5.079 14.758 4.855 14.405 4.854 L 7.497 4.854 ZM 12.575 8.899 C 12.349 8.900 12.092 9.045 11.959 9.354 C 11.397 11.419 10.798 13.653 10.432 15.029 C 10.426 15.054 10.417 15.078 10.410 15.102 L 11.426 15.102 C 11.652 15.102 11.909 14.955 12.042 14.646 C 12.603 12.582 13.202 10.349 13.568 8.973 C 13.575 8.948 13.583 8.924 13.590 8.899 L 12.575 8.899 Z"),
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
        return _microsoftCopilotLine!!
    }

private var _microsoftCopilotLine: ImageVector? = null
