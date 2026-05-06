package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorBoldIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.73 135l-52 72c-2.256 3.125-5.876 4.977-9.73 4.977-3.854 0-7.474-1.851-9.73-4.977L76 76.5 33.73 135c-2.409 3.71-6.665 5.794-11.073 5.422-4.408-.372-8.254-3.139-10.008-7.2C10.896 129.161 11.518 124.464 14.27 121L66.27 49C68.526 45.875 72.146 44.023 76 44.023c3.854 0 7.474 1.851 9.73 4.977L180 179.5 222.27 121c2.409-3.71 6.665-5.794 11.073-5.422 4.408 .372 8.254 3.139 10.008 7.2 1.754 4.061 1.131 8.758-1.621 12.222Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
