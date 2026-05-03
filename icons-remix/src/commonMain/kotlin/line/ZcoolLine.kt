package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZcoolLine: ImageVector
    get() {
        if (_zcoolLine != null) return _zcoolLine!!
        _zcoolLine = remixIcon(
            name = "ZcoolLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.262 8.260 C 5.838 8.803 4.001 11.208 4.001 13.936 C 4.001 17.196 6.644 19.839 9.903 19.839 C 12.755 19.839 15.185 17.801 15.704 15.033 C 15.824 14.396 16.244 13.857 16.833 13.585 C 17.315 13.363 17.743 13.112 18.117 12.842 C 17.254 12.239 16.931 10.980 17.647 10.008 C 18.227 9.219 18.697 8.349 19.038 7.357 C 17.955 7.867 16.737 8.293 15.370 8.622 C 14.108 8.925 12.978 7.984 12.904 6.808 C 11.724 7.380 10.234 7.819 8.262 8.260 ZM 19.257 11.193 C 20.423 11.193 21.174 10.770 22.001 10.607 C 21.676 12.055 20.500 14.097 17.670 15.402 C 16.983 19.066 13.767 21.839 9.903 21.839 C 5.539 21.839 2.001 18.300 2.001 13.936 C 2.001 10.290 4.468 7.060 7.825 6.309 C 11.746 5.431 13.529 4.742 14.902 2.000 C 15.590 3.333 15.591 4.892 14.903 6.677 C 17.718 6.007 19.976 4.825 21.676 3.129 C 21.676 7.931 19.854 10.315 19.257 11.193 ZM 13.418 15.126 C 14.001 15.271 14.001 15.958 14.001 16.147 L 14.001 17.167 C 14.001 17.729 13.659 17.941 13.157 17.941 L 7.743 17.941 C 7.268 17.854 7.009 17.595 7.009 17.163 L 7.009 16.213 C 7.009 15.738 7.225 15.392 7.440 15.133 L 10.593 11.764 L 7.527 11.764 C 7.225 11.764 7.009 11.548 7.009 11.160 C 6.965 10.425 7.095 9.259 7.656 9.000 C 7.743 9.000 7.743 9.130 7.743 9.173 C 7.656 9.346 7.743 9.475 7.959 9.475 L 11.845 9.475 C 12.709 9.475 13.227 9.475 13.530 9.389 C 13.659 9.346 13.746 9.389 13.703 9.518 C 13.616 9.821 13.659 10.166 13.659 10.469 C 13.659 11.462 13.659 11.851 12.882 12.628 L 10.204 15.565 L 13.053 15.563 C 13.370 15.563 13.418 15.417 13.418 15.126 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _zcoolLine!!
    }

private var _zcoolLine: ImageVector? = null
