package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipRightLine: ImageVector
    get() {
        if (_skipRightLine != null) return _skipRightLine!!
        _skipRightLine = remixIcon(
            name = "SkipRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.086 12.000 L 5.293 16.793 L 6.707 18.207 L 12.914 12.000 L 6.707 5.793 L 5.293 7.207 L 10.086 12.000 ZM 17.000 6.000 L 17.000 18.000 L 15.000 18.000 L 15.000 6.000 L 17.000 6.000 Z"),
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
        return _skipRightLine!!
    }

private var _skipRightLine: ImageVector? = null
