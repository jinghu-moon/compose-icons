package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorBoldIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.49 111.07 90.41 22.94C84.259 19.19 76.566 19.038 70.271 22.542 63.976 26.047 60.053 32.666 60 39.87v176.26c.053 7.204 3.976 13.823 10.271 17.328 6.295 3.504 13.988 3.353 20.139-.398L234.49 144.93c5.908-3.597 9.514-10.013 9.514-16.93 0-6.917-3.606-13.333-9.514-16.93ZM84 208.85v-161.7L216.16 128Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
