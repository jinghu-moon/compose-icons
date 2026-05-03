package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToggleRight: ImageVector
    get() {
        if (_toggleRight != null) return _toggleRight!!
        _toggleRight = phosphorLightIcon(
            name = "ToggleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 58.000 L 80.000 58.000 C 41.340 58.000 10.000 89.340 10.000 128.000 C 10.000 166.660 41.340 198.000 80.000 198.000 L 176.000 198.000 C 214.660 198.000 246.000 166.660 246.000 128.000 C 246.000 89.340 214.660 58.000 176.000 58.000 ZM 176.000 186.000 L 80.000 186.000 C 47.967 186.000 22.000 160.033 22.000 128.000 C 22.000 95.967 47.967 70.000 80.000 70.000 L 176.000 70.000 C 208.033 70.000 234.000 95.967 234.000 128.000 C 234.000 160.033 208.033 186.000 176.000 186.000 ZM 176.000 90.000 C 155.013 90.000 138.000 107.013 138.000 128.000 C 138.000 148.987 155.013 166.000 176.000 166.000 C 196.987 166.000 214.000 148.987 214.000 128.000 C 214.000 107.013 196.987 90.000 176.000 90.000 ZM 176.000 154.000 C 161.641 154.000 150.000 142.359 150.000 128.000 C 150.000 113.641 161.641 102.000 176.000 102.000 C 190.359 102.000 202.000 113.641 202.000 128.000 C 202.000 142.359 190.359 154.000 176.000 154.000 Z"),
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
        return _toggleRight!!
    }

private var _toggleRight: ImageVector? = null
