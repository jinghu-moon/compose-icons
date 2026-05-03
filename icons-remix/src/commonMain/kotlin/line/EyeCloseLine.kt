package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EyeCloseLine: ImageVector
    get() {
        if (_eyeCloseLine != null) return _eyeCloseLine!!
        _eyeCloseLine = remixIcon(
            name = "EyeCloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.343 18.782 L 7.411 18.264 L 8.198 15.325 C 7.009 14.887 5.917 14.250 4.961 13.453 L 2.808 15.607 L 1.394 14.193 L 3.547 12.039 C 2.356 10.610 1.520 8.875 1.176 6.968 L 3.144 6.610 C 3.903 10.813 7.579 14.000 12.000 14.000 C 16.421 14.000 20.098 10.813 20.857 6.610 L 22.825 6.968 C 22.480 8.875 21.645 10.610 20.454 12.039 L 22.607 14.193 L 21.193 15.607 L 19.039 13.453 C 18.084 14.250 16.991 14.887 15.802 15.325 L 16.590 18.264 L 14.658 18.782 L 13.870 15.842 C 13.262 15.946 12.638 16.000 12.000 16.000 C 11.363 16.000 10.738 15.946 10.130 15.842 L 9.343 18.782 Z"),
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
        return _eyeCloseLine!!
    }

private var _eyeCloseLine: ImageVector? = null
