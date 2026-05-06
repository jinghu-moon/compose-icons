package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ContractLeftLine: ImageVector
    get() {
        if (_contractLeftLine != null) return _contractLeftLine!!
        _contractLeftLine = remixIcon(
            name = "ContractLeftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.071 4.929l1.414 1.414-4.657 4.657L21 11v2l-9.172-0 4.657 4.657-1.414 1.414L8 12 15.071 4.929ZM4 19v-14h2v14h-2Z"),
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
        return _contractLeftLine!!
    }

private var _contractLeftLine: ImageVector? = null
