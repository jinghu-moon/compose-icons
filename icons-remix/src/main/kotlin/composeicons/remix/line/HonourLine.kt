package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HonourLine: ImageVector
    get() {
        if (_honourLine != null) return _honourLine!!
        _honourLine = remixIcon(
            name = "HonourLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 4v14.722c0 .198-.117 .377-.298 .457L12 23.031 3.298 19.179C3.117 19.099 3 18.919 3 18.722v-14.722h-2v-2h22v2h-2ZM5 4v13.745l7 3.099 7-3.099v-13.745h-14ZM8 8h8v2h-8v-2ZM8 12h8v2h-8v-2Z"),
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
        return _honourLine!!
    }

private var _honourLine: ImageVector? = null
