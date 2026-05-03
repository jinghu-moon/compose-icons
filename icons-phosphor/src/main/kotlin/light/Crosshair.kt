package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorLightIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 122.000 L 221.800 122.000 C 218.722 74.843 181.157 37.278 134.000 34.200 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 34.200 C 74.843 37.278 37.278 74.843 34.200 122.000 L 24.000 122.000 C 20.686 122.000 18.000 124.686 18.000 128.000 C 18.000 131.314 20.686 134.000 24.000 134.000 L 34.200 134.000 C 37.278 181.157 74.843 218.722 122.000 221.800 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 221.800 C 181.157 218.722 218.722 181.157 221.800 134.000 L 232.000 134.000 C 235.314 134.000 238.000 131.314 238.000 128.000 C 238.000 124.686 235.314 122.000 232.000 122.000 ZM 134.000 209.760 L 134.000 200.000 C 134.000 196.686 131.314 194.000 128.000 194.000 C 124.686 194.000 122.000 196.686 122.000 200.000 L 122.000 209.760 C 81.476 206.739 49.261 174.524 46.240 134.000 L 56.000 134.000 C 59.314 134.000 62.000 131.314 62.000 128.000 C 62.000 124.686 59.314 122.000 56.000 122.000 L 46.240 122.000 C 49.261 81.476 81.476 49.261 122.000 46.240 L 122.000 56.000 C 122.000 59.314 124.686 62.000 128.000 62.000 C 131.314 62.000 134.000 59.314 134.000 56.000 L 134.000 46.240 C 174.524 49.261 206.739 81.476 209.760 122.000 L 200.000 122.000 C 196.686 122.000 194.000 124.686 194.000 128.000 C 194.000 131.314 196.686 134.000 200.000 134.000 L 209.760 134.000 C 206.739 174.524 174.524 206.739 134.000 209.760 ZM 128.000 90.000 C 107.013 90.000 90.000 107.013 90.000 128.000 C 90.000 148.987 107.013 166.000 128.000 166.000 C 148.987 166.000 166.000 148.987 166.000 128.000 C 166.000 107.013 148.987 90.000 128.000 90.000 ZM 128.000 154.000 C 113.641 154.000 102.000 142.359 102.000 128.000 C 102.000 113.641 113.641 102.000 128.000 102.000 C 142.359 102.000 154.000 113.641 154.000 128.000 C 154.000 142.359 142.359 154.000 128.000 154.000 Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
