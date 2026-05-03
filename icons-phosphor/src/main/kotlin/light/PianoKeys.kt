package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorLightIcon(
            name = "PianoKeys",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 78.000 46.000 L 106.000 46.000 L 106.000 138.000 L 78.000 138.000 ZM 112.000 150.000 C 115.314 150.000 118.000 147.314 118.000 144.000 L 118.000 46.000 L 138.000 46.000 L 138.000 144.000 C 138.000 147.314 140.686 150.000 144.000 150.000 L 154.000 150.000 L 154.000 210.000 L 102.000 210.000 L 102.000 150.000 ZM 150.000 138.000 L 150.000 46.000 L 178.000 46.000 L 178.000 138.000 ZM 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 66.000 46.000 L 66.000 144.000 C 66.000 147.314 68.686 150.000 72.000 150.000 L 90.000 150.000 L 90.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 166.000 210.000 L 166.000 150.000 L 184.000 150.000 C 187.314 150.000 190.000 147.314 190.000 144.000 L 190.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 Z"),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
