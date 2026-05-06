package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorBoldIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L93.6 108h-69.6c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h28v24h-4c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-4v-24h39.42l83.7 92.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM76 204h-24v-24h24ZM92 42.14v-2.14c0-11.046 8.954-20 20-20h32c11.046 0 20 8.954 20 20v32c0 11.046-8.954 20-20 20h-5.58c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h1.58v-24h-24.14c-.956 6.205-6.533 10.624-12.793 10.136C96.808 53.648 91.983 48.418 92 42.14ZM244 120c0 6.627-5.373 12-12 12h-28v6.94c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-6.94h-5.21c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h57.21c6.627 0 12 5.373 12 12Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
