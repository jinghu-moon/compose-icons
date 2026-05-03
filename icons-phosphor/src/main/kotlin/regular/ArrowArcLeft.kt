package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorRegularIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 184.000 C 232.000 188.418 228.418 192.000 224.000 192.000 C 219.582 192.000 216.000 188.418 216.000 184.000 C 215.996 148.411 194.555 116.328 161.675 102.709 C 128.794 89.090 90.948 96.617 65.780 121.780 L 43.400 144.000 L 88.000 144.000 C 92.418 144.000 96.000 147.582 96.000 152.000 C 96.000 156.418 92.418 160.000 88.000 160.000 L 24.000 160.000 C 19.582 160.000 16.000 156.418 16.000 152.000 L 16.000 88.000 C 16.000 83.582 19.582 80.000 24.000 80.000 C 28.418 80.000 32.000 83.582 32.000 88.000 L 32.000 132.770 L 54.480 110.440 C 84.228 80.707 128.957 71.819 167.812 87.920 C 206.668 104.021 232.001 141.941 232.000 184.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
