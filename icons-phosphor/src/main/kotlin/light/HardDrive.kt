package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorLightIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 66.000 L 32.000 66.000 C 24.268 66.000 18.000 72.268 18.000 80.000 L 18.000 176.000 C 18.000 183.732 24.268 190.000 32.000 190.000 L 224.000 190.000 C 231.732 190.000 238.000 183.732 238.000 176.000 L 238.000 80.000 C 238.000 72.268 231.732 66.000 224.000 66.000 ZM 226.000 176.000 C 226.000 177.105 225.105 178.000 224.000 178.000 L 32.000 178.000 C 30.895 178.000 30.000 177.105 30.000 176.000 L 30.000 80.000 C 30.000 78.895 30.895 78.000 32.000 78.000 L 224.000 78.000 C 225.105 78.000 226.000 78.895 226.000 80.000 ZM 198.000 128.000 C 198.000 133.523 193.523 138.000 188.000 138.000 C 182.477 138.000 178.000 133.523 178.000 128.000 C 178.000 122.477 182.477 118.000 188.000 118.000 C 193.523 118.000 198.000 122.477 198.000 128.000 Z"),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
