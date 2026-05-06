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
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM78 46h28v92h-28ZM112 150c3.314 0 6-2.686 6-6v-98h20v98c0 3.314 2.686 6 6 6h10v60h-52v-60ZM150 138v-92h28v92ZM46 208v-160c0-1.105 .895-2 2-2h18v98c0 3.314 2.686 6 6 6h18v60h-42c-1.105 0-2-.895-2-2ZM210 208c0 1.105-.895 2-2 2h-42v-60h18c3.314 0 6-2.686 6-6v-98h18c1.105 0 2 .895 2 2Z"),
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
