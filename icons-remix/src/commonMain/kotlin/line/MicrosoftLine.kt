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
                pathData = parseSvgPathData("M 11.001 5.000 L 5.001 5.000 L 5.001 11.000 L 11.001 11.000 L 11.001 5.000 ZM 13.001 5.000 L 13.001 11.000 L 19.001 11.000 L 19.001 5.000 L 13.001 5.000 ZM 19.001 13.000 L 13.001 13.000 L 13.001 19.000 L 19.001 19.000 L 19.001 13.000 ZM 11.001 19.000 L 11.001 13.000 L 5.001 13.000 L 5.001 19.000 L 11.001 19.000 ZM 3.001 3.000 L 21.001 3.000 L 21.001 21.000 L 3.001 21.000 L 3.001 3.000 Z"),
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
