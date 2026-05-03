package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EyeCloseFill: ImageVector
    get() {
        if (_eyeCloseFill != null) return _eyeCloseFill!!
        _eyeCloseFill = remixIcon(
            name = "EyeCloseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.130 15.842 L 9.343 18.782 L 7.411 18.264 L 8.198 15.326 C 7.009 14.888 5.917 14.250 4.961 13.454 L 2.808 15.607 L 1.394 14.193 L 3.547 12.039 C 2.356 10.611 1.520 8.875 1.176 6.968 L 2.076 6.805 C 4.869 8.816 8.296 10.000 12.000 10.000 C 15.704 10.000 19.132 8.816 21.924 6.805 L 22.825 6.968 C 22.480 8.875 21.645 10.611 20.454 12.039 L 22.607 14.193 L 21.193 15.607 L 19.039 13.454 C 18.084 14.250 16.991 14.888 15.802 15.326 L 16.590 18.264 L 14.658 18.782 L 13.870 15.842 C 13.262 15.946 12.638 16.000 12.000 16.000 C 11.363 16.000 10.738 15.946 10.130 15.842 Z"),
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
        return _eyeCloseFill!!
    }

private var _eyeCloseFill: ImageVector? = null
