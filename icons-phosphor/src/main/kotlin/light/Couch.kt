package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorLightIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 107.370 L 238.000 72.000 C 238.000 64.268 231.732 58.000 224.000 58.000 L 32.000 58.000 C 24.268 58.000 18.000 64.268 18.000 72.000 L 18.000 107.370 C 13.120 109.685 10.007 114.599 10.000 120.000 L 10.000 168.000 C 10.000 175.732 16.268 182.000 24.000 182.000 L 34.000 182.000 L 34.000 200.000 C 34.000 203.314 36.686 206.000 40.000 206.000 C 43.314 206.000 46.000 203.314 46.000 200.000 L 46.000 182.000 L 210.000 182.000 L 210.000 200.000 C 210.000 203.314 212.686 206.000 216.000 206.000 C 219.314 206.000 222.000 203.314 222.000 200.000 L 222.000 182.000 L 232.000 182.000 C 239.732 182.000 246.000 175.732 246.000 168.000 L 246.000 120.000 C 245.993 114.599 242.880 109.685 238.000 107.370 ZM 226.000 72.000 L 226.000 106.000 L 216.000 106.000 C 208.268 106.000 202.000 112.268 202.000 120.000 L 202.000 138.000 L 134.000 138.000 L 134.000 70.000 L 224.000 70.000 C 225.105 70.000 226.000 70.895 226.000 72.000 ZM 32.000 70.000 L 122.000 70.000 L 122.000 138.000 L 54.000 138.000 L 54.000 120.000 C 54.000 112.268 47.732 106.000 40.000 106.000 L 30.000 106.000 L 30.000 72.000 C 30.000 70.895 30.895 70.000 32.000 70.000 ZM 234.000 168.000 C 234.000 169.105 233.105 170.000 232.000 170.000 L 24.000 170.000 C 22.895 170.000 22.000 169.105 22.000 168.000 L 22.000 120.000 C 22.000 118.895 22.895 118.000 24.000 118.000 L 40.000 118.000 C 41.105 118.000 42.000 118.895 42.000 120.000 L 42.000 144.000 C 42.000 147.314 44.686 150.000 48.000 150.000 L 208.000 150.000 C 211.314 150.000 214.000 147.314 214.000 144.000 L 214.000 120.000 C 214.000 118.895 214.895 118.000 216.000 118.000 L 232.000 118.000 C 233.105 118.000 234.000 118.895 234.000 120.000 Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
