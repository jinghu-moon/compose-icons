package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorRegularIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 128C120 110.327 105.673 96 88 96 70.327 96 56 110.327 56 128c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM72 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM224 104h-16v-64c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8v24h-56C31.163 64 24 71.163 24 80v96c0 8.837 7.163 16 16 16h32v16c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-96c0-4.418-3.582-8-8-8ZM165.66 164 216 127.65v72.7ZM112 48h80v77.24l-40 28.89v-74.13c0-8.837-7.163-16-16-16h-24ZM40 80h96v77.9c0 .12 0 .24 0 .36v17.74h-96ZM88 192h48c8.837 0 16-7.163 16-16v-2.13L199.26 208h-111.26Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
