package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VuejsLine: ImageVector
    get() {
        if (_vuejsLine != null) return _vuejsLine!!
        _vuejsLine = remixIcon(
            name = "VuejsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.317 3.000 L 12.001 18.000 L 20.685 3.000 L 23.001 3.000 L 12.001 22.000 L 1.001 3.000 L 3.317 3.000 ZM 7.659 3.000 L 12.001 10.500 L 16.343 3.000 L 18.659 3.000 L 12.001 14.500 L 5.343 3.000 L 7.659 3.000 Z"),
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
        return _vuejsLine!!
    }

private var _vuejsLine: ImageVector? = null
