package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExpandDiagonalS2Line: ImageVector
    get() {
        if (_expandDiagonalS2Line != null) return _expandDiagonalS2Line!!
        _expandDiagonalS2Line = remixIcon(
            name = "ExpandDiagonalS2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 8.414v3.586h-2v-7h7v2h-3.586L17 15.586v-3.586h2v7h-7v-2h3.586L7 8.414Z"),
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
        return _expandDiagonalS2Line!!
    }

private var _expandDiagonalS2Line: ImageVector? = null
