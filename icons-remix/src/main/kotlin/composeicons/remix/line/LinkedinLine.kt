package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LinkedinLine: ImageVector
    get() {
        if (_linkedinLine != null) return _linkedinLine!!
        _linkedinLine = remixIcon(
            name = "LinkedinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 9.55C12.918 8.613 14.112 8 15.501 8c3.037 0 5.5 2.462 5.5 5.5v7.5h-2v-7.5C19.001 11.567 17.434 10 15.501 10c-1.933 0-3.5 1.567-3.5 3.5v7.5h-2v-12.5h2v1.05ZM5.001 6.5C4.173 6.5 3.501 5.828 3.501 5c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5ZM4.001 8.5h2v12.5h-2v-12.5Z"),
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
        return _linkedinLine!!
    }

private var _linkedinLine: ImageVector? = null
