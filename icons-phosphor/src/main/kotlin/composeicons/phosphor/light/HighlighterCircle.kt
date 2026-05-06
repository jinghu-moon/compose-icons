package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorLightIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.12 55.87C174.423 29.753 136.693 19.425 101.277 28.813 65.861 38.201 38.202 65.863 28.816 101.279c-9.386 35.417 .945 73.146 27.064 98.841 25.697 26.117 63.427 36.445 98.843 27.057 35.416-9.388 63.076-37.05 72.461-72.466 9.386-35.416-.945-73.146-27.064-98.841ZM94 211.37v-59.37c0-1.105 .895-2 2-2h64c1.105 0 2 .895 2 2v59.37c-21.805 8.84-46.195 8.84-68 0ZM146 138h-36v-38.29l36-18ZM191.64 191.64h0c-5.292 5.292-11.217 9.91-17.64 13.75v-53.39c0-7.732-6.268-14-14-14h-2v-66c.001-2.079-1.075-4.01-2.843-5.104-1.768-1.094-3.977-1.194-5.837-.266l-48 24C99.285 91.646 97.999 93.725 98 96v42h-2c-7.732 0-14 6.268-14 14v53.39C75.577 201.55 69.652 196.932 64.36 191.64 29.213 156.493 29.213 99.508 64.361 64.361c35.147-35.147 92.132-35.147 127.279 0 35.147 35.147 35.147 92.132 .001 127.279Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
