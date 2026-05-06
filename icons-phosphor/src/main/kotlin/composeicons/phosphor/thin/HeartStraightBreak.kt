package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorThinIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.21 59.8c-21.099-21.037-55.241-21.037-76.34 0L128 75 112.18 59.8C91.097 38.703 56.902 38.692 35.805 59.775c-21.097 21.083-21.108 55.278-.025 76.375l89.37 90.66c.752 .763 1.779 1.193 2.85 1.193 1.071 0 2.098-.43 2.85-1.193l89.36-90.64c21.051-21.105 21.051-55.265 0-76.37ZM214.53 130.54 128 218.3 41.45 130.52C23.501 112.535 23.53 83.404 41.515 65.455c17.985-17.949 47.116-17.92 65.065 .065l15.65 15.07-13 12.52c-.787 .755-1.231 1.799-1.23 2.89-.009 1.072 .413 2.102 1.17 2.86L138.35 128l-13.18 13.17c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0l16-16c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83L117.71 96 149.48 65.42c17.971-17.963 47.102-17.956 65.065 .015 17.963 17.971 17.956 47.102-.015 65.065Z"),
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
