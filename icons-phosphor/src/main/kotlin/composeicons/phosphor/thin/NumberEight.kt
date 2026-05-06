package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorThinIcon(
            name = "NumberEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M147.08 119.64c18.5-8.903 28.384-29.416 23.818-49.433C166.332 50.191 148.531 35.992 128 35.992c-20.531 0-38.332 14.198-42.898 34.215-4.566 20.016 5.318 40.53 23.818 49.433-23.232 9.164-36.669 33.549-32.005 58.084 4.664 24.535 26.111 42.289 51.085 42.289 24.974 0 46.421-17.754 51.085-42.289 4.664-24.535-8.773-48.92-32.005-58.084ZM92 80C92 60.118 108.118 44 128 44c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 116 92 99.882 92 80ZM128 212C103.699 212 84 192.301 84 168c0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
