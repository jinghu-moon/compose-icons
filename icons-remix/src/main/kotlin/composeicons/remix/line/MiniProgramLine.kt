package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MiniProgramLine: ImageVector
    get() {
        if (_miniProgramLine != null) return _miniProgramLine!!
        _miniProgramLine = remixIcon(
            name = "MiniProgramLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM12.001 20c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C7.583 4 4.001 7.582 4.001 12c0 4.418 3.582 8 8 8ZM13.001 14c0 1.933-1.567 3.5-3.5 3.5-1.933 0-3.5-1.567-3.5-3.5 0-1.374 .799-2.604 2.023-3.174 .501-.233 1.096-.016 1.329 .484 .233 .501 .016 1.095-.484 1.329-.525 .245-.868 .772-.868 1.361 0 .828 .672 1.5 1.5 1.5 .828 0 1.5-.672 1.5-1.5v-4c0-1.933 1.567-3.5 3.5-3.5 1.933 0 3.5 1.567 3.5 3.5 0 1.374-.799 2.604-2.023 3.174-.501 .233-1.095 .016-1.329-.484-.233-.501-.017-1.096 .484-1.329 .525-.245 .868-.771 .868-1.361 0-.828-.672-1.5-1.5-1.5-.829 0-1.5 .672-1.5 1.5v4Z"),
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
        return _miniProgramLine!!
    }

private var _miniProgramLine: ImageVector? = null
