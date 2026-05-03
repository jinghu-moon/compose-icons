package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber8: ImageVector
    get() {
        if (_circleNumber8 != null) return _circleNumber8!!
        _circleNumber8 = tablerFilledIcon(
            name = "CircleNumber8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 13.000 7.000 L 11.000 7.000 L 10.850 7.005 C 9.866 7.079 9.083 7.859 9.006 8.843 L 9.000 9.000 L 9.000 11.000 L 9.005 11.150 C 9.023 11.386 9.082 11.610 9.175 11.817 L 9.250 11.969 L 9.268 11.999 L 9.250 12.031 C 9.117 12.271 9.032 12.540 9.007 12.826 L 9.000 13.000 L 9.000 15.000 L 9.005 15.150 C 9.079 16.134 9.859 16.917 10.843 16.994 L 11.000 17.000 L 13.000 17.000 L 13.150 16.995 C 14.134 16.921 14.917 16.141 14.994 15.157 L 15.000 15.000 L 15.000 13.000 L 14.995 12.850 C 14.978 12.619 14.920 12.394 14.825 12.183 L 14.750 12.031 L 14.731 11.999 L 14.751 11.969 C 14.886 11.724 14.969 11.453 14.993 11.174 L 15.000 11.000 L 15.000 9.000 L 14.995 8.850 C 14.921 7.866 14.141 7.083 13.157 7.006 L 13.000 7.000 ZM 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 11.000 13.000 L 13.000 13.000 ZM 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 Z"),
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
        return _circleNumber8!!
    }

private var _circleNumber8: ImageVector? = null
