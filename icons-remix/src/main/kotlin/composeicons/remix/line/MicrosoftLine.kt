package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicrosoftLine: ImageVector
    get() {
        if (_microsoftLine != null) return _microsoftLine!!
        _microsoftLine = remixIcon(
            name = "MicrosoftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.001 5h-6v6h6v-6ZM13.001 5v6h6v-6h-6ZM19.001 13h-6v6h6v-6ZM11.001 19v-6h-6v6h6ZM3.001 3h18v18h-18v-18Z"),
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
        return _microsoftLine!!
    }

private var _microsoftLine: ImageVector? = null
