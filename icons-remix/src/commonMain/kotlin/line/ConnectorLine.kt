package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ConnectorLine: ImageVector
    get() {
        if (_connectorLine != null) return _connectorLine!!
        _connectorLine = remixIcon(
            name = "ConnectorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 17.000 C 9.000 16.447 8.777 15.949 8.414 15.586 C 8.051 15.223 7.553 15.000 7.000 15.000 C 5.895 15.000 5.000 15.895 5.000 17.000 C 5.000 18.105 5.895 19.000 7.000 19.000 C 8.105 19.000 9.000 18.105 9.000 17.000 ZM 19.000 17.000 C 19.000 15.895 18.105 15.000 17.000 15.000 C 15.895 15.000 15.000 15.895 15.000 17.000 C 15.000 18.105 15.895 19.000 17.000 19.000 C 18.105 19.000 19.000 18.105 19.000 17.000 ZM 9.000 7.000 C 9.000 5.895 8.105 5.000 7.000 5.000 C 5.895 5.000 5.000 5.895 5.000 7.000 C 5.000 8.105 5.895 9.000 7.000 9.000 C 8.105 9.000 9.000 8.105 9.000 7.000 ZM 19.000 7.000 C 19.000 5.895 18.105 5.000 17.000 5.000 C 15.895 5.000 15.000 5.895 15.000 7.000 C 15.000 7.553 15.223 8.051 15.586 8.414 C 15.949 8.777 16.447 9.000 17.000 9.000 C 18.105 9.000 19.000 8.105 19.000 7.000 ZM 21.000 17.000 C 21.000 19.209 19.209 21.000 17.000 21.000 C 14.791 21.000 13.000 19.209 13.000 17.000 C 13.000 14.791 14.791 13.000 17.000 13.000 C 19.209 13.000 21.000 14.791 21.000 17.000 ZM 11.000 7.000 C 11.000 9.209 9.209 11.000 7.000 11.000 C 4.791 11.000 3.000 9.209 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 C 9.209 3.000 11.000 4.791 11.000 7.000 ZM 21.000 7.000 C 21.000 9.209 19.209 11.000 17.000 11.000 C 16.258 11.000 15.563 10.797 14.968 10.445 L 10.445 14.968 C 10.797 15.563 11.000 16.258 11.000 17.000 C 11.000 19.209 9.209 21.000 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 C 3.000 14.791 4.791 13.000 7.000 13.000 C 7.741 13.000 8.436 13.202 9.031 13.554 L 13.554 9.031 C 13.202 8.436 13.000 7.741 13.000 7.000 C 13.000 4.791 14.791 3.000 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 Z"),
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
        return _connectorLine!!
    }

private var _connectorLine: ImageVector? = null
