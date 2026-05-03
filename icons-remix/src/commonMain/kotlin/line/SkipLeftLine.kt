package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipLeftLine: ImageVector
    get() {
        if (_skipLeftLine != null) return _skipLeftLine!!
        _skipLeftLine = remixIcon(
            name = "SkipLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.914 12.000 L 18.707 7.207 L 17.293 5.793 L 11.086 12.000 L 17.293 18.207 L 18.707 16.793 L 13.914 12.000 ZM 7.000 18.000 L 7.000 6.000 L 9.000 6.000 L 9.000 18.000 L 7.000 18.000 Z"),
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
        return _skipLeftLine!!
    }

private var _skipLeftLine: ImageVector? = null
