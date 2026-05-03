package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = phosphorLightIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 112.000 C 182.000 115.314 179.314 118.000 176.000 118.000 L 112.000 118.000 C 108.686 118.000 106.000 115.314 106.000 112.000 C 106.000 108.686 108.686 106.000 112.000 106.000 L 176.000 106.000 C 179.314 106.000 182.000 108.686 182.000 112.000 ZM 176.000 138.000 L 112.000 138.000 C 108.686 138.000 106.000 140.686 106.000 144.000 C 106.000 147.314 108.686 150.000 112.000 150.000 L 176.000 150.000 C 179.314 150.000 182.000 147.314 182.000 144.000 C 182.000 140.686 179.314 138.000 176.000 138.000 ZM 222.000 48.000 L 222.000 208.000 C 222.000 215.732 215.732 222.000 208.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 48.000 C 34.000 40.268 40.268 34.000 48.000 34.000 L 208.000 34.000 C 215.732 34.000 222.000 40.268 222.000 48.000 ZM 48.000 210.000 L 74.000 210.000 L 74.000 46.000 L 48.000 46.000 C 46.895 46.000 46.000 46.895 46.000 48.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 ZM 210.000 48.000 C 210.000 46.895 209.105 46.000 208.000 46.000 L 86.000 46.000 L 86.000 210.000 L 208.000 210.000 C 209.105 210.000 210.000 209.105 210.000 208.000 Z"),
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
        return _notebook!!
    }

private var _notebook: ImageVector? = null
