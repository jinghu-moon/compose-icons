package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DingdingLine: ImageVector
    get() {
        if (_dingdingLine != null) return _dingdingLine!!
        _dingdingLine = remixIcon(
            name = "DingdingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 16.490 11.040 L 16.484 11.054 C 16.064 11.952 14.968 13.713 14.968 13.713 C 14.968 13.713 14.967 13.709 14.963 13.702 L 14.642 14.260 L 16.186 14.260 L 13.238 18.179 L 13.907 15.513 L 12.693 15.513 L 13.115 13.750 C 12.774 13.832 12.370 13.945 11.892 14.099 C 11.892 14.099 11.246 14.477 10.030 13.370 C 10.030 13.370 9.210 12.648 9.686 12.468 C 9.888 12.391 10.667 12.293 11.281 12.211 C 12.109 12.099 12.619 12.039 12.619 12.039 C 12.619 12.039 10.064 12.078 9.458 11.982 C 8.852 11.887 8.083 10.875 7.919 9.986 C 7.919 9.986 7.666 9.498 8.464 9.729 C 9.262 9.960 12.565 10.629 12.565 10.629 C 12.565 10.629 8.269 9.312 7.983 8.990 C 7.697 8.669 7.142 7.236 7.214 6.356 C 7.214 6.356 7.245 6.137 7.471 6.195 C 7.471 6.195 10.647 7.647 12.818 8.441 C 14.990 9.236 16.878 9.640 16.635 10.669 C 16.614 10.756 16.562 10.885 16.490 11.040 Z"),
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
        return _dingdingLine!!
    }

private var _dingdingLine: ImageVector? = null
