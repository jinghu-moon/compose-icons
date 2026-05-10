package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MopedFront: ImageVector
    get() {
        if (_mopedFront != null) return _mopedFront!!
        _mopedFront = phosphorFillIcon(
            name = "MopedFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-40.8C163.414 21.357 147.023 7.96 128 7.96 108.977 7.96 92.586 21.357 88.8 40h-40.8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40.8c1.734 8.438 6.146 16.091 12.58 21.82C78.627 88.249 64.028 110.971 64 136v64c0 8.837 7.163 16 16 16h16c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32h16c8.837 0 16-7.163 16-16v-64C191.972 110.971 177.373 88.249 154.62 77.82 161.054 72.091 165.466 64.438 167.2 56h40.8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM144 216c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16v-48c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM128 72C114.745 72 104 61.255 104 48c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _mopedFront!!
    }

private var _mopedFront: ImageVector? = null
