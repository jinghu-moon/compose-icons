package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorLightIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 106.000 L 88.000 106.000 C 67.013 106.000 50.000 123.013 50.000 144.000 L 50.000 152.000 C 50.000 172.987 67.013 190.000 88.000 190.000 L 168.000 190.000 C 188.987 190.000 206.000 172.987 206.000 152.000 L 206.000 144.000 C 206.000 123.013 188.987 106.000 168.000 106.000 ZM 194.000 152.000 C 194.000 166.359 182.359 178.000 168.000 178.000 L 88.000 178.000 C 73.641 178.000 62.000 166.359 62.000 152.000 L 62.000 144.000 C 62.000 129.641 73.641 118.000 88.000 118.000 L 168.000 118.000 C 182.359 118.000 194.000 129.641 194.000 144.000 ZM 208.000 42.000 C 193.749 42.016 181.469 52.041 178.600 66.000 L 77.400 66.000 C 74.333 50.896 60.320 40.573 44.985 42.122 C 29.650 43.671 17.985 56.587 18.000 72.000 L 18.000 152.000 C 18.044 190.642 49.358 221.956 88.000 222.000 L 168.000 222.000 C 206.642 221.956 237.956 190.642 238.000 152.000 L 238.000 72.000 C 238.000 55.431 224.569 42.000 208.000 42.000 ZM 226.000 152.000 C 225.961 184.017 200.017 209.961 168.000 210.000 L 88.000 210.000 C 55.983 209.961 30.039 184.017 30.000 152.000 L 30.000 72.000 C 30.000 62.059 38.059 54.000 48.000 54.000 C 57.941 54.000 66.000 62.059 66.000 72.000 C 66.000 75.314 68.686 78.000 72.000 78.000 L 184.000 78.000 C 187.314 78.000 190.000 75.314 190.000 72.000 C 190.000 62.059 198.059 54.000 208.000 54.000 C 217.941 54.000 226.000 62.059 226.000 72.000 ZM 102.000 148.000 C 102.000 153.523 97.523 158.000 92.000 158.000 C 86.477 158.000 82.000 153.523 82.000 148.000 C 82.000 142.477 86.477 138.000 92.000 138.000 C 97.523 138.000 102.000 142.477 102.000 148.000 ZM 174.000 148.000 C 174.000 153.523 169.523 158.000 164.000 158.000 C 158.477 158.000 154.000 153.523 154.000 148.000 C 154.000 142.477 158.477 138.000 164.000 138.000 C 169.523 138.000 174.000 142.477 174.000 148.000 Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
