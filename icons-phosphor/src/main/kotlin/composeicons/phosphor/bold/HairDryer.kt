package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HairDryer: ImageVector
    get() {
        if (_hairDryer != null) return _hairDryer!!
        _hairDryer = phosphorBoldIcon(
            name = "HairDryer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 88C200 70.327 185.673 56 168 56c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM168 96c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM181.06 208.28l31.25-68.76c21.527-18.544 29.255-48.517 19.378-75.158C221.812 37.722 196.413 20.03 168 20c-.67-.003-1.339 .05-2 .16L28.71 43.05C19.053 44.635 11.974 52.994 12 62.78v50.44c-.051 9.805 7.034 18.192 16.71 19.78L124 148.83v51.17c.012 9.759 7.065 18.085 16.69 19.7 3.754 20.984 21.993 36.27 43.31 36.3h16c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-16c-8.027-.001-15.276-4.8-18.41-12.19 6.786-.954 12.617-5.3 15.47-11.53ZM36 66.17 168.93 44c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44L36 109.83ZM166 155.84c.661 .11 1.33 .163 2 .16 3.634-.003 7.263-.298 10.85-.88L160.27 196h-12.27v-43.17Z"),
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
        return _hairDryer!!
    }

private var _hairDryer: ImageVector? = null
