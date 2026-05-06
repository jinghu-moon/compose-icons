package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudOffLine: ImageVector
    get() {
        if (_cloudOffLine != null) return _cloudOffLine!!
        _cloudOffLine = remixIcon(
            name = "CloudOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.515 2.101 22.607 21.192l-1.414 1.414L19.178 20.592C18.503 20.856 17.768 21 17 21h-10C3.686 21 1 18.314 1 15 1 12.385 2.673 10.16 5.008 9.339 5.003 9.226 5 9.114 5 9 5 8.222 5.127 7.474 5.361 6.775L2.101 3.515 3.515 2.101ZM7 9c0 .081 .002 .163 .006 .243l.071 1.487-1.405 .494C4.084 11.784 3 13.289 3 15c0 2.209 1.791 4 4 4h10c.186 0 .369-.013 .548-.037L7.03 8.445C7.01 8.627 7 8.812 7 9ZM12 2c3.866 0 7 3.134 7 7 0 .114-.003 .226-.008 .339C21.326 10.16 23 12.385 23 15c0 1.088-.29 2.109-.796 2.989L20.711 16.496C20.897 16.034 21 15.529 21 15c0-2.21-1.79-4-4-4-.529 0-1.034 .103-1.496 .289L14.011 9.796C14.891 9.29 15.912 9 17 9 17 6.239 14.761 4 12 4 10.929 4 9.938 4.336 9.124 4.909L7.694 3.481C8.882 2.553 10.376 2 12 2Z"),
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
        return _cloudOffLine!!
    }

private var _cloudOffLine: ImageVector? = null
