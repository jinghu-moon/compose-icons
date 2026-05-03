package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ConnectorFill: ImageVector
    get() {
        if (_connectorFill != null) return _connectorFill!!
        _connectorFill = remixIcon(
            name = "ConnectorFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 17.000 C 21.000 19.209 19.209 21.000 17.000 21.000 C 14.791 21.000 13.000 19.209 13.000 17.000 C 13.000 14.791 14.791 13.000 17.000 13.000 C 19.209 13.000 21.000 14.791 21.000 17.000 ZM 11.000 7.000 C 11.000 9.209 9.209 11.000 7.000 11.000 C 4.791 11.000 3.000 9.209 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 C 9.209 3.000 11.000 4.791 11.000 7.000 ZM 21.000 7.000 C 21.000 9.209 19.209 11.000 17.000 11.000 C 16.258 11.000 15.563 10.797 14.968 10.445 L 10.445 14.968 C 10.797 15.563 11.000 16.258 11.000 17.000 C 11.000 19.209 9.209 21.000 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 C 3.000 14.791 4.791 13.000 7.000 13.000 C 7.741 13.000 8.436 13.202 9.031 13.554 L 13.554 9.031 C 13.202 8.436 13.000 7.741 13.000 7.000 C 13.000 4.791 14.791 3.000 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 Z"),
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
        return _connectorFill!!
    }

private var _connectorFill: ImageVector? = null
