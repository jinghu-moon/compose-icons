package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorBoldIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 20h-128C52.954 20 44 28.954 44 40v176c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-176C212 28.954 203.046 20 192 20ZM188 212h-120v-168h120ZM112 76c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM128 196c24.301 0 44-19.699 44-44 0-24.301-19.699-44-44-44-24.301 0-44 19.699-44 44 .028 24.289 19.711 43.972 44 44ZM128 132c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20Z"),
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
