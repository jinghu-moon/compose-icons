package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractLeftRightLine: ImageVector
    get() {
        if (_contractLeftRightLine != null) return _contractLeftRightLine!!
        _contractLeftRightLine = remixIcon(
            name = "ContractLeftRightLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.793 5.793 12.586 12l6.207 6.207 1.414-1.414L15.414 12 20.207 7.207 18.793 5.793ZM5.207 18.207l6.207-6.207L5.207 5.793 3.793 7.207l4.793 4.793L3.793 16.793l1.414 1.414Z"),
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
        return _contractLeftRightLine!!
    }

private var _contractLeftRightLine: ImageVector? = null
