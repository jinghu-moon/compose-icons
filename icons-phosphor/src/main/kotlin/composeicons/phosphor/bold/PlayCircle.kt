package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) return _playCircle!!
        _playCircle = phosphorBoldIcon(
            name = "PlayCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 128c.001 3.939-1.931 7.628-5.17 9.87l-52 36c-3.67 2.541-8.447 2.834-12.401 .762C102.475 172.559 99.999 168.464 100 164v-72c-.001-4.464 2.475-8.559 6.429-10.632 3.954-2.072 8.731-1.779 12.401 .762l52 36c3.239 2.242 5.171 5.931 5.17 9.87ZM236 128c0 59.647-48.353 108-108 108C68.353 236 20 187.647 20 128 20 68.353 68.353 20 128 20c59.619 .066 107.934 48.381 108 108ZM212 128C212 81.608 174.392 44 128 44 81.608 44 44 81.608 44 128c0 46.392 37.608 84 84 84 46.371-.05 83.95-37.629 84-84Z"),
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
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
