package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorLightIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 26.000 L 64.000 26.000 C 56.268 26.000 50.000 32.268 50.000 40.000 L 50.000 216.000 C 50.000 223.732 56.268 230.000 64.000 230.000 L 192.000 230.000 C 199.732 230.000 206.000 223.732 206.000 216.000 L 206.000 40.000 C 206.000 32.268 199.732 26.000 192.000 26.000 ZM 194.000 216.000 C 194.000 217.105 193.105 218.000 192.000 218.000 L 64.000 218.000 C 62.895 218.000 62.000 217.105 62.000 216.000 L 62.000 40.000 C 62.000 38.895 62.895 38.000 64.000 38.000 L 192.000 38.000 C 193.105 38.000 194.000 38.895 194.000 40.000 ZM 118.000 76.000 C 118.000 70.477 122.477 66.000 128.000 66.000 C 133.523 66.000 138.000 70.477 138.000 76.000 C 138.000 81.523 133.523 86.000 128.000 86.000 C 122.477 86.000 118.000 81.523 118.000 76.000 ZM 128.000 114.000 C 107.013 114.000 90.000 131.013 90.000 152.000 C 90.000 172.987 107.013 190.000 128.000 190.000 C 148.987 190.000 166.000 172.987 166.000 152.000 C 166.000 131.013 148.987 114.000 128.000 114.000 ZM 128.000 178.000 C 113.641 178.000 102.000 166.359 102.000 152.000 C 102.000 137.641 113.641 126.000 128.000 126.000 C 142.359 126.000 154.000 137.641 154.000 152.000 C 154.000 166.359 142.359 178.000 128.000 178.000 Z"),
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
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null
