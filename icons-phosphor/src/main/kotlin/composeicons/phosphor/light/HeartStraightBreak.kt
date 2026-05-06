package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorLightIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.62 58.38c-21.879-21.812-57.281-21.812-79.16 0L128 72.24 113.56 58.34C91.687 36.47 56.225 36.472 34.355 58.345c-21.87 21.873-21.868 57.335 .005 79.205l89.37 90.66c1.128 1.145 2.668 1.79 4.275 1.79 1.607 0 3.147-.645 4.275-1.79l89.33-90.63c21.842-21.881 21.846-57.314 .01-79.2ZM213.11 129.13 128 215.45 42.89 129.1C25.703 111.916 25.701 84.052 42.885 66.865 60.069 49.678 87.933 49.676 105.12 66.86l.08 .08 14.16 13.64L107.85 91.66c-1.159 1.117-1.82 2.654-1.835 4.263-.015 1.61 .617 3.158 1.755 4.297L135.53 128l-11.76 11.76c-1.535 1.512-2.142 3.732-1.588 5.815 .553 2.083 2.181 3.709 4.265 4.26 2.084 .551 4.303-.058 5.813-1.595l16-16c1.127-1.125 1.76-2.653 1.76-4.245 0-1.592-.633-3.12-1.76-4.245L120.58 96.06 150.82 66.94c.031-.021 .059-.049 .08-.08 17.195-17.179 45.061-17.165 62.24 .03 17.179 17.195 17.165 45.061-.03 62.24Z"),
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
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
