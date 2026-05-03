package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SafariFill: ImageVector
    get() {
        if (_safariFill != null) return _safariFill!!
        _safariFill = remixIcon(
            name = "SafariFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.701 6.801 L 10.587 10.586 L 6.802 16.700 L 6.698 16.596 L 5.283 18.010 L 5.991 18.718 L 7.405 17.303 L 7.301 17.199 L 13.415 13.414 L 17.200 7.300 L 17.304 7.404 L 18.719 5.990 L 18.011 5.282 L 16.597 6.697 L 16.701 6.801 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 ZM 11.501 3.000 L 11.501 5.000 L 12.501 5.000 L 12.501 3.000 L 11.501 3.000 ZM 11.501 19.000 L 11.501 21.000 L 12.501 21.000 L 12.501 19.000 L 11.501 19.000 ZM 8.095 3.876 L 8.860 5.724 L 9.784 5.341 L 9.019 3.494 L 8.095 3.876 ZM 14.218 18.659 L 14.983 20.506 L 15.907 20.124 L 15.142 18.276 L 14.218 18.659 ZM 14.983 3.494 L 14.218 5.341 L 15.142 5.724 L 15.907 3.876 L 14.983 3.494 ZM 8.860 18.276 L 8.095 20.124 L 9.019 20.506 L 9.784 18.659 L 8.860 18.276 ZM 21.001 11.500 L 19.001 11.500 L 19.001 12.500 L 21.001 12.500 L 21.001 11.500 ZM 5.001 11.500 L 3.001 11.500 L 3.001 12.500 L 5.001 12.500 L 5.001 11.500 ZM 20.459 15.116 L 18.624 14.321 L 18.227 15.239 L 20.062 16.033 L 20.459 15.116 ZM 5.775 8.761 L 3.940 7.967 L 3.543 8.885 L 5.378 9.679 L 5.775 8.761 ZM 20.125 8.094 L 18.277 8.859 L 18.660 9.783 L 20.507 9.018 L 20.125 8.094 ZM 5.342 14.217 L 3.495 14.982 L 3.877 15.906 L 5.725 15.141 L 5.342 14.217 ZM 18.719 18.010 L 17.304 16.596 L 16.597 17.303 L 18.011 18.718 L 18.719 18.010 ZM 7.405 6.697 L 5.991 5.282 L 5.283 5.990 L 6.698 7.404 L 7.405 6.697 ZM 11.313 11.312 L 14.924 9.077 L 12.689 12.688 L 11.313 11.312 Z"),
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
        return _safariFill!!
    }

private var _safariFill: ImageVector? = null
