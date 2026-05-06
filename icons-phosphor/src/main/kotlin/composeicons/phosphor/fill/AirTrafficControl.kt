package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorFillIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.11 70.82C226.114 66.544 221.221 63.998 216 64h-80v-32h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v32h-80c-5.213 .012-10.094 2.563-13.08 6.836C23.934 75.11 23.218 80.571 25 85.47l26.19 72c2.295 6.31 8.286 10.515 15 10.53h123.63c6.714-.015 12.705-4.22 15-10.53l26.19-72c1.794-4.901 1.085-10.369-1.9-14.65ZM102.52 151.87c-.475 .087-.957 .131-1.44 .13-3.862-.005-7.17-2.77-7.86-6.57L83 89.43c-.79-4.349 2.096-8.515 6.445-9.305 4.349-.79 8.515 2.096 9.305 6.445l10.18 56c.79 4.337-2.076 8.495-6.41 9.3ZM173 89.43l-10.19 56c-.69 3.8-3.997 6.565-7.86 6.57-.483 .001-.965-.043-1.44-.13-4.346-.79-7.229-4.954-6.44-9.3L157.25 86.57c.79-4.349 4.956-7.235 9.305-6.445 4.349 .79 7.235 4.956 6.445 9.305ZM160 188v44c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8v-44c0-2.209 1.791-4 4-4h56c2.209 0 4 1.791 4 4Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
