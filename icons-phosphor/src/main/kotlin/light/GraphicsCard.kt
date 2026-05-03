package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorLightIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 50.000 L 16.000 50.000 C 12.686 50.000 10.000 52.686 10.000 56.000 L 10.000 208.000 C 10.000 211.314 12.686 214.000 16.000 214.000 C 19.314 214.000 22.000 211.314 22.000 208.000 L 22.000 190.000 L 42.000 190.000 L 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 C 51.314 214.000 54.000 211.314 54.000 208.000 L 54.000 190.000 L 74.000 190.000 L 74.000 208.000 C 74.000 211.314 76.686 214.000 80.000 214.000 C 83.314 214.000 86.000 211.314 86.000 208.000 L 86.000 190.000 L 106.000 190.000 L 106.000 208.000 C 106.000 211.314 108.686 214.000 112.000 214.000 C 115.314 214.000 118.000 211.314 118.000 208.000 L 118.000 190.000 L 232.000 190.000 C 239.732 190.000 246.000 183.732 246.000 176.000 L 246.000 64.000 C 246.000 56.268 239.732 50.000 232.000 50.000 ZM 234.000 176.000 C 234.000 177.105 233.105 178.000 232.000 178.000 L 22.000 178.000 L 22.000 62.000 L 232.000 62.000 C 233.105 62.000 234.000 62.895 234.000 64.000 ZM 176.000 82.000 C 155.013 82.000 138.000 99.013 138.000 120.000 C 138.000 140.987 155.013 158.000 176.000 158.000 C 196.987 158.000 214.000 140.987 214.000 120.000 C 214.000 99.013 196.987 82.000 176.000 82.000 ZM 202.000 120.000 C 202.006 124.820 200.662 129.545 198.120 133.640 L 162.360 97.880 C 170.379 92.938 180.444 92.721 188.669 97.311 C 196.895 101.901 201.995 110.580 202.000 120.000 ZM 150.000 120.000 C 149.994 115.180 151.338 110.455 153.880 106.360 L 189.640 142.120 C 181.621 147.062 171.556 147.279 163.331 142.689 C 155.105 138.099 150.005 129.420 150.000 120.000 ZM 80.000 82.000 C 59.013 82.000 42.000 99.013 42.000 120.000 C 42.000 140.987 59.013 158.000 80.000 158.000 C 100.987 158.000 118.000 140.987 118.000 120.000 C 118.000 99.013 100.987 82.000 80.000 82.000 ZM 106.000 120.000 C 106.006 124.820 104.662 129.545 102.120 133.640 L 66.360 97.880 C 74.379 92.938 84.444 92.721 92.669 97.311 C 100.895 101.901 105.995 110.580 106.000 120.000 ZM 54.000 120.000 C 53.994 115.180 55.338 110.455 57.880 106.360 L 93.640 142.120 C 85.621 147.062 75.556 147.279 67.331 142.689 C 59.105 138.099 54.005 129.420 54.000 120.000 Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
