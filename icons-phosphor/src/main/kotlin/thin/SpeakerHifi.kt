package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorThinIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 L 52.000 216.000 C 52.000 222.627 57.373 228.000 64.000 228.000 L 192.000 228.000 C 198.627 228.000 204.000 222.627 204.000 216.000 L 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 ZM 196.000 216.000 C 196.000 218.209 194.209 220.000 192.000 220.000 L 64.000 220.000 C 61.791 220.000 60.000 218.209 60.000 216.000 L 60.000 40.000 C 60.000 37.791 61.791 36.000 64.000 36.000 L 192.000 36.000 C 194.209 36.000 196.000 37.791 196.000 40.000 ZM 120.000 76.000 C 120.000 71.582 123.582 68.000 128.000 68.000 C 132.418 68.000 136.000 71.582 136.000 76.000 C 136.000 80.418 132.418 84.000 128.000 84.000 C 123.582 84.000 120.000 80.418 120.000 76.000 ZM 128.000 116.000 C 108.118 116.000 92.000 132.118 92.000 152.000 C 92.000 171.882 108.118 188.000 128.000 188.000 C 147.882 188.000 164.000 171.882 164.000 152.000 C 164.000 132.118 147.882 116.000 128.000 116.000 ZM 128.000 180.000 C 112.536 180.000 100.000 167.464 100.000 152.000 C 100.000 136.536 112.536 124.000 128.000 124.000 C 143.464 124.000 156.000 136.536 156.000 152.000 C 156.000 167.464 143.464 180.000 128.000 180.000 Z"),
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
