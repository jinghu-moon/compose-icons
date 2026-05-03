package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipUpLine: ImageVector
    get() {
        if (_skipUpLine != null) return _skipUpLine!!
        _skipUpLine = remixIcon(
            name = "SkipUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 13.914 L 16.793 18.707 L 18.207 17.293 L 12.000 11.086 L 5.793 17.293 L 7.207 18.707 L 12.000 13.914 ZM 6.000 7.000 L 18.000 7.000 L 18.000 9.000 L 6.000 9.000 L 6.000 7.000 Z"),
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
        return _skipUpLine!!
    }

private var _skipUpLine: ImageVector? = null
