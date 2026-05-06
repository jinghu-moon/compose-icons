package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractUpDownLine: ImageVector
    get() {
        if (_contractUpDownLine != null) return _contractUpDownLine!!
        _contractUpDownLine = remixIcon(
            name = "ContractUpDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.793 5.207 12 11.414 18.207 5.207 16.793 3.793 12 8.586 7.207 3.793 5.793 5.207ZM18.207 18.793 12 12.586 5.793 18.793l1.414 1.414 4.793-4.793 4.793 4.793 1.414-1.414Z"),
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
        return _contractUpDownLine!!
    }

private var _contractUpDownLine: ImageVector? = null
