package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkipDownLine: ImageVector
    get() {
        if (_skipDownLine != null) return _skipDownLine!!
        _skipDownLine = remixIcon(
            name = "SkipDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 10.086 L 7.207 5.293 L 5.793 6.707 L 12.000 12.914 L 18.207 6.707 L 16.793 5.293 L 12.000 10.086 ZM 18.000 17.000 L 6.000 17.000 L 6.000 15.000 L 18.000 15.000 L 18.000 17.000 Z"),
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
        return _skipDownLine!!
    }

private var _skipDownLine: ImageVector? = null
