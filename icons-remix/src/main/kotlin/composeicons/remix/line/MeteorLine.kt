package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MeteorLine: ImageVector
    get() {
        if (_meteorLine != null) return _meteorLine!!
        _meteorLine = remixIcon(
            name = "MeteorLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 1v12c0 4.971-4.029 9-9 9C7.029 22 3 17.971 3 13 3 9.721 4.754 6.851 7.375 5.278L14 1.453v2.77L21 1ZM19 4.122 12 7.346v-2.43L8.597 6.881C6.472 8.066 5.101 10.267 5.005 12.726L5 13c0 3.866 3.134 7 7 7 3.785 0 6.869-3.005 6.996-6.759L19 13v-8.878ZM12 8c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 18 7 15.761 7 13 7 10.239 9.239 8 12 8ZM12 10c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3Z"),
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
        return _meteorLine!!
    }

private var _meteorLine: ImageVector? = null
